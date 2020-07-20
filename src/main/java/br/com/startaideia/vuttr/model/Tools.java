package br.com.startaideia.vuttr.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;
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
	
//	@ManyToMany(fetch = FetchType.LAZY )
//	@JoinTable(
//		name = "tools_has_tags",
//		joinColumns = {
//			@JoinColumn(name = "tool_id")
//		},
//		inverseJoinColumns = {
//			@JoinColumn(name = "tag_id")
//		}
//	)
	
	@ElementCollection
	@Column(name = "tag")
	private List<String> tags;
	
	public Tools() {
	}
	
	public Tools(String title, String link, String description, List<String> tags) {
		this.title = title;
		this.link = link;
		this.description = description;
		this.tags = tags;
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
	
	public Long getId() {
		return id;
	}
	
}
