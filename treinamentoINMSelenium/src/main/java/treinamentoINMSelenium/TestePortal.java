package treinamentoINMSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestePortal {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		//Criando um novo repositório
		//Caso quisesse utilizar o xPath
		//driver.findElement(By.className("btn"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"repos-container\"]/h2/a")).click(); // Botão New
		
		Thread.sleep(5000);
		driver.findElement(By.id("repository_name")).sendKeys("curso-selenium"); //Campo "Repository Name"
		driver.findElement(By.id("repository_description")).sendKeys("Meu primeiro teste com Selenium"); //Campo "Descritpion"
		
		//Selecionando um item do Combo Box
		//WebElement elemento = driver.findElement(By.id("slctSexo"));
		//Select combo = new Select(elemento);
		//combo.deselectByVisibleText("Masculino");
		
		//Selecionando um Radio Button
		WebElement radioButton = driver.findElement(By.id("repository_visibility_private"));
		radioButton.click();
		
		//Selecionando um Check Box
		WebElement checkbox = driver.findElement(By.id("repository_auto_init"));
		checkbox.click();
		
		//Fechando a instância do driver
		driver.quit();
		//Fecha o browser, porém não fecha a instância
		//driver.close();
		
	}	
	
	
}
