package br.com.startaideia.vuttr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.startaideia.vuttr.model.Tools;

public interface ToolsRepository extends JpaRepository<Tools,Long> {
	
	@Query("select tl from Tools tl join tl.tags tg where tg like concat('%',?1,'%')")
	List<Tools> findToolsByTag(String tag);
}
