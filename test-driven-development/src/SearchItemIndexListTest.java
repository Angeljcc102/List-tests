import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SearchItemIndexListTest {

    @Test
    public void getIndexOfAnExistingElement() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals(2, list.indexOf(3));
    }

    @Test
    public void getIndexOfAnElementNotInList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals(-1,list.indexOf(10));
    }

    @Test
    public void getIndexOfACloseDoubleElement() {
        List<Double> list = new ArrayList<>();
        list.add(10.2);
        list.add(9.945672);
        list.add(3.14159576);

        assertEquals(-1,list.indexOf(3.14159575));
    }
}
