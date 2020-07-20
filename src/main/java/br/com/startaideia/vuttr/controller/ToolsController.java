package br.com.startaideia.vuttr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.startaideia.vuttr.model.Tools;
import br.com.startaideia.vuttr.repository.ToolsRepository;

@RestController
@RequestMapping("tools")
public class ToolsController {
	
	@Autowired
	private ToolsRepository toolsRepository;
	
	@GetMapping
	public List<Tools> todasFerramentas() {
		return toolsRepository.findAll();
	}

}
