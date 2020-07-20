package br.com.startaideia.vuttr.controller;

import java.io.Serializable;
import java.util.List;

import br.com.startaideia.vuttr.model.Tools;

public class ToolsRequest implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3875900236953879177L;

	private String title;
	
	private String link;
	
	private String description;
	
	private List<String> tags;
	
	public Tools novaFerramenta() {
		return new Tools(title, link,description,tags);
	}
	
	public String getTitle() {
		return title;
	}

	
	public void setTitle(String title) {
		this.title = title;
	}

	
	public String getLink() {
		return link;
	}

	
	public void setLink(String link) {
		this.link = link;
	}

	
	public String getDescription() {
		return description;
	}

	
	public void setDescription(String description) {
		this.description = description;
	}

	
	public List<String> getTags() {
		return tags;
	}

	
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	
}
