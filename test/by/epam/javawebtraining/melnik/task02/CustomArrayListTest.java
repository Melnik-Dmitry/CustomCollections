package by.epam.javawebtraining.melnik.task02;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomArrayListTest {

    @Test
    public void testSize() {
        CustomList <String> tested1 = new CustomArrayList<>();

        assertEquals(0, tested1.size());
    }

    @Test
    public void secondTestSize() {
//        CustomList <String> tested1 = new CustomArrayList<>();
//        tested1.addAll("Fist", "Second", "Third");
//        assertEquals(3, tested1.size());
    }

    @Test
    public void thirdTestSize() {
        CustomList <String> tested1 = new CustomArrayList<>();
        tested1.add("Fist");
        ((CustomArrayList<String>) tested1).add(2, "Second");
        assertEquals(2, tested1.size());
    }

    @Test
    public void firstTestIsEmpty ()
    {
        CustomList <String> tested1 = new CustomArrayList<>();
        assertTrue(tested1.isEmpty());
    }

    @Test
    public void secondTestIsEmpty ()
    {
        CustomList <String> tested1 = new CustomArrayList<>();
        tested1.add("First");
        assertFalse(tested1.isEmpty());
    }
}