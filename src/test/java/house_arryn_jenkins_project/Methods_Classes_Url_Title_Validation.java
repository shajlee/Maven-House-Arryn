package house_arryn_jenkins_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods_Classes_Url_Title_Validation {


	
	public static void main(String[] args) {
		Methods_Classes_Url_Title_Validation.JohnArryn();
		Methods_Classes_Url_Title_Validation.LysaArryn();
		
		Methods_Classes_Url_Title_Validation HouseArryn = new Methods_Classes_Url_Title_Validation();
		HouseArryn.RobertArryn();
		HouseArryn.SerHugh();
		
		Methods_Classes_Url_Title_Validation HouseArryn1 = new Methods_Classes_Url_Title_Validation();
		HouseArryn1.JeyneArryn();
		
		
	}
	public static void JohnArryn() {
		System.out.println("Hand of the King");
	}
	public static void LysaArryn() {
		System.out.println("Lady of the Eerie");
	}
	public static void RobertArryn() {
		System.out.println("Sweetrobin");
	}
	public static void SerHugh() {
		System.out.println("Hugh of the Vale");
	}
	public static void JeyneArryn() {
		System.out.println("Maiden of the Vale");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://awoiaf.westeros.org/index.php/House_Arryn");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String actualCurrentUrl = "https://awoiaf.westeros.org/index.php/House_Arryn";
		String expectedCurrentUrl = driver.getCurrentUrl();
		
		String actualTitle = "House Arryn - A Wiki of Ice and Fire";
		String expectedTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
			System.out.println("URL is valid & working");
		}else {
			System.out.println("Url is not valid");
			
		}
		
		
		
		
		

	}



		
	
		

	}


