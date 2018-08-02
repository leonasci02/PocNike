package Page;

import Settings.Base;

public class PagePagamento {
	
	public PagePagamento() {}
	Base baseMethod;
	
	public void finalizeBuy(String NumCartao,String NomeTitular, String CodigoSeguranca,String Mes, String Ano, String Parcela){
		baseMethod.writeByElementXpath("//input[@id='cardNumber1']", NumCartao);
		baseMethod.writeByElementXpath("//input[@id='cardName1']", NomeTitular);
		baseMethod.writeByElementXpath("//input[@id='cardSecurity1']", CodigoSeguranca);
		baseMethod.dropDownByText("//select[@id='cardMonth1']", Mes);
		baseMethod.dropDownByText("//select[@id='cardYear1']", Ano);
		baseMethod.dropDownByText("//select[@id='parcelOptions1']", Parcela);
		//baseMethod.clickMouseByXpath("//button[contains(text(),'Finalizar compra') and @_ngcontent-c3]");
	}
}
