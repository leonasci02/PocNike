package Settings;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Base extends DefaultSettings {
	
	public Base() {}
	
	public void inicialization(String urlSite) {
		getInicialization("Chrome");
		getDriver().get(urlSite);
	}
	
	public void refreshWebSite(String newUrl){	
		getDriver().navigate().to(newUrl);
	}
	
	public void writeByElementId(String id,String valor){
		getById(id).sendKeys(valor);
	}
	
	public void writeByElementXpath(String xpath, String valor){
		getByXpath(xpath).sendKeys(valor);
	}
	
	public void clickMouseById(String id){
		getById(id).click();
	}
	
	public void clickMouseByXpath(String xpath){
		getByXpath(xpath).click();
	}
	
	public String returnStringValue(String xpath, String valor){
		String Itens = new String();
		List<WebElement> ReturnList = returnElementsByXpath(xpath);
		for (WebElement listWebElement : ReturnList) {
			if(listWebElement.equals(valor)){
				Itens = listWebElement.toString();
				listWebElement.click();
			}else{
				Itens = "não foi localizado: "+ valor;
			}
		}
		return Itens;
	}
	
	private List<WebElement> returnElementsByXpath(String xpathExpression){
		List<WebElement> Elementos = getDriver().findElements(By.xpath(xpathExpression));
		return Elementos;
	}
	
	private WebElement getById(String id){
		WebElement Elemento = getDriver().findElement(By.id(id));	
		return Elemento ;
	}

	private WebElement getByXpath(String xpathExpression){
		WebElement Elemento = getDriver().findElement(By.xpath(xpathExpression));	
		return Elemento ;
	}
	
	public void close() {
		closeBrowser();
	}
}