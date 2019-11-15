package lixo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graficos.Texto;
import menus.Formulario;

public class TesteInicio {
	
		private Texto t1;
		private String[] tx = new String[23]; //Strings com os textos a serem mostrados
		private int[] linhas = new int[23]; //Quantidade de pula linha em cada texto
		
		public TesteInicio() {
			
			// Textos a serem mostrados nas caixas de texto
			
			t1 = new Texto("<html>O dia amanheceu. Voce acorda e se"
					+ "<br/>levanta de sua cama e sai de seu"
					+ "<br/> quarto.</html>",2);
			
			tx[1] = "<html>M�e:"
					+"<br/><br/> Bom dia meu bem! Achei que"
					+"<br/>n�o ia mais levantar hoje. J� passou "
					+"<br/>das sete da manh�. Venha logo tomar "
					+"<br/>caf�."
					+"</html>";
			linhas[1] = 5;
			
			tx[2] = "<html>Voc� come tranquilamente"
					+"<br/>enquanto observa sua pequena "
					+"<br/>irm� brincando com bonecas de  "
					+"<br/>pano no ch�o. O dia est�  "
					+"<br/>agrad�vel."
					+"</html>";
			linhas[2] = 4;
			
			
			tx[3] = "<html>M�e:"
					+"<br/><br/>Hoje completa um ano da  "
					+"<br/>morte de seu pai. Vamos ao "
					+"<br/>cemit�rio visit�-lo mais tarde."
					+"</html>";
			linhas[3] = 4;
			
			
			tx[4] = "<html>M�e:"
					+"<br/><br/>Ser� que voc� poderia ir"
					+"<br/>� cidade comprar um incenso "
					+"<br/>para levarmos ao seu pai? Ele"
					+"<br/>adorava us�-los em suas "
					+"<br/>medita��es. Tenho certeza de"
					+"<br/>que ele ir� gostar."
					+"</html>";
			linhas[4] = 7;
			
			tx[5] = "<html>Voc� sai de casa rumo ao mercado da"
					+"<br/>cidade. Por morar em um local"
					+"<br/>isolado, leva cerca de uma hora para"
					+"<br/>chegar ao local."
					+"</html>";
			linhas[5] = 3;
			
			tx[6] = "<html>Vendedor de incensos:"
					+"<br/><br/>Ol�, faz tempo que n�o"
					+"<br/>te vejo. O que deseja levar dessa "
					+"<br/>vez? "
					+"</html>";
			linhas[6] = 4;
			
			tx[7] = "<html>Voc� explica que quer comprar"
					+"<br/>incensos para levar ao t�mulo de seu"
					+"<br/>pai."
					+"</html>";
			linhas[7] = 2;
			
			tx[8] = "<html>Vendedor de incensos:"
					+"<br/><br/>Ah sim, seu pai. Sinto falta"
					+"<br/>dele, era um bom homem. Morreu de"
					+"<br/>forma honrosa lutando contra seus."
					+"<br/>inimigos."
					+"</html>";
			linhas[8] = 5;
			
			tx[9] = "<html>Vendedor de incensos:"
					+"<br/><br/>Aqueles malditos imperiais "
					+"<br/>continuam querendo nossos "
					+"<br/>territ�rios. Tenho ouvido rumores de "
					+"<br/>que eles planejam atacar nossa "
					+"<br/>cidade novamente em breve. Voc�"
					+"<br/>deveria fugir daqui com sua fam�lia o "
					+"<br/>quanto antes."
					+"</html>";
			linhas[9] = 8;
			
			tx[10] = "<html>H� alguns segundos de sil�ncio. O"
					+"<br/>vendedor te entrega o incenso e tenta "
					+"<br/>cortar a tens�o."
					+"</html>";
			linhas[10] = 2;

			tx[11] = "<html>Vendedor de incensos:"
					+"<br/><br/>Olha, acho que exagerei "
					+"<br/>um pouco. N�o fique muito "
					+"<br/>preocupado com isso. Leve esse "
					+"<br/>incenso por minha conta, � meu "
					+"<br/>presente ao seu pai."
					+"</html>";
			linhas[11] = 6;

			tx[12] = "<html>Voc� agradece e sai da loja. Ainda � "
					+"<br/>manh�, h� poucas nuvens no c�u e "
					+"<br/>tudo indica que o dia ser� calmo "
					+"<br/>como sempre."
					+"</html>";
			linhas[12] = 3;
			
			tx[13] = "<html>Ap�s uma longa caminhada voc� "
					+"<br/>come�a a se aproximar de casa. Algo "
					+"<br/>n�o parece certo. H� um forte cheiro "
					+"<br/>de queimado no ar e uma grande "
					+"<br/>nuvem de fuma�a vinda da dire��o da "
					+"<br/>casa."
					+"</html>";
			linhas[13] = 5;
			
			tx[14] = "<html>Ao chegar mais perto, voc� v� as "
					+"<br/>chamas consumirem tudo. A casa "
					+"<br/>come�a a desabar e sua vis�o "
					+"<br/>come�a a ficar turva."
					+"</html>";
			linhas[14] = 3;
			
			tx[15] = "<html>Voc� escuta os gritos de sua m�e e o "
					+"<br/>choro de sua irm�, que s�o "
					+"<br/>bruscamente interrompidos, seguidos"
					+"<br/>de uma risada s�dica."
					+"</html>";
			linhas[15] = 3;

			tx[16] = "<html>Tudo que se pode ver s�o vultos de "
					+"<br/>v�rios homens ao longe. Voc� perde "
					+"<br/>toda a no��o e cai de joelhos, "
					+"<br/>completamente paralisado."
					+"</html>";
			linhas[16] = 3;
			
			tx[17] = "<html>Algu�m te agarra pelas costas e "
					+"<br/>come�a a te arrastar"
					+"</html>";
			linhas[17] = 1;
			
			//Fim do sonho 
			
			tx[18] = "<html>Voc� acorda lentamente, ainda  "
					+"<br/>abalado pelo pesadelo. Havia se"
					+"<br/>passado apenas uma semana desde"
					+"<br/>o ocorrido. Voc� est� na parte de tr�s"
					+"<br/>de uma carro�a guiada pelo homem "
					+"<br/>que o salvou no momento da "
					+"<br/>destrui��o. Em todo esse tempo n�o "
					+"<br/>houve nenhuma conversa al�m do "
					+"<br/>necess�rio entre voc�s."
					+"</html>";
			linhas[18] = 8;
			
			tx[19] = "<html>A carro�a para. Voc� escuta o homem "
					+"<br/>descendo e conversando algo com "
					+"<br/>algu�m. Voc� desce da carro�a."
					+"</html>";
			linhas[19] = 2;
			
			tx[20] = "<html>Cocheiro:"
					+"<br/><br/>Essa � a pessoa de quem eu "
					+"<br/>falei. Sua fam�lia foi morta pelos "
					+"<br/>soldados imperiais e ele est� "
					+"<br/>desabrigado. Voc�s aceitam"
					+"<br/>refugiados n�o �? Pois ent�o, pode"
					+"<br/>ficar."
					+"</html>";
			linhas[20] = 7;
			
			tx[21] = "<html>O homem volta para a carro�a sem te "
					+"<br/>falar mais uma palavra sequer e vai "
					+"<br/>embora. O guarda com quem ele "
					+"<br/>conversava se dirige a voc�."
					+"</html>";
			linhas[21] = 3;
			
			tx[22] = "<html>Guarda: "
					+"<br/><br/>Ol�, voc� � muito bem vindo "
					+"<br/>em nossa cidade. Para entrar basta "
					+"<br/>preencher esse formul�rio."
					+"</html>";
			linhas[22] = 4;
			
			
			ActionListener continuar = new ActionListener() {
				int cont=0;
				public void actionPerformed(ActionEvent actionEvent) {
		            if(cont<22) { // Verifica se ainda h� mais textos por vir
		            	cont++;
		            	t1.atualizaTexto(tx[cont],linhas[cont]);
		            }
		            else {
		            	t1.getTexto().dispose();
		            	new Formulario();
		        
		            }
				}
			};
		            
		    t1.getContinuar().addActionListener(continuar);
			
		}
	}

