package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import  static org.junit.Assert.*;
/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job3 instanceof Job);
        assertTrue(job3.getEmployer() != null);
        assertTrue(job3.getLocation() != null);
        assertTrue(job3.getPositionType() != null);
        assertTrue((job3.getCoreCompetency() != null));
        assertEquals(job3.getEmployer().getValue(),  "ACME" );
        assertEquals(job3.getLocation().getValue(), "Desert");
        assertEquals(job3.getPositionType().getValue(), "Quality control");
        assertEquals(job3.getCoreCompetency().getValue(), "Persistence");
        assertEquals(job3.getEmployer().toString(), "ACME");
    }

    @Test
    public void testJobsForEquality(){
        Job job4 = new Job("Job job", new Employer("ACME"), new Location("Desert"), new PositionType("Quality"), new CoreCompetency("Persistence"));
        Job job5 = new Job("Job job", new Employer("ACME"), new Location("Desert"), new PositionType("Quality"), new CoreCompetency("Persistence"));
        //assertFalse(job4.getId() != job5.getId());
        assertFalse(job4.equals(job5));
    }
}


