import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AddItemsListTest {

    @Test
    public void addItemToList() {
        List list = new ArrayList();
        assertEquals(0, list.size());

        list.add(10);
        assertEquals(1, list.size());
        assertEquals(10, list.get(list.size()-1));

    }

    @Test
    public void addItemToClearedList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.clear();
        assertEquals(0, list.size());

        list.add(10);

        Integer expectedValue = 10;
        assertEquals(1, list.size());
        assertEquals(expectedValue, list.get(list.size()-1));
    }

    @Test(expected = NullPointerException.class)
    public void addItemToNullList() {
        List<Integer> list = null;

        list.add(10);
    }
}
