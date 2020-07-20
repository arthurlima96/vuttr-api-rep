package br.com.startaideia.vuttr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.startaideia.vuttr.model.Tools;

public interface ToolsRepository extends JpaRepository<Tools,Long> {
	
}
