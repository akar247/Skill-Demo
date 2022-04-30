import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void addition() {
        assertEquals(3, SkillDemo.add(1,1)); //test should fail
        // 1 + 1 = 2 != 3
    }
}
