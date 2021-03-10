import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//ANY EDITS WILL RESULT IN POINT REDUCTION

class MultithreadingTest {

    Multithreading m;
    int[] nums;
    long expectedTotal = 0;

    void setUp(){
        nums = new int[1000];
        for(int i = 0; i < nums.length; i++){
            nums[i] = (1 + (int) (Math.random() * 100));
        }
        for(int i : nums){
            expectedTotal += i;
        }
    }

    @Test
    void TestListSum(){
        m = new Multithreading();
        assertEquals(expectedTotal, m.listSum(nums, 1000));
    }
}
