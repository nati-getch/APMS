package edu.mum.apms.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Task {

	@Id
	@GeneratedValue
	private int id;
	@NotNull(message = "Title can not be empty!")
	private String title;
	@NotNull(message = "Description can not be empty! ")
	@Size(min=10, max=2000,message="Description must be between 20 and 2000 characters!")
	private String description;
	
	@NotNull(message = "Status cannot be empty!")
	@Enumerated(EnumType.STRING)	
	private Status status;
	
	@OneToMany(mappedBy="task",cascade = CascadeType.REMOVE)
	@JsonBackReference
	private List<WorkLog> workLog;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="backlogId")
	@JsonBackReference
	private Backlog backlog;
	
	@ManyToOne
	@JoinColumn(name="memberId")
	@JsonBackReference
	private TeamMember teamMember;
	
	public Task(){}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
	public List<WorkLog> getWorkLog() {
		return workLog;
	}
	public void setWorkLog(List<WorkLog> workLog) {
		this.workLog = workLog;
	}
	@JsonIgnore
	public Backlog getBacklog() {
		return backlog;
	}
	public void setBacklog(Backlog backlog) {
		this.backlog = backlog;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Backlog getbacklog() {
		return backlog;
	}
	public void setbacklog(Backlog backlog) {
		this.backlog = backlog;
	}
	public TeamMember getTeamMember() {
		return teamMember;
	}
	public void setTeamMember(TeamMember teamMember) {
		this.teamMember = teamMember;
	}
}
