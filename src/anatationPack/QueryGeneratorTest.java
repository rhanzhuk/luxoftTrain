package anatationPack;

import org.testng.annotations.Test;

import static org.junit.Assert.*;

/**
 * Created by dsk1 on 10/12/2018.
 */
public class QueryGeneratorTest {
    @Test
    public void testGetAll() throws Exception {
        QueryGenerator queryGenerator = new QueryGenerator();
        String actual = queryGenerator.getAll(Person.class);
        String expected = "SELECT person_id, person_name, salary FROM Persons;";


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
