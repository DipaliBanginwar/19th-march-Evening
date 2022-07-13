package maven2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\ecplise\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=velocity&sxsrf=ALiCzsavsswiOushU51Lb8ZsWjBJ0hA38A:1654793732501&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjwt-iE66D4AhVwTmwGHfSZCpUQ_AUoAXoECAMQAw&biw=1536&bih=746&dpr=1.25");

	}

}
