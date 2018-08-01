package Page;

import Settings.Base;

public class PageComprarProduto {
	
	public PageComprarProduto() {}
	Base baseMethod;
	
	public void selectSizeProduct(String Size){
		String Result = baseMethod.returnStringValue("//div[@class='combobox sel-tamanho']/div[@class='optionBox hide']/ul/li[@class='it-option']",Size);
		if(!Result.equals(Size)){
			System.out.println("Não foi possível localizar o tamanho");
		}
	}
	
	public void clickButtonBuy(){
		baseMethod.clickMouseByXpath("//div//a[contains(text(),'Comprar')]");
	}
}
