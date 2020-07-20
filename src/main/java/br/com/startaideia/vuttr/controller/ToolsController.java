package br.com.startaideia.vuttr.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.startaideia.vuttr.model.Tools;
import br.com.startaideia.vuttr.repository.ToolsRepository;

@RestController
@RequestMapping("tools")
public class ToolsController {
	
	@Autowired
	private ToolsRepository toolsRepository;
	
	@GetMapping
	public ResponseEntity<List<Tools>> todasFerramentas(@RequestParam Optional<String> tag) {
		return tag.map(
			t -> ResponseEntity.status(HttpStatus.OK)
				.body(toolsRepository.findToolsByTag(t))
		).orElse(ResponseEntity.status(HttpStatus.OK).body(toolsRepository.findAll()));
	}
	
	@PostMapping(
		produces = MediaType.APPLICATION_JSON_VALUE,
		consumes = MediaType.APPLICATION_JSON_VALUE
	)
	public ResponseEntity<Tools> salvarFerramentas(@RequestBody ToolsRequest toolsRequest) {
		return new ResponseEntity<>(toolsRepository.save(toolsRequest.novaFerramenta()), HttpStatus.CREATED);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> deletarFerramenta(@PathVariable ("id") Long id) {
		if (toolsRepository.findById(id).isPresent()) {
			toolsRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(id, HttpStatus.BAD_REQUEST);
		}
	}
}
