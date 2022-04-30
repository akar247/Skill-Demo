import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void addition() {
        assertEquals(3, SkillDemo.add(2,1)); //test should now pass
        // 1 + 1 = 2 != 3
    }
}
