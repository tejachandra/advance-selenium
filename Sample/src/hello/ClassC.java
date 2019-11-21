package hello;

import org.testng.annotations.Test;

public class ClassC {
	@Test(groups="functional")
	public void functional()
	{
		System.out.println("functional 3");
	}
	@Test(groups="integration")
	public void integration()
	{
		System.out.println("integration 3");
	}
	@Test(groups="system")
	public void system()
	{
		System.out.println("system 3");
	}
}
