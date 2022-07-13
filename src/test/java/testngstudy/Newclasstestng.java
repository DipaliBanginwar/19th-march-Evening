package testngstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Newclasstestng {
  
  @Test
  public void f() {
	  Reporter.log("f is running", true);
  }
  
  @Test(enabled=true)
  public void a()
  {
	Reporter.log("a is running", true);  
  }
  
  @Test
  public void b() {
	  Reporter.log("b is running", true);
  }
}
