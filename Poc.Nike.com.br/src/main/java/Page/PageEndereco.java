package Page;

import Settings.Base;

public class PageEndereco {

	public PageEndereco() {}
	Base baseMethod;
	
	public void clickTypeDelivery(String Type){
		baseMethod.clickMouseByXpath("//strong[contains(text(),'"+Type+"')]");
	}
	
	public void buttonContinue(){
		baseMethod.clickMouseByXpath("//a[contains(text(),'Continuar')]");
	}
}
