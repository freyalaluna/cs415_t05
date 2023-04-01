/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 27 23:56:12 GMT 2023
 */

package edu.colostate.cs415.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.colostate.cs415.dto.QualificationDTO;
import edu.colostate.cs415.model.Qualification;
import edu.colostate.cs415.model.Worker;
import java.util.LinkedHashSet;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Qualification_ESTest extends Qualification_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Qualification qualification0 = new Qualification("7y k&}d_HwU");
      qualification0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Qualification qualification0 = new Qualification("7y k&}d_HwU");
      LinkedHashSet<Qualification> linkedHashSet0 = new LinkedHashSet<Qualification>();
      linkedHashSet0.add(qualification0);
      Worker worker0 = new Worker("E", linkedHashSet0, 0.0);
      qualification0.addWorker(worker0);
      Set<Worker> set0 = qualification0.getWorkers();
      assertEquals(1, set0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Qualification qualification0 = new Qualification("7y k&}d_HwU");
      String string0 = qualification0.toString();
      assertEquals("7y k&}d_HwU", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Qualification qualification0 = new Qualification("ACTIVE");
      // Undeclared exception!
      try { 
        qualification0.removeWorker((Worker) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.colostate.cs415.model.Qualification", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Qualification qualification0 = new Qualification("T");
      LinkedHashSet<Qualification> linkedHashSet0 = new LinkedHashSet<Qualification>();
      linkedHashSet0.add(qualification0);
      Worker worker0 = new Worker("T", linkedHashSet0, 0.0);
      qualification0.removeWorker(worker0);
      assertEquals(0.0, worker0.getSalary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Qualification qualification0 = new Qualification("'");
      // Undeclared exception!
      try { 
        qualification0.addWorker((Worker) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.colostate.cs415.model.Qualification", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Qualification qualification0 = new Qualification("T");
      LinkedHashSet<Qualification> linkedHashSet0 = new LinkedHashSet<Qualification>();
      linkedHashSet0.add(qualification0);
      Worker worker0 = new Worker("T", linkedHashSet0, 0.0);
      qualification0.addWorker(worker0);
      QualificationDTO qualificationDTO0 = qualification0.toDTO();
      assertEquals("T", qualificationDTO0.getDescription());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Qualification qualification0 = new Qualification("T");
      boolean boolean0 = qualification0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Qualification qualification0 = null;
      try {
        qualification0 = new Qualification("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.colostate.cs415.model.Qualification", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Qualification qualification0 = null;
      try {
        qualification0 = new Qualification((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.colostate.cs415.model.Qualification", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Qualification qualification0 = new Qualification("T");
      Set<Worker> set0 = qualification0.getWorkers();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Qualification qualification0 = new Qualification("T");
      LinkedHashSet<Qualification> linkedHashSet0 = new LinkedHashSet<Qualification>();
      linkedHashSet0.add(qualification0);
      Worker worker0 = new Worker("T", linkedHashSet0, 0.0);
      boolean boolean0 = qualification0.equals(worker0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Qualification qualification0 = new Qualification("/6p[@=Ko");
      boolean boolean0 = qualification0.equals(qualification0);
      assertTrue(boolean0);
  }
}