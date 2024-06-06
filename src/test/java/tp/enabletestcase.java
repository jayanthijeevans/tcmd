package tp;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class enabletestcase {
  @Test
  public void firstTestCase() {
	  System.out.println("This test case 1 is enabled");
  }
  
  @Test (enabled=false)
  public void f2() {
	  System.out.println(" This test case will not Run");
  }
  @Test
  public void f3() {
	  System.out.println("Test case 3 is enable");
  }
  @Test
  public void f4() {
	  System.out.println("Test case 4 is enabled");
  }
  @Ignore
  @Test
  public void f5() {
	  System.out.println("This test case is ignored");
  }
}
