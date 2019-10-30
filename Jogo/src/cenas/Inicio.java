package cenas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graficos.Texto;
import menus.Menu_inicial;
public class Inicio {
	
	Texto t1;
	String[] tx = new String[50];
	int[] linhas = new int[50];
	
	public Inicio() {
		t1 = new Texto("<html>O dia amanheceu. Voce acorda e se"
				+ "<br/>levanta de sua cama e sai de seu"
				+ "<br/> quarto.</html>",2);//teste da classe Texto
		
		tx[0] = "<html>M�e:"
				+"<br/><br/> Bom dia dorminhoco! "
				+"</html>";
		linhas[0] = 2;
		
		
		tx[1] = "<html>M�e:"
				+"<br/><br/>J� passou das sete da manh�."
				+"<br/>Venha logo tomar caf�"
				+"</html>";
		linhas[1] = 3;
		
		
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
				+"<br/><br/>Filho, ser� que voc� poderia ir"
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
		
		continuar(t1,tx[0],linhas[0],6,0);
	}
	
	
	
	
	public void continuar(Texto t,String txt, int x, int max,int cont) {
		
		int c;
		c = cont + 1;
		
		t.getContinuar().addActionListener( new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				t.getTexto().dispose();
            	if(cont<max) {
            		continuar(new Texto(txt,x),tx[c],linhas[c],max,c);
            	}
            	else;
            } });
    }
	
}
