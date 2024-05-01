package equipamentos;

import interfaces.ReprodutorMusical;

public class Mp3 implements ReprodutorMusical{

	public Mp3() {
		
	}
	
	@Override
	public void tocar() {
		System.out.println("Mp3: Tocando Musica");
		
	}

	@Override
	public void pausar() {
		System.out.println("Mp3: Musica Pausada");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Mp3: Musica Selecionada");
		
	}

}
