package anatationPack;

import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class QueryGeneratorTest {
    @Test
    public void testGetAll() throws Exception {
        QueryGenerator queryGenerator = new QueryGenerator();
        String actual = queryGenerator.getAll(Person.class);
        String expected = "SELECT person_id, person_name, salary FROM Persons;";

        assertEquals(expected, actual);
    }

    @Test
    public void testInsert() throws Exception {
        QueryGenerator queryGenerator = new QueryGenerator();
        Person person = new Person();
        String actual = queryGenerator.insert(person);
        String expected = "INSERT INTO Persons (person_id, person_name, salary) VALUES (person_id, person_name, salary);";

        assertEquals(expected, actual);
    }

    @Table(name = "Persons")
    private static class Person {
        @Column(name = "person_id")
        int id;
        @Column(name = "person_name")
        String name;
        @Column
        double salary;
    }
}
