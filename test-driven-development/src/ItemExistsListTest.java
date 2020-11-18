import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ItemExistsListTest {

    @Test
    public void getIfItemExistInList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertTrue(list.contains(3));
    }

    @Test
    public void getIfItemNotExistInList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertFalse(list.contains(10));
    }

    @Test
    public void getIfItemNotExistWhenRemoving(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.remove(0);
        assertFalse(list.contains(1));
    }
}
