package com.itgarden.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@MappedSuperclass
public class BaseObject implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@JsonIgnore
	@Column(name = "is_deleted")
	private boolean deleted;

	@JsonIgnore
	@Column(name = "date_created")
	private Timestamp dateCreated = new Timestamp(System.currentTimeMillis());

	@JsonIgnore
	@Column(name = "date_modified", nullable = true)
	private Timestamp dateModified;

	transient String flowType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Timestamp getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Timestamp getDateModified() {
		return dateModified;
	}

	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}

	public String getFlowType() {
		return flowType;
	}

	public void setFlowType(String flowType) {
		this.flowType = flowType;
	}

	@Override
	public String toString() {
		return "BaseObject [id=" + id + ", deleted=" + deleted + ", dateCreated=" + dateCreated + ", dateModified="
				+ dateModified + "]";
	}

}
