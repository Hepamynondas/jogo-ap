package cenas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graficos.Escolhas;
import graficos.Texto;
import personagens.Jogador;

public class Inicio2 {

	
	
	public Inicio2(Jogador player) {
		
		Texto t1;
		String[] tx = new String[23]; // Strings com os textos a serem mostrados
		int[] linhas = new int[23]; // Quantidade de pula linha em cada texto
		Escolhas choice = new Escolhas();
		
		if(player.getSexo() == 0) {
			t1 = new Texto("<html>Guarda:" 
					+ "<br/><br/>Tudo certo, mas antes de voc�"
					+ "<br/>entrar, me permita lhe dar um"
					+ "<br/>conselho: pense muito bem nas suas"
					+ "<br/>primeiras a��es aqui na cidade de "
					+ "<br/>Helaria, pois elas definir�o como ser� "
					+ "<br/>seu futuro aqui. Boa sorte garoto"
					+ "</html>", 8);
		}
		
		else {
			t1 = new Texto("<html>Guarda:" 
					+ "<br/><br/>Tudo certo, mas antes de voc�"
					+ "<br/>entrar, me permita lhe dar um"
					+ "<br/>conselho: pense muito bem nas suas"
					+ "<br/>primeiras a��es aqui na cidade de "
					+ "<br/>Helaria, pois elas definir�o como ser� "
					+ "<br/>seu futuro aqui. Boa sorte garota"
					+ "</html>", 8);
		}
		
		tx[0] = "<html> Voc� entra na cidade e procura pelo"
				+"<br/> mercado,foi uma viagem longa e dif�cil"
				+"<br/>e j� tem alguns dias que voc�"
				+"<br/>precisa comer."
				+ "<html>";
		linhas[0]=3;

		tx[1] = "<html>Chegando ao mercado voc� v� uma "
				+"<br/>barraca com frutas frescas, bem "
				+"<br/>diferente dos lixos ressecados que "
				+"<br/>voc� costumava comer em viagens"
				+ "<html>";
		linhas[1]=3;
		
		tx[2] = "<html>Voc� vai em dire��o a barraca "
				+"<br/>quando, de repente, um homem "
				+"<br/>esbarra em voc�, um incidente sem"
				+"<br/>import�ncia, mas quando voc� vai"
				+"<br/>comprar sua t�o sonhada refei��o "
				+"<br/>percebe que est� sem seu dinheiro"
				+ "<html>";
		linhas[2]=5;
		
		ActionListener continuar = new ActionListener() {
			int cont = -1;
			public void actionPerformed( ActionEvent actionEvent) {
				if(cont<2) { // Verifica se ainda h� mais textos por vir
					cont++;
					t1.atualizaTexto(tx[cont],linhas[cont]);
	            }	
				else{
					t1.zerar();
					choice.doEscolhas_2(t1.getTexto(), "<html>O homem que esbarrou em voc�"
							+ "<br/> ainda est� � vista, se voc� correr"
							+ "<br/> ainda conseguir� alcan��-lo."
							+ "<br/> O que far�?", 
							"Correr atr�s do Homem",
							"Deix�-lo ir embora");
				}
			}					
			
		};
		
		ActionListener escolha1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choice.getPanel_1().setVisible(false);
				new Inicio_CorrerAtras(t1, player);
				t1.getContinuar().removeActionListener(continuar);
			}
		};
		
		ActionListener escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				choice.getPanel_1().setVisible(false);
			}
		};
		
		choice.getOpcao1().addActionListener(escolha1);
		choice.getOpcao2().addActionListener(escolha2);
		t1.getContinuar().addActionListener(continuar);
	}
}

