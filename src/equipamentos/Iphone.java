package equipamentos;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

	public Iphone() {
		
	}
	
	@Override
	public void exibirPagina() {
		System.out.println("Iphone: Exibindo Página");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Iphone: Nova Aba Adicionada");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Iphone: Página Atualizada");
	}

	@Override
	public void tocar() {
		System.out.println("Iphone: Tocando Múscia");
	}

	@Override
	public void pausar() {
		System.out.println("Iphone: Música Pausada");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Iphone: Música Selecionada");	
	}

	@Override
	public void ligar() {
		System.out.println("Iphone: Realizando Ligação");
	}

	@Override
	public void atender() {
		System.out.println("Iphone: Atendendo Ligação");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iphone: Corrreio de Voz Iniciado");	
	}

	

}
