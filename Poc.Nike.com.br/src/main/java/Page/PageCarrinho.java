package Page;

import Settings.Base;

public class PageCarrinho {

	public PageCarrinho() {}
	Base baseMethod;
	
	public void concludeBuy(){	
		baseMethod.clickMouseByXpath("//a[contains(text(),'Concluir compra')]");
	}
	
}
