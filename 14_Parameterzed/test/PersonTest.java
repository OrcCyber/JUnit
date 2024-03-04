/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author TUAN
 */
@RunWith(Parameterized.class)
public class PersonTest {

    // Declare variables.
    public Person person;
    private String name, expectedName;
    private int age, expectedAge;

    /**
     * @Contructer function with parameters.
     */
    public PersonTest(String name, int age, String expectedName, int expectedAge) {
        this.name = name;
        this.age = age;
        this.expectedName = expectedName;
        this.expectedAge = expectedAge;
    }

    /**
     * *
     * @Parameters index order follow: name - age - expectedName - expectedAge.
     * For example: { "Kali"    ,  30    ,   "Kaka"    ,    60 } 
     *                  |           |          |            | 
     *                name         age    expectedName   expectedAge
    *
     */
    @Parameters
    public static Collection<Object[]> dataset() {
        return Arrays.asList(new Object[][]{
            {"Kim Jong Un", 25, "Jong", 30},
            {"Vladimir Putin", 75, "Vladimir Putin", 70},
            {"Trump", 76, "Trump", 50},
            {"Dmitry Medvedev", 60, "Dmitry Medvedev", 68},});
    }

    /**
     * Setup resource before each test case.
     */
    @Before
    public void __init__() {
        person = new Person(this.name, this.age);
    }

    /**
     * Garbage collection resources after each test.
     */
    @After
    public void __garbage__() {
        person = null;
    }

    /**
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName() {
        assertEquals("Dữ liệu đầu vào: " + person.getName(),expectedName, person.getName());
    }

    /**
     * Test of getAge method, of class Person.
     */
    @Test
    public void testGetAge() {
        assertEquals("Dữ liệu đầu vào: " + person.getAge(),expectedAge, person.getAge());
    }

    /**
     * Test of setName method, of class Person.
     */
    @Test
    public void testSetName() {
        person.setName("Hải");
        assertEquals( "Hải", person.getName());
    }

    /**
     * Test of setAge method, of class Person.
     */
    @Ignore
    @Test
    public void testSetAge() { 
        person.setAge(40);
        assertEquals(40, person.getAge());
    }

}
