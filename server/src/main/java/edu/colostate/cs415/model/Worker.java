package edu.colostate.cs415.model;

import java.util.HashSet;
import java.util.Set;
import edu.colostate.cs415.dto.WorkerDTO;

public class Worker {

	public static final int MAX_WORKLOAD = 12;

	private String name;
	private double salary;
	private Set<Project> projects;
	private Set<Qualification> qualifications;

	public Worker(String name, Set<Qualification> qualifications, double salary) {
		this.name = name;
		this.qualifications = qualifications;
		this.salary = salary;
		this.projects = new HashSet<Project>();
	}

	@Override
	public boolean equals(Object other) {
		return false;
	}

	@Override
	public int hashCode() {
		if(name.isEmpty() || name == null){
			return 0;
		}
		return name.hashCode();
	}

	// Returns a String that includes the name, colon, 
	// #projects, colon, #qualifications, colon, salary. 
	// For example, a worker named "Nick", working on 2 projects, 
	// and having 10 qualifications and a salary of 10000.20 will 
	// result in the string Nick:2:10:10000. 
	// Note that the salary has no decimals but is always rounded down (truncated.
	@Override
	public String toString() {
		return this.name + ":" + this.projects.size() + ":" + this.qualifications.size() + ":" + ((int)this.salary);
	}

	public String getName() {
		return null;
	}

	public double getSalary() {
		return 0.0;
	}

	public void setSalary(double salary) {
	}

	public Set<Qualification> getQualifications() {
		return null;
	}

	public void addQualification(Qualification qualification) {
	}

	public Set<Project> getProjects() {
		return null;
	}

	public void addProject(Project project) {
	}

	public void removeProject(Project project) {
	}

	public int getWorkload() {
		return 0;
	}

	public boolean willOverload(Project project) {
		return false;
	}

	public boolean isAvailable() {
		return false;
	}

	public WorkerDTO toDTO() {
		return null;
	}
}
