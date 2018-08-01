package Page;

import Settings.Base;

public class PageLogin {

	public PageLogin() {}
	private Base baseMethod;
	
	public void myAccount(String Login, String Senha){
		baseMethod.writeByElementXpath("//input[@type='email' and @tabindex='1']", Login);
		baseMethod.writeByElementXpath("//input[@type='password' and @tabindex='2']", Senha);
		baseMethod.clickMouseByXpath("//button[contains(text(),'Continuar')]");
	}
}


