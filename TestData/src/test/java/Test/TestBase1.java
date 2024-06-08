package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase1 {
	
	
	/*WebDriver driver;
	@BeforeSuite
	public void initialize() throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahil.mohammad\\Downloads\\ChromeDriver122\\ChromeDriver122\\chromedriver.exe");
	driver = new ChromeDriver();
	//To maximize browser
	driver.manage().window().maximize();
	//Implicit wait
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//To open facebook
	driver.get("https://demo.guru99.com/V1/index.php");
	}
	@AfterSuite
	//Test cleanup
	public void TeardownTest()
	{
	driver.quit();
	}*/
	
	public String baseurl = "https://demo.guru99.com/V1/index.php";
	
	public String username = "mngr575904";
	public String password = "qYmyzAt";
	public String utext = "Mohammad Rahil";
	
	
	public static WebDriver driver;
	
	@BeforeClass 
	
	public void setup () {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@AfterClass
	//Test cleanup
	public void TeardownTest()
	{
//	driver.quit();
	}

}
