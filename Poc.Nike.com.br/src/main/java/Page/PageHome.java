package Page;

import Settings.Base;

public class PageHome{
	
	public PageHome() {}
	Base baseMethod;
	
	public void AcessWebSite(String Url){
		baseMethod.inicialization(Url);
	}

	public void RefreshNewUrl(String newUrl){
		baseMethod.refreshWebSite(newUrl);
	}
	
}