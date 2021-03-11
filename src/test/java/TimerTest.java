import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//ANY EDITS WILL RESULT IN POINT REDUCTION

class TimerTest {
    Timer t = new Timer();
    
    @Test
     void TestStart() {
        try {
            t.start();
        } catch (Exception e) {
 
        }
        Exception e = assertThrows(Exception.class, () -> t.start());
         assertEquals("Timer Already Started", e.getMessage());
     }
 
     @Test
     void TestStop() throws Exception {
         long duration;
         t.start();
         Thread.sleep(50);
         duration = t.stop();
         assertTrue(duration >= 50);
     }
 
     @Test
     void TestReset() throws Exception {
         t.start();
         t.reset();
         t.start();
         Thread.sleep(50);
         assertTrue(t.stop() >= 50);
     }
}
