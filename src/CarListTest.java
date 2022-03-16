import org.junit.Test;

import static org.junit.Assert.*;

public class CarListTest {
    private CarList carList;

    @org.junit.Before
    public void setUp() throws Exception {
        //init
        for (int i = 0; i < 100; i++) {
            carList.add(new Car("brand" + i, i));
        }
    }

    @Test
    public void whenAdded100ElementsThenSizeMustBe100() {

        assertEquals(100, carList.size());
    }

    @Test
    public void whenElementRemovebByIndexThenSizeMustBeDecreased() {

        assertTrue(carList.removeAt(1));
        assertEquals(99, carList.size());
    }
}