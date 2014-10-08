package org.dbModule.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "TASK")
public class Task implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @ManyToOne
    @JoinColumn(name = "DEVELOPER")
    private Developer developer;
    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL)
    @Column(name = "COMMENT")
    private List<Comment> comment;
    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    private TaskStatus status;
    @ManyToOne
    @JoinColumn(name = "PROJECT")
    @JsonIgnore
    private Project project;

    public Task() {
    }


    public Integer getId() {
	return id;
    }


    public void setId(Integer id) {
	this.id = id;
    }


    public Developer getDeveloper() {
	return developer;
    }

    public void setDeveloper(Developer developer) {
	this.developer = developer;
    }

    public List<Comment> getComment() {
	return comment;
    }

    public void setComment(List<Comment> comment) {
	this.comment = comment;
    }

    public TaskStatus getStatus() {
	return status;
    }


    public void setStatus(TaskStatus status) {
	this.status = status;
    }

    @JsonIgnore
    public Project getProject() {
	return project;
    }

    @JsonProperty
    public void setProject(Project project) {
	this.project = project;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }
}
