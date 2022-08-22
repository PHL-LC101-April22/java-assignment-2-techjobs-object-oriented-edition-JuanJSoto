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
        //assertFalse(job4.getId() == job5.getId()); //either way works
        assertFalse(job4.equals(job5));
    }
    Job job6 = new Job("Job job", new Employer("ACME"), new Location("Desert"), new PositionType("Quality"), new CoreCompetency("Persistence"));

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        assertEquals('\n', job6.toString().charAt(0));
        assertEquals('\n', job6.toString().charAt(job6.toString().length()-1));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        assertEquals("\nID: 1\nName: Job job\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality\nCore Competency: Persistence\n", job6.toString());
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job job7 = new Job("job7", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertTrue(job7.toString().contains("Data not available"));
    }
}


