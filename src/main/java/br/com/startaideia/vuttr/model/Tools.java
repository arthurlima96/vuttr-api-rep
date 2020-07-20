package br.com.startaideia.vuttr.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tools")
public class Tools implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5388926501203026613L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "title", nullable = false)
	private String title;
	
	@Column(name = "link", nullable = false)
	private String link;
	
	@Column(name = "description", nullable = false)
	private String description;
	
	@ManyToMany
	@JoinTable(
		name = "tools_has_tags",
		joinColumns = {
			@JoinColumn(name = "tool_id")
		},
		inverseJoinColumns = {
			@JoinColumn(name = "tag_id")
		}
	)
	private List<Tags> tags = new ArrayList<Tags>();
	
	public Tools() {
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
	
	public List<Tags> getTags() {
		return tags;
	}
	
	public void setTags(List<Tags> tags) {
		this.tags = tags;
	}


	public Long getId() {
		return id;
	}
	
	
}
