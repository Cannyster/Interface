package equipamentos;

import interfaces.AparelhoTelefonico;

public class Celular implements AparelhoTelefonico{

	public Celular() {
		
	}
	
	@Override
	public void ligar() {
		System.out.println("Celular: Realizando Ligação");
		
	}

	@Override
	public void atender() {
		System.out.println("Celular: Atendendo Ligação");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Celular: Correio de Voz Iniciado");
		
	}

}
