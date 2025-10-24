package TUGAS4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TUGAS4Test {

        @Test
        public void testFindMin_PositiveNumbers()
        {
            assertEquals(3, TUGAS4.findMin(1, 2, 3));
        }

        @Test
        public void testFindMin_NegativeNumbers()
        {
            assertEquals(-1, TUGAS4.findMin(-1, -2, -3));
        }

        @Test
        public void testFindMin_WithZeros()
        {
            assertEquals(0, TUGAS4.findMin(0, 0, 1));
        }

}