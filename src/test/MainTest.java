import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void runTest() {
        ElevatorSimulator simulator = new ElevatorSimulator();
        int count = simulator.evaluateCount(3, new int[]{11, 10, 9, 10, 10, 11, 11, 11});
        Assert.assertEquals(9, count);
    }
}
