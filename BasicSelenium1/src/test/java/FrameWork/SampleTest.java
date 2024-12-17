package FrameWork;
import org.testng.annotations.Test;
public class SampleTest 
{
@Test  //(priority=-3)	low to high it executes
public void createContact()
{
	System.out.println("Contact Created");
}
@Test(enabled= false) //false then it doesn't execute the method // (dependsOnMethods = "createContact")  //(priority=-2)
	public void modifyContact()
	{
		System.out.println("Contact modified");
	}
@Test(invocationCount=3) //executing same method no of times //(dependsOnMethods = "createContact") //(priority=-1)
public void deleteContact()
{
	System.out.println("contact deleted");
}
}