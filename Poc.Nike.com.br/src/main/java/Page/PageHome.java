package Page;

import Settings.Base;

public class PageHome{
	
	public PageHome() {}
	private Base baseMethod;
	
	public void AcessWebSite(String url) throws InterruptedException{
		baseMethod.inicialization(url);
	}

	public void RefreshNewUrl(String newUrl){
		baseMethod.refreshWebSite(newUrl);
	}
	
}