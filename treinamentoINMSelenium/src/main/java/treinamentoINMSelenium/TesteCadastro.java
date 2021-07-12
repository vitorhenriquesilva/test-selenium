package treinamentoINMSelenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class TesteCadastro {

	//Informando que é uma classe de teste

	@Test
	public void sucessoValidacaoLogin() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//Abrindo o google chrome e acessando o site
		driver.get("https://github.com/login");
		//Preenchendo o campo de login
		driver.findElement(By.name("login")).sendKeys("vitor.silva@hotmail.com");
		//Preenchendo o campo de senha
		driver.findElement(By.name("password")).sendKeys("ltnzpdgv11");
		//Acessando a conta com as informações passadas acima
		driver.findElement(By.name("commit")).click();
		Thread.sleep(5000);
		Assert.assertEquals("NOVO REPOSITORIO", driver.findElement(By.xpath("//*[@id=\"repos-container\"]/h2/a")).getText());
		 
		
	}
	
	@Test
	public void falhaValidacaoLogin() throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//Abrindo o google chrome e acessando o site
		driver.get("https://github.com/login");
		//Preenchendo o campo de login
		driver.findElement(By.name("login")).sendKeys("vitor.silva@hotmail.com");
		//Preenchendo o campo de senha
		driver.findElement(By.name("password")).sendKeys("dasdad");
		//Acessando a conta com as informações passadas acima
		driver.findElement(By.name("commit")).click();
		
		Thread.sleep(5000);
		//Validando se o retorno da condicional é verdadeiro
		Assert.assertFalse(driver.findElement(By.className("container-lg")).getText().contains("Incorrect username or password."));
	}
}
