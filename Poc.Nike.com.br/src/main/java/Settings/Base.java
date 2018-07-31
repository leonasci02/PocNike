package Settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Base extends DefaultSettings {
	
	public void inicialization() {

		getInicialization("Chrome");
		getDriver().get("https://www.nike.com.br");
	}

	public void close() {
		closeBrowser();
	}
	
	public String write(String id,String valor){
		
		getById("email").sendKeys("Leonardo");
		return valor;
	}
	
	private WebElement getById(String id){
		
		WebElement elemento = getDriver().findElement(By.id(id));	
		return elemento ;
	}
}