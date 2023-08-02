package com.itgarden.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "role")

public class Role extends BaseObject {

	@Column(name = "ROLE_NAME")
	private String name;

	@Column(name = "ROLE_DESCRIPTION")
	private String description;

	@JsonBackReference
	@ManyToMany(targetEntity = User.class, mappedBy = "roles", cascade = { CascadeType.DETACH, CascadeType.MERGE,
			CascadeType.PERSIST, CascadeType.REFRESH })
	private List<User> users;

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

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Role [name=" + name + ", description=" + description + ", users=" + users + "]";
	}

}
