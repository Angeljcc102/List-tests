import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SizeOfListTest {

    @Test
    public void getSizeOfList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals(5, list.size());
    }

    @Test
    public void getSizeOfListEmpty() {
        List<Integer> list = new ArrayList<>();

        assertEquals(0, list.size());
    }

    @Test
    public void getSizeOfListWhenAddingElements() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals(5, list.size());

        list.add(6);

        assertEquals(6, list.size());
    }

}
