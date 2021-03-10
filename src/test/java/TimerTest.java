import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//ANY EDITS WILL RESULT IN POINT REDUCTION

class TimerTest {


    Timer t;
    
    @Test
     void TestStart() {
         t = new Timer();
         t.start();
         t.start() should throw exception
     }
 
     @Test
     void TestStop() {
         long duration;
         t = new Timer();
         t.start();
         Thread.sleep(50);
         duration = t.stop();
         assertTrue(duration > 50);
     }
 
     @Test
     void TestReset() {
         t = new Timer();
         t.start();
         t.reset();
         t.start(); //no exception
         // test stop again
     }
}
