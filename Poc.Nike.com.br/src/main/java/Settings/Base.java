package Settings;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Base extends DefaultSettings {

	public Base() {
	}

	public void inicialization(String UrlSite) {
		getInicialization("Chrome");
		getDriver().get(UrlSite);
	}

	public void refreshWebSite(String NewUrl) {
		getDriver().navigate().to(NewUrl);
	}

	public void writeByElementId(String Id, String Valor) {
		getById(Id).sendKeys(Valor);
	}

	public void writeByElementXpath(String Xpath, String Valor) {
		getByXpath(Xpath).sendKeys(Valor);
	}

	public void clickMouseById(String Id) {
		getById(Id).click();
	}

	public void clickMouseByXpath(String Xpath) {
		getByXpath(Xpath).click();
	}

	public String returnStringValue(String Xpath, String Valor) {
		String Itens = new String();
		List<WebElement> ReturnList = returnElementsByXpath(Xpath);
		for (WebElement listWebElement : ReturnList) {
			if (listWebElement.getText().equals(Valor)) {
				Itens = listWebElement.getText();
				listWebElement.click();
				break;
			}
		}
		return Itens;
	}

	public void dropDownByText(String Xpath, String Text) {
		Select DropDown = new Select(getByXpath(Xpath));
		DropDown.selectByVisibleText(Text);
	}

	private List<WebElement> returnElementsByXpath(String XpathExpression) {
		List<WebElement> Elementos = getDriver().findElements(By.xpath(XpathExpression));
		return Elementos;
	}

	private WebElement getById(String Id) {
		WebElement Elemento = getDriver().findElement(By.id(Id));
		return Elemento;
	}

	private WebElement getByXpath(String XpathExpression) {
		WebElement Elemento = getDriver().findElement(By.xpath(XpathExpression));
		return Elemento;
	}

	public void close() {
		closeBrowser();
	}
}