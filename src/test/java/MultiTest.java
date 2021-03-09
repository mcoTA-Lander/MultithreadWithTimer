import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

//ANY EDITS WILL RESULT IN POINT REDUCTION

class MultiTest {


    Timer t;
    Multithreading m;
    int[] nums;
    long expectedTotal;

    void setUp(){
        nums = new int[100000000];
        for(int i = 0; i < nums.length; i++){
            nums[i] = (1 + (int) (Math.random() * 100));
        }
        for(int i : nums){
            expectedTotal += i;
        }
    }

    @Test
    void TestListSum(){
        setUp();
        m = new Multithreading();
        long testTotal = m.listSum(nums, 10);

        assertEquals(expectedTotal, testTotal);

    }


    @Test
    void TestStart() {
        t = new Timer();
        t.start();
        assertTrue(t.begin != 0 );
    }

    @Test
    void TestStop() {
        long duration;
        t = new Timer();
        t.start();
        for(int i = 0; i <10; ){
            i++;
        }
        duration = t.stop();
        System.out.println(duration);
        assertTrue(t.end != 0);
        assertTrue(duration > 0);
    }

    @Test
    void TestReset() {
        t = new Timer();
        t.start();
        assertTrue(t.begin != 0);
        t.reset();
        assertEquals(t.begin, 0);
    }
}