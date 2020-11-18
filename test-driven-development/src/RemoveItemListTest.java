import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RemoveItemListTest {

    @Test
    public void deleteElementByIndex() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer expectedValue = 4;

        assertEquals(expectedValue, list.remove(list.indexOf(4)));
        assertEquals(4, list.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void deleteElementByNotValidIndex() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.remove(5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void deleteElementOfAnEmptyList() {
        List<Integer> list = new ArrayList<>();
        assertTrue(list.isEmpty());

        list.remove(0);
    }
}
