package edu.mum.apms.model;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table (name = "project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int projectId;
	private String name;
	private String description;
	@ManyToOne(cascade=CascadeType.MERGE)
    @JoinColumn(name="user_id")
	private User createdBy;
	@Temporal(TemporalType.DATE)
	@OrderBy
	private Date startDate;
	@Temporal(TemporalType.DATE)
	private Date endDate;
	@OneToMany(mappedBy = "project",cascade = CascadeType.REMOVE)
	private List<Feature> features;
	
	public Project() {}
	
	public Project(int projectId, String name, String description, Date startDate, Date endDate, List<Feature> features) {
		this.projectId = projectId;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.features = features;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}
	
	
}
