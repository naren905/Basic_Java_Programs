package Interview;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Program2 {
	@Test(priority=-1)
	public void m1()
	{
		System.out.println("print m1[-1]");
	}
	@Test(priority=-2)
	public void m2()
	{
		Assert.assertTrue(true);
		System.out.println("print m2[-2]");
	}
	@Test(priority=2)
	public void m3()
	{
		System.out.println("print m3[2]");
	}
	@Test(priority=3)
	public void m4()
	{
		System.out.println("print m4[3]");
	}
	@Test(priority=0)
	public void m5()
	{
		System.out.println("print m5[0]");
	}

}
