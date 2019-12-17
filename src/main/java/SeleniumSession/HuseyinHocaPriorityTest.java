package SeleniumSession;

import org.testng.annotations.Test;
//@Test
public class HuseyinHocaPriorityTest {
//	//@Test
//       public void  testD(){}
//	//@Test
//       public void  testA(){}
//       public void  testC(){}
//       public void  testE(){}
	@Test
	public void start(){
		System.out.println("start the server");
	}
	@Test(dependsOnMethods="start")
	public void  process(){
		System.out.println("Processing the data");
	}
	@Test(dependsOnMethods="process")
	public void stop(){
		System.out.println("Stop the server");
	}
}
