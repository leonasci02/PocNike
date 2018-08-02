package ActionScript;

import Page.PageCarrinho;
import Page.PageComprarProduto;
import Page.PageEndereco;
import Page.PageHome;
import Page.PageLogin;
import Page.PagePagamento;

public class Action {

	public Action() {}
	static PageHome Home;
	static PageLogin Login;
	static PagePagamento Pagamento;
	static PageEndereco Endereco;
	static PageCarrinho Carrinho;
	static PageComprarProduto CompraProduto;
	
	public static void buyProduct() throws InterruptedException{
		System.out.println("Inicio Teste");
		Home.AcessWebSite("https://www.nike.com.br/MEIA-U-NK-ELT-LTWT-NS-644083.html?posgrid=C1");
		CompraProduto.selectSizeProduct("39,5-41");
		CompraProduto.clickButtonBuy();
		Carrinho.concludeBuy();
		Login.myAccount("leo.nascimentoo02@gmail.com", "Tec150694");
		Endereco.clickTypeDelivery("Normal");
		Endereco.buttonContinue();
		Pagamento.finalizeBuy("5390694070555096", "Antonio Jose", "575", "10","19", "2x");
		System.out.println("Final do Teste");
		
	}
}