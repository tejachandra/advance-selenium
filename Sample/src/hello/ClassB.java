package hello;

import org.testng.annotations.Test;

public class ClassB {
	@Test(groups="functional")
	public void functional()
	{
		System.out.println("functional 2");
	}
	@Test(groups="integration")
	public void integration()
	{
		System.out.println("integration 2");
	}
	@Test(groups="system")
	public void system()
	{
		System.out.println("system 2");
	}
}
