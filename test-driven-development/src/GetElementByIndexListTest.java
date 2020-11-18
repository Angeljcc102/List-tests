import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class GetElementByIndexListTest {

    @Test
    public void getElementByIndex() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer expectedValue = 3;

        assertEquals(expectedValue, list.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getElementOfAnEmptyList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.clear();

        list.get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getElementByNotValidIndex() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.clear();

        list.get(list.size());
    }

}
