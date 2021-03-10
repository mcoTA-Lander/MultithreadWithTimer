import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//ANY EDITS WILL RESULT IN POINT REDUCTION

class TimerTest {
    Timer t;
    
    @Test
     void TestStart() {
         t = new Timer();
        try {
            t.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Exception e = assertThrows(Exception.class, () -> t.start());
         assertEquals("Timer Already Started", e.getMessage());
     }
 
     @Test
     void TestStop() throws Exception {
         long duration;
         t = new Timer();
         t.start();
         Thread.sleep(50);
         duration = t.stop();
         assertTrue(duration >= 50);
     }
 
     @Test
     void TestReset() throws Exception {
         t = new Timer();
         t.start();
         t.reset();
         t.start();
         Thread.sleep(50);
         assertTrue(t.stop() >= 50);
     }
}
