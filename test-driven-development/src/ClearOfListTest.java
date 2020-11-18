import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ClearOfListTest {

    @Test
    public void clearNotEmptyList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.clear();

    assertEquals(0, list.size());
    }

    @Test
    public void clearEmptyList() {
        List<Integer> list = new ArrayList<>();
        assertNotNull(list);

        list.clear();
        assertEquals(0, list.size());
    }

    @Test(expected = NullPointerException.class)
    public void clearNullList() {
        List<Integer> list = null;

        list.clear();
    }
}
