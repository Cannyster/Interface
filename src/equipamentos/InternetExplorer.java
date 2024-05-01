package equipamentos;

import interfaces.NavegadorInternet;

public class InternetExplorer implements NavegadorInternet{

	@Override
	public void exibirPagina() {
		System.out.println("InternetExplorer: Exibindo Página");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("InternetExplorer: Aba Adicionada");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("InternetExplorer: Página Atualizada");
		
	}

}
