package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

import org.openqa.selenium.By;

public class ProKabaddiExTraversing 
{
	public class ProkabaddiExTraversing {

		public void main(String[] args) 
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.prokabaddi.com/standings");
			driver.manage().window().maximize();
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter any kabaddi team name: ");
			String nm=sc.next();
			
			String tName = driver.findElement(By.xpath("//p[contains(text(),'"+nm+"')]")).getText();
//			using sibling traversing printing won,lost,tie,score diff, points
			
			String won = driver.findElement(By.xpath("//p[contains(text(),'"+nm+"') ]/../../../following-sibling::div[@class='table-data matches-won']/p[@class='count']")).getText();
			String lost = driver.findElement(By.xpath("//p[contains(text(),'"+nm+"') ]/../../../following-sibling::div[@class='table-data matches-lost']/p[@class='count']")).getText();
			String tie = driver.findElement(By.xpath("//p[contains(text(),'"+nm+"') ]/../../../following-sibling::div[@class='table-data matches-draw']/p[@class='count']")).getText();
			String scoreDiff = driver.findElement(By.xpath("//p[contains(text(),'"+nm+"') ]/../../../following-sibling::div[@class='table-data score-diff']/p[@class='count']")).getText();
			String points = driver.findElement(By.xpath("//p[contains(text(),'"+nm+"') ]/../../../following-sibling::div[@class='table-data points']/p[@class='count']")).getText();
			
			System.out.println("Team name is :- "+tName);
			System.out.println("Matches Won:- "+won);
			System.out.println("Matches Lost:- "+lost);
			System.out.println("Matches Tie:- "+tie);
			System.out.println("Score Diff:- "+scoreDiff);
			System.out.println("Points:- "+points);
			
//			using basic traversing way for printing name and points
//			String points= driver.findElement(By.xpath("//p[contains(text(),'"+nm+"')]/../../../../div[9]/p[@class='count']")).getText();
//			System.out.println("Your Kabaddi Team name is:- "+tName);
//			System.out.println("Your Team Points are:- "+points);		

		}
	}
}
