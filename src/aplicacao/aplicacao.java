package aplicacao;

import equipamentos.Celular;
import equipamentos.InternetExplorer;
import equipamentos.Iphone;
import equipamentos.Mp3;

public class aplicacao {
	public static void main(String[] args) {

		Celular celular = new Celular();
		InternetExplorer ie = new InternetExplorer();
		Mp3 mp3 = new Mp3();
		Iphone iphone = new Iphone();
	
		System.out.println("\nExecução Celular\n");
		
		celular.ligar();
		celular.atender();
		celular.iniciarCorreioVoz();
		
		System.out.println("\nExecução Internet Explorer\n");
		
		ie.exibirPagina();
		ie.atualizarPagina();
		ie.adicionarNovaAba();
		
		System.out.println("\nExecução MP3\n");
		
		mp3.selecionarMusica();
		mp3.tocar();
		mp3.pausar();
		
		System.out.println("\nExecução Iphone\n");
		
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		iphone.exibirPagina();
		iphone.atualizarPagina();
		iphone.adicionarNovaAba();
		
		iphone.selecionarMusica();
		iphone.tocar();
		iphone.pausar();
		

	}
}
