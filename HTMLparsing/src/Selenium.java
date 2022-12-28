import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//드라이버 로드
		WebDriver driver = new ChromeDriver();
		/*
		//브라우저를 출력하지 않고 가져오기
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		*/
		
		//사이트 접속
		driver.get("https://nid.naver.com/nidlogin.login");
		//자바스크립트 실행
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//아이디 입력
		js.executeScript("document.getElementsByName(['id'])[0].value=\'" + "아이디" + "\'");
		//PW입력
		js.executeScript("document.getElementsByName(['pw'])[0].value=\'" + "비밀번호" + "\'");
		
		//로그인 버튼 클릭
		driver.findElement(By.xpath("//*[@id=\"log.login\"]")).click();
		driver.get("https://cafe.naver.com/jooggonanra");
		
		
		//소스코드 가져오기
		System.out.println(driver.getPageSource());
	}

}
