package edu.colostate.cs415.model;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CompanyTest {
	@Rule public ExpectedException thrown = ExpectedException.none();

	private Company company;
	private Set<Qualification> qualifications;

	@Before
	public void setUp() {
		company = new Company("test co");
		qualifications = new HashSet<>();
		Qualification q = new Qualification("q1");
		qualifications.add(q);
	}

/****** Company ******/
	@Test
	public void testCompanyConstructor() {
		// add assert name when getName is done
		// assertEquals("test co", company.getName());
	}

	@Test
	public void testCompanyConstructorThrowsExceptionWithNullName() {
		thrown.expect(IllegalArgumentException.class);
		company = new Company(null);
	}

	@Test
	public void testCompanyConstructorThrowsExceptionWithEmptyName() {
		thrown.expect(IllegalArgumentException.class);
		company = new Company("");
	}

/****** equals ******/
	@Test
	public void testEqualsAllValidAndEqual() {
		Company company2 = new Company("test co");
		assertTrue(company.equals(company2));
	}

	@Test
	public void testEqualsSelfNameEmpty() {
		thrown.expect(IllegalArgumentException.class);
		Company c1 = new Company("");
		c1.equals(company);
	}

	@Test
	public void testEqualsOtherNameNull() {
		thrown.expect(IllegalArgumentException.class);
		Company c2 = new Company("");
		company.equals(c2);
	}

	@Test
	public void testEqualsOtherNameEmpty() {
		thrown.expect(IllegalArgumentException.class);
		Company c2 = new Company(null);
		company.equals(c2);
	}

	@Test
	public void testEqualsObjectNotCompany() {
		String stringCompany = "test co";
		assertFalse(company.equals(stringCompany));
	}

	@Test
	public void testEqualsAllValidNotEqual() {
		Company company2 = new Company("test co 2");
		assertFalse(company.equals(company2));
	}

	/* getEmployedWorkers */

	@Test
	public void testGetEmployedWorkers() {
		// update to add workers when createWorker is done
		// company.createWorker("w1", qualifications, 10);
		// company.createWorker("w2", qualifications, 10);
		// assertEquals(2, company.getEmployedWorkers());
	}

	@Test
	public void testGetEmployedWorkersEmpty() {
		assertTrue( company.getEmployedWorkers().isEmpty());
	}


/****** getName ******/
	@Test
	public void testGetName(){
		//Constructor tests for nullness/emptiness.
		assertEquals(company.getName(), "test co");
	}

/***** createQualification */
	@Test
	public void testCreateQualification(){
		Qualification q1 = new Qualification("valid");
		assertEquals(company.createQualification("valid"), q1);
		// add assert to check qual was added to companies quals
	}

	@Test
	public void testCreateQualificationEmptyName(){
		assertEquals(company.createQualification(""),null);
		// add assert to check qual was not added to companies quals
	}

	@Test
	public void testCreateQualificationNullName(){
		assertEquals(company.createQualification(null),null);
		// add assert to check qual was not added to companies quals
	}

	@Test
	public void testCreateQualificationWithAlreadyPresentQualName(){
		Qualification q1 = new Qualification("valid");
		assertEquals(company.createQualification("valid"),q1);
		assertEquals(company.createQualification("valid"),null);
		// add assert to check qual was not added to companies quals
	}

/***** start ******/
@Test
public void testStartAllValid() {
	ProjectSize size = ProjectSize.SMALL;
	ProjectStatus activeStatus = ProjectStatus.ACTIVE;
	Project testProject = new Project("testProj", qualifications, size);
	Worker testWorker = new Worker("testW", qualifications, 10);
	testProject.addWorker(testWorker);
	company.start(testProject);
	assertEquals(testProject.getStatus(), activeStatus);
}

@Test
public void testStartNullProject() {
	thrown.expect(IllegalArgumentException.class);
	company.start(null);
}

@Test
public void testStartStatusActive() {
	ProjectSize size = ProjectSize.SMALL;
	ProjectStatus activeStatus = ProjectStatus.ACTIVE;
	Project testProject = new Project("testProj", qualifications, size);
	Worker testWorker = new Worker("testW", qualifications, 10);
	testProject.addWorker(testWorker);
	testProject.setStatus(activeStatus);
	company.start(testProject);
	assertEquals(testProject.getStatus(), activeStatus);
}

@Test
public void testStartStatusSuspended() {
	ProjectSize size = ProjectSize.SMALL;
	ProjectStatus activeStatus = ProjectStatus.ACTIVE;
	Project testProject = new Project("testProj", qualifications, size);
	Worker testWorker = new Worker("testW", qualifications, 10);
	testProject.addWorker(testWorker);
	testProject.setStatus(ProjectStatus.SUSPENDED);
	company.start(testProject);
	assertEquals(testProject.getStatus(), activeStatus);
}

@Test
public void testStartStatusFinished() {
	ProjectSize size = ProjectSize.SMALL;
	Project testProject = new Project("testProj", qualifications, size);
	Worker testWorker = new Worker("testW", qualifications, 10);
	testProject.addWorker(testWorker);
	testProject.setStatus(ProjectStatus.FINISHED);
	company.start(testProject);
	assertEquals(testProject.getStatus(), ProjectStatus.FINISHED);
}

@Test
public void testStartRequirementsNotMet() {
	ProjectSize size = ProjectSize.SMALL;
	Project testProject = new Project("testProj", qualifications, size);
	company.start(testProject);
	assertEquals(testProject.getStatus(), ProjectStatus.PLANNED);
}

/***** getQualifications  *****/
	@Test
	public void testGetQualificationsEmpty() {
		assertTrue(company.getQualifications().isEmpty());
	}

	@Test
	public void testGetQualificationsNotEmpty() {
		company.createQualification("q1");
		company.createQualification("q2");
		assertTrue(!company.getQualifications().isEmpty());
		assertEquals(company.getQualifications().size(), 2);
	}

/***** getUnassignedWorkers  */

	@Test
	public void testGetUnassignedWorkersEmpty() {
		assertTrue( company.getUnassignedWorkers().isEmpty());
	}

	@Test
	public void testGetEmployedWorkersEmptyDoesntReturnNull() {
		assertTrue( company.getUnassignedWorkers() != null);
	}

	@Test
	public void testGetUnassignedWorkersEmployeesEqualsAssigned() {
		// add workers and assign all of them
		assertTrue( company.getUnassignedWorkers().isEmpty());
	}

	@Test
	public void testGetUnassignedWorkersNoAssigned() {
		// add workers and dont assign any
		assertTrue( company.getUnassignedWorkers().isEmpty());
	}

	@Test
	public void testGetUnassignedWorkersEmployeesMoreThanAssigned() {
		// add workers and assign all but one
		// assertTrue( company.getUnassignedWorkers().size() == 1);
	}

	@Test
	public void testGetUnassignedWorkersAssignedMoreThanEmployedThrowsException() {
		// This may not be possible to actually test, may want to delete this test but not sure yet
		// thrown.expect(IllegalArgumentException.class);
		// try to get to a state where assigned is greater than 
		// company.getUnassignedWorkers();
	}



}
