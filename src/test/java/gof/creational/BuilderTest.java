package gof.creational;

import gof.creational.buider.Person;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BuilderTest {

    @Test
    public void createPersonTest() {
        Person.PersonBuilder personBuilder = new Person.PersonBuilder();
        Person person = personBuilder
                .setFirstName("John")
                .setLastName("Doe")
                .setCity("LA")
                .setFemale(false)
                .setEmployed(true)
                .build();
        assertThat(person.getFirstName(), is("John"));
        assertThat(person.getLastName(), is("Doe"));
        assertThat(person.getCity(), is("LA"));
        assertFalse(person.isFemale());
        assertTrue(person.isEmployed());
    }

}