package hello;

import org.testng.annotations.Test;

public class ClassA {
	@Test(groups="functional")
	public void functional()
	{
		System.out.println("functional 1");
	}
	@Test(groups="integration")
	public void integration()
	{
		System.out.println("integration 1");
	}
	@Test(groups="system")
	public void system()
	{
		System.out.println("system 1");
	}
}
