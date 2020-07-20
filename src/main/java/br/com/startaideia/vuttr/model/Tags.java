package br.com.startaideia.vuttr.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//@Entity
//@Table(name = "tags")
public class Tags implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7548089150885610345L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "title", nullable = false)
	private String title;
	
	@ManyToMany(mappedBy = "tags")
	@JsonIgnore
	private List<Tools> tools= new ArrayList<Tools>();
	
	public Tags() {
	}

	
	public String getTitle() {
		return title;
	}

	
	public void setTitle(String title) {
		this.title = title;
	}

	public List<Tools> getTools() {
		return tools;
	}
	
	public void setTools(List<Tools> tools) {
		this.tools = tools;
	}


	public Long getId() {
		return id;
	}
}
