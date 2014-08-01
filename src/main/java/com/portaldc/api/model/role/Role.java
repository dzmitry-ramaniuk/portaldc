package com.portaldc.api.model.role;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.portaldc.api.model.Identificator;
import com.portaldc.api.model.user.User;

@Entity
@Table(name = "role")
public class Role extends Identificator{
	
	@Column(name = "name", nullable = false, unique = true)
	private String name;

	@ManyToMany(fetch = FetchType.EAGER, mappedBy = "roles")
	private List<User> users;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}