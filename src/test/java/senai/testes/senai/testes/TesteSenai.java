package senai.testes.senai.testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSenai {
		
	private ChromeDriver driver;
	
	@Before
	
	public void ConfigurarTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\cromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void TesteNavegabilidade() {
		
		
		
		driver.get("https://informatica.sp.senai.br");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("excel");
		//driver.findElement(By.id("Busca1_txtFiltro")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("Busca1_btnBusca")).click();
	}
	
	
	@After
	public void PosTeste() {
		
	}
	
	
	
}
