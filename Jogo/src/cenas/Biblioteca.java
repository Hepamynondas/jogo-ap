package cenas;

public class Biblioteca { // Classe que armazena os vetores de texto a serem usados

	private String[] tx; // textos
	private String choice, op1, op2, op3; // Strings para a interface de escolhas
	private int[] linhas; // variavel para ajustar o JLabel ao tamanho do texto
	private int sexo; // variavel para corrigir o g�nero do personagem nos textos

	// Getters and Setters

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public String getChoice() {
		return choice;
	}

	public String getOp1() {
		return op1;
	}

	public String getOp2() {
		return op2;
	}

	public String getOp3() {
		return op3;
	}

	public String[] getTx() {
		return tx;
	}

	public String getTx(int x) {
		return tx[x];
	}

	public int getLinhas(int x) {
		return linhas[x];
	}

	// Fim dos Getter and Setters

	// Textos para o pr�logo

	public void inicio() { // 0 op��es
		tx = new String[23];
		linhas = new int[23];

		tx[0] = "<html>O dia amanheceu. Voce acorda e se" + "<br/>levanta de sua cama e sai de seu" + "<br/> quarto."
				+ "</html>";
		linhas[0] = 2;

		tx[1] = "<html>M�e:" + "<br/><br/> Bom dia meu bem! Achei que" + "<br/>n�o ia mais levantar hoje. J� passou "
				+ "<br/>das sete da manh�. Venha logo tomar " + "<br/>caf�." + "</html>";
		linhas[1] = 5;

		tx[2] = "<html>Voc� come tranquilamente" + "<br/>enquanto observa sua pequena "
				+ "<br/>irm� brincando com bonecas de  " + "<br/>pano no ch�o. O dia est�  " + "<br/>agrad�vel."
				+ "</html>";
		linhas[2] = 4;

		tx[3] = "<html>M�e:" + "<br/><br/>Hoje completa um ano da  " + "<br/>morte de seu pai. Vamos ao "
				+ "<br/>cemit�rio visit�-lo mais tarde." + "</html>";
		linhas[3] = 4;

		tx[4] = "<html>M�e:" + "<br/><br/>Ser� que voc� poderia ir" + "<br/>� cidade comprar um incenso "
				+ "<br/>para levarmos ao seu pai? Ele" + "<br/>adorava us�-los em suas "
				+ "<br/>medita��es. Tenho certeza de" + "<br/>que ele ir� gostar." + "</html>";
		linhas[4] = 7;

		tx[5] = "<html>Voc� sai de casa rumo ao mercado da" + "<br/>cidade. Por morar em um local"
				+ "<br/>isolado, leva cerca de uma hora para" + "<br/>chegar ao local." + "</html>";
		linhas[5] = 3;

		tx[6] = "<html>Vendedor de incensos:" + "<br/><br/>Ol�, faz tempo que n�o"
				+ "<br/>te vejo. O que deseja levar dessa " + "<br/>vez? " + "</html>";
		linhas[6] = 4;

		tx[7] = "<html>Voc� explica que quer comprar" + "<br/>incensos para levar ao t�mulo de seu" + "<br/>pai."
				+ "</html>";
		linhas[7] = 2;

		tx[8] = "<html>Vendedor de incensos:" + "<br/><br/>Ah sim, seu pai. Sinto falta"
				+ "<br/>dele, era um bom homem. Morreu de" + "<br/>forma honrosa lutando contra seus."
				+ "<br/>inimigos." + "</html>";
		linhas[8] = 5;

		tx[9] = "<html>Vendedor de incensos:" + "<br/><br/>Aqueles malditos imperiais "
				+ "<br/>continuam querendo nossos " + "<br/>territ�rios. Tenho ouvido rumores de "
				+ "<br/>que eles planejam atacar nossa " + "<br/>cidade novamente em breve. Voc�"
				+ "<br/>deveria fugir daqui com sua fam�lia o " + "<br/>quanto antes." + "</html>";
		linhas[9] = 8;

		tx[10] = "<html>H� alguns segundos de sil�ncio. O" + "<br/>vendedor te entrega o incenso e tenta "
				+ "<br/>cortar a tens�o." + "</html>";
		linhas[10] = 2;

		tx[11] = "<html>Vendedor de incensos:" + "<br/><br/>Olha, acho que exagerei "
				+ "<br/>um pouco. N�o fique muito " + "<br/>preocupado com isso. Leve esse "
				+ "<br/>incenso por minha conta, � meu " + "<br/>presente ao seu pai." + "</html>";
		linhas[11] = 6;

		tx[12] = "<html>Voc� agradece e sai da loja. Ainda � " + "<br/>manh�, h� poucas nuvens no c�u e "
				+ "<br/>tudo indica que o dia ser� calmo " + "<br/>como sempre." + "</html>";
		linhas[12] = 3;

		tx[13] = "<html>Ap�s uma longa caminhada voc� " + "<br/>come�a a se aproximar de casa. Algo "
				+ "<br/>n�o parece certo. H� um forte cheiro " + "<br/>de queimado no ar e uma grande "
				+ "<br/>nuvem de fuma�a vinda da dire��o da " + "<br/>casa." + "</html>";
		linhas[13] = 5;

		tx[14] = "<html>Ao chegar mais perto, voc� v� as " + "<br/>chamas consumirem tudo. A casa "
				+ "<br/>come�a a desabar e sua vis�o " + "<br/>come�a a ficar turva." + "</html>";
		linhas[14] = 3;

		tx[15] = "<html>Voc� escuta os gritos de sua m�e e o " + "<br/>choro de sua irm�, que s�o "
				+ "<br/>bruscamente interrompidos, seguidos" + "<br/>de uma risada s�dica." + "</html>";
		linhas[15] = 3;

		tx[16] = "<html>Tudo que se pode ver s�o vultos de " + "<br/>v�rios homens ao longe. Voc� perde "
				+ "<br/>toda a no��o e cai de joelhos, " + "<br/>completamente paralisado." + "</html>";
		linhas[16] = 3;

		tx[17] = "<html>Algu�m te agarra pelas costas e " + "<br/>come�a a te arrastar" + "</html>";
		linhas[17] = 1;

		// Fim do sonho

		tx[18] = "<html>Voc� acorda lentamente, ainda  " + "<br/>abalado pelo pesadelo. Havia se"
				+ "<br/>passado apenas uma semana desde" + "<br/>o ocorrido. Voc� est� na parte de tr�s"
				+ "<br/>de uma carro�a guiada pelo homem " + "<br/>que o salvou no momento da "
				+ "<br/>destrui��o. Em todo esse tempo n�o " + "<br/>houve nenhuma conversa al�m do "
				+ "<br/>necess�rio entre voc�s." + "</html>";
		linhas[18] = 8;

		tx[19] = "<html>A carro�a para. Voc� escuta o homem " + "<br/>descendo e conversando algo com "
				+ "<br/>algu�m. Voc� desce da carro�a." + "</html>";
		linhas[19] = 2;

		tx[20] = "<html>Cocheiro:" + "<br/><br/>Essa � a pessoa de quem eu "
				+ "<br/>falei. Sua fam�lia foi morta pelos " + "<br/>soldados imperiais e ele est� "
				+ "<br/>desabrigado. Voc�s aceitam" + "<br/>refugiados n�o �? Pois ent�o, pode" + "<br/>ficar."
				+ "</html>";
		linhas[20] = 7;

		tx[21] = "<html>O homem volta para a carro�a sem te " + "<br/>falar mais uma palavra sequer e vai "
				+ "<br/>embora. O guarda com quem ele " + "<br/>conversava se dirige a voc�." + "</html>";
		linhas[21] = 3;

		tx[22] = "<html>Guarda: " + "<br/><br/>Ol�, voc� � muito bem vindo "
				+ "<br/>em nossa cidade. Para entrar basta " + "<br/>preencher esse formul�rio." + "</html>";
		linhas[22] = 4;
	}

	public void inicio2() { // 2 op��es
		tx = new String[4];
		linhas = new int[4];

		if (sexo == 0) {
			tx[0] = "<html>Guarda:" + "<br/><br/>Tudo certo, mas antes de voc�" + "<br/>entrar, me permita lhe dar um"
					+ "<br/>conselho: pense muito bem nas suas" + "<br/>primeiras a��es aqui na cidade de "
					+ "<br/>Helaria, pois elas definir�o como ser� " + "<br/>seu futuro aqui. Boa sorte garoto"
					+ "</html>";
			linhas[0] = 8;
		} else {
			tx[0] = "<html>Guarda:" + "<br/><br/>Tudo certo, mas antes de voc�" + "<br/>entrar, me permita lhe dar um"
					+ "<br/>conselho: pense muito bem nas suas" + "<br/>primeiras a��es aqui na cidade de "
					+ "<br/>Helaria, pois elas definir�o como ser� " + "<br/>seu futuro aqui. Boa sorte garota"
					+ "</html>";
			linhas[0] = 8;
		}

		tx[1] = "<html> Voc� entra na cidade e procura pelo" + "<br/> mercado,foi uma viagem longa e dif�cil"
				+ "<br/>e j� tem alguns dias que voc�" + "<br/>precisa comer." + "<html>";
		linhas[1] = 3;

		tx[2] = "<html>Chegando ao mercado voc� v� uma " + "<br/>barraca com frutas frescas, bem "
				+ "<br/>diferente dos lixos ressecados que " + "<br/>voc� costumava comer em viagens" + "<html>";
		linhas[2] = 3;

		tx[3] = "<html>Voc� vai em dire��o a barraca " + "<br/>quando, de repente, um homem "
				+ "<br/>esbarra em voc�, um incidente sem" + "<br/>import�ncia, mas quando voc� vai"
				+ "<br/>comprar sua t�o sonhada refei��o " + "<br/>percebe que est� sem seu dinheiro" + "<html>";
		linhas[3] = 5;

		choice = "<html>O homem que esbarrou em voc�" + "<br/> ainda est� � vista, se voc� correr"
				+ "<br/> ainda conseguir� alcan��-lo." + "<br/> O que far�?" + "<html>";

		op1 = "Correr atr�s do Homem";
		op2 = "Deix�-lo ir embora";

	}

	public void inicio_correr() { // 2 op��es

		tx = new String[1];
		linhas = new int[1];

		tx[0] = "<html>Voc� corre atr�s do bandido e pula " + "<br/>em cima dele, voc� o est� segurando, "
				+ "<br/>ele est� em sua posse, a rua n�o est�  " + "<br/>totalmente movimentada e nem"
				+ "<br/>conversar com voc�." + "<br/>totalmente vazia, duas pessoas se "
				+ "<br/>destacam no meio das outra, um " + "<br/>guarda e algu�m que se esconde "
				+ "<br/>atr�s de um capuz. " + "<html>";
		linhas[0] = 8;

		choice = "<html>O que voc� far�?<html>";
		op1 = "Recuperar seu dinheiro e deix�-lo ir";
		op2 = "Recuperar seu dinheiro e mant�-lo preso";
	}

	public void inicio_artemis() { // 0 op��es

		tx = new String[8];
		linhas = new int[8];

		tx[0] = "<html>Voc� pega novamente seus pertences " + "<br/>e libera o ladr�o, que corre em "
				+ "<br/>dire��o a liberdade, uma mulher " + "<br/>misteriosa se aproxima e come�a a"
				+ "<br/>conversar com voc�." + "<html>";
		linhas[0] = 4;

		tx[1] = "<html>Estranho de capuz: " + "<br/><br/>Interessante...  " + "<html>";
		linhas[1] = 2;

		tx[2] = "<html>Estranho de capuz: " + "<br/><br/>O seu ato, voc� perseguiu essa "
				+ "<br/>pessoa que te roubou, mostrando que " + "<br/>est� determinado a lutar pelo seu"
				+ "<br/>direito ." + "<html>";
		linhas[2] = 5;

		tx[3] = "<html>Estranho de capuz: " + "<br/><br/>E, quando o capturou, mostrou "
				+ "<br/>compaix�o com um irm�o, j� tinha " + "<br/>recuperado seus pertences, controlou "
				+ "<br/>a raiva que pulsava em seus olhos e o " + "<br/>liberou. N�o � algo que se veja todos "
				+ "<br/>os dias." + "<html>";
		linhas[3] = 7;

		tx[4] = "<html>Estranho de capuz: " + "<br/><br/>Meu nome � Artemisia, sou uma  "
				+ "<br/>arcana da Torre Anci� E. Quanto ao " + "<br/>que eu quero, percebo em voc� tem "
				+ "<br/>um potencial raro, uma for�a de " + "<br/>vontade, determina��o e  "
				+ "<br/>principalmente bondade e controle " + "<br/>para se tornar um arcano." + "<html>";
		linhas[4] = 8;

		tx[5] = "<html>Artemisia: " + "<br/><br/>Se voc� tiver interesse venha me  "
				+ "<br/>procurar na Torre Anci� (colocar " + "<br/>localiza��o baseada no mapa) esta " + "<br/>noite"
				+ "<html>";
		linhas[5] = 5;

		tx[6] = "<html>Artemisia vai embora e te deixa " + "<br/>pensando em sua oferta. " + "<html>";
		linhas[6] = 1;
		
		tx[7] = "<html>O dia est� caminhando para o seu "
				  + "<br/>final e voc� tem que decidir para onde "
				  + "<br/>ir� esta noite ou se n�o ir� para local" 
				  + "<br/>algum"
				  +"<html>";
		 linhas[7] = 3;

	}

	public void inicio_manterPreso() { // 2 op��es

		tx = new String[3];
		linhas = new int[3];

		tx[0] = "<html>Voc� consegue recuperar seus " + "<br/>pertences, mas  o mant�m com a cara"
				+ "<br/>no ch�o. Ele v� seu olhar de relance e  " + "<br/>come�a a pedir por miseric�rdia" + "<html>";
		linhas[0] = 3;

		tx[1] = "<html>Ladr�o:" + "<br/><br/>Por favor, voc� n�o precisa fazer isso, "
				+ "<br/>sou s� uma pessoa comum. Sei que" + "<br/>cometi erros, mas eu tenho uma "
				+ "<br/>fam�lia que precisa de mim." + "<html>";
		linhas[1] = 5;

		tx[2] = "<html>Ladr�o:" + "<br/><br/>Somos p�rias, n�o existe dignidade"
				+ "<br/>em nossas vidas, para sobrevivermos" + "<br/>fa�o tudo que est� ao meu alcance, "
				+ "<br/>mesmo que para isso eu tenha at� " + "<br/>que roubar de pessoas que n�o tem"
				+ "<br/>nada como eu." + "<html>";
		linhas[2] = 7;

		choice = "<html>Ap�s escutar essas palavras cabe a " + "<br/>voc� decidir destino do homem que te "
				+ "<br/>assaltou" + "<html>";

		op1 = "Liber�-lo";
		op2 = "Mat�-lo";

	}

	public void inicio_ladino() { // 0 op��es

		tx = new String[7];
		linhas = new int[7];

		tx[0] = "<html>Ladr�o:" + "<br/><br/>Muito obrigado senhor, voc� possui "
				+ "<br/>uma alma nobre e determina��o, o " + "<br/>que � raro nesta cidade de "
				+ "<br/>hipocrisias. Seus cidad�os s�o uns " + "<br/>puta hip�critas que adoram a um "
				+ "<br/>deus caridoso, mas cospem no " + "<br/>mendigo da rua. " + "<html>";
		linhas[0] = 8;

		tx[1] = "<html>Ladr�o:" + "<br/><br/>S�o poucos os locais que ainda se "
				+ "<br/>encontram valores como os seus. Na " + "<br/>verdade, eu s� penso na Alameda "
				+ "<br/>dos Tr�s Ponteiros, um local da mais " + "<br/>pura corrup��o, onde � revelado o "
				+ "<br/>melhor e o pior das pessoas." + "<html>";
		linhas[1] = 7;

		tx[2] = "<html>Ladr�o:" + "<br/><br/>Voc� deveria fazer uma visita l�, voc� "
				+ "<br/>poderia encontrar coisas al�m da sua" + "<br/>imagina��o. " + "<html>";
		linhas[2] = 4;

		tx[3] = "<html>Ladr�o:" + "<br/><br/>H� muito n�o vejo algu�m t�o nobre "
				+ "<br/>quanto o senhor, mesmo depois de eu " + "<br/>ter te assaltado voc� me poupou, pelo "
				+ "<br/>jeito a mis�ria te revolta mais do que " + "<br/>um crime." + "<html>";
		linhas[3] = 6;

		tx[4] = "<html>Cassius: " + "<br/><br/>Meu nome � Cassius e, se eu estiver "
				+ "<br/>certo, me preste uma visita na " + "<br/>Alameda dos Tr�s Ponteiro na (parte "
				+ "<br/>tal da cidade), l� voc� poder� usar " + "<br/>suas habilidades para ajudar a acabar"
				+ "<br/>com as injusti�as que existem nessa " + "<br/>cidade." + "<html>";
		linhas[4] = 8;

		tx[5] = "<html>Ele vai embora e voc� v� o guarda" + "<br/>abandonar o local decepcionado. " + "<html>";
		linhas[5] = 1;
		
		tx[6] = "<html>O dia est� caminhando para o seu "
				  + "<br/>final e voc� tem que decidir para onde "
				  + "<br/>ir� esta noite ou se n�o ir� para local" 
				  + "<br/>algum"
				  +"<html>";
		linhas[6] = 3;

	}

	public void inicio_guerreiro() { // 0 op��es

		tx = new String[5];
		linhas = new int[5];

		tx[0] = "<html>Voc� ignora o que esse miser�vel te" + "<br/>falou e come�a a bater sua cabe�a "
				+ "<br/>contra o ch�o incessantemente, sem" + "<br/>se importar com as pessoas perto ou"
				+ "<br/>com o guarda que te observa. Voc�" + "<br/>bate a cabe�a dele no ch�o at� ele "
				+ "<br/>desmaiar, e depois continua a " + "<br/>espanca-lo" + "<html>";
		linhas[0] = 7;

		tx[1] = "<html>Ap�s alguns minutos, o guarda retira" + "<br/>sua espada e perfura o cr�nio do "
				+ "<br/>pobre diabo e vira-se para conversar" + "<br/>contigo. " + "<html>";
		linhas[1] = 3;

		tx[2] = "<html>Guarda:" + "<br/><br/>Um homem de fibra que est� disposto"
				+ "<br/>a colocar esses miser�veis em seu" + "<br/>devido lugar." + "<html>";
		linhas[2] = 4;

		tx[3] = "<html>Guarda:" + "<br/><br/>A Guarda Real precisa de homens "
				+ "<br/>como o senhor. Apare�a esta noite " + "<br/>nos dom�nios do Castelo e procure "
				+ "<br/>pelo Capit�o Alexander do S�timo " + "<br/>Comando, garanto que n�o ir� se "
				+ "<br/>arrepender." + "<html>";
		linhas[3] = 7;
		
		tx[4] = "<html>O dia est� caminhando para o seu "
				  + "<br/>final e voc� tem que decidir para onde "
				  + "<br/>ir� esta noite ou se n�o ir� para local" 
				  + "<br/>algum"
				  +"<html>";
		linhas[4] = 3;

	}

	public void inicio_naoCorrer() {// 3 op��es
		
		tx = new String[3];
		linhas = new int[3];
		
 		tx[0] = "<html> Voc� decide n�o ir atr�s de quem te "
		 + "<br/>assaltou e come�a a conversar com "
		 + "<br/>as pessoas no Mercado, afinal voc� " 
		 + "<br/>est� com fome e est� sem dinheiro, "
		 + "<br/>precisa saber de possibilidades de "
		 + "<br/>conseguir uma renda."
		 +"<html>";
 		linhas[0] = 5;
 		
 		tx[1] ="<html>Nisso voc� ouve falar da Alameda dos "
		 + "<br/>Tr�s Ponteiros, onde est�o " 
		 + "<br/>concentrados os mais vis ladr�es e"
		 + "<br/>assassinos da cidade, da Torre Anci�, "
		 + "<br/>onde se localizam os maiores " 
		 + "<br/>estudiosos das artes arcanas do "
		 + "<br/>mundo, e da Guarda Real, lar dos "
		 + "<br/>guerreiros mais destemidos e ferozes"
		 + "<br/>que existem."
		 +"<html>";
 		linhas[1] = 8;
 		
 		tx[2] = "<html>O dia est� caminhando para o seu "
 				  + "<br/>final e voc� tem que decidir para onde "
 				  + "<br/>ir� esta noite ou se n�o ir� para local" 
 				  + "<br/>algum"
 				  +"<html>";
 		 linhas[2] = 3;
 		 		
 		 choice = "<html>Antes de decidir-se, tem a impress�o"
 		 		+ "<br/>de que tal escolha ter� profunda"
 		 		+ "<br/>influ�ncia em seu fururo"
 		 		+ "<html>";
 		 op1 = "Alameda dos Tr�s Ponteiros";
 		 op2 = "Torre Arcana";
 		 op3 = "Alistar - se a Guarda Real";
		
	}

// tx[] = "<html>"
//		 + "<br/>"
//		 + "<br/>" 
//		 + "<br/>"
//		 +"<html>";
//  linhas[] = ;

	// Fim dos textos do Pr�logo
}
