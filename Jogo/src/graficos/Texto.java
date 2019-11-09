package graficos;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Texto extends Janela {
	
	private static final long serialVersionUID = 1L;
	
	private Janela texto = new Janela();
	private JButton continuar = new JButton(new ImageIcon("src/imagens/continuar.png"));
	private JLabel txt = new JLabel();
	private JLabel fundo = new JLabel(new ImageIcon("src/imagens/fundo_dialogo.png"));
	
	
	
	public JButton getContinuar() {
		return continuar;
	}
	
	public Janela getTexto() {
		return texto;
	}



	//os par�metros s�o o texto que ser� inserido na caixa e o n�mero de quebras de linha (<br/>) presentes no texto
	public Texto(String text,int pulalinha) {
		//cria��o da janela de texto
		this.texto.construirJanela();
		this.texto.setSize(610,438);
		this.texto.setLocationRelativeTo(null);
		
		//bot�o continuar
		this.texto.add(continuar);
		this.continuar.setLayout(null);
		this.continuar.setVisible(true);
		this.continuar.setBounds(430,338,150,50);
		this.continuar.setContentAreaFilled(false);
		
		
		
		//defini��o do texto da janela
		this.txt.setText(text);
		this.txt.setBounds(50,52,text.length()*10,30*(1+pulalinha));
		this.txt.setFont(new Font("Georgia",Font.BOLD, 25));
		this.txt.setForeground(Color.black);
		this.texto.add(txt);
		
		//fundo
		this.texto.add(fundo);
		this.fundo.setBounds(0,0,600,400);
		this.texto.setVisible(true);
	}
	
	public void atualizaTexto(String tex,int pulalinha) {
		
		//bot�o continuar
				this.texto.add(continuar);
				this.continuar.setLayout(null);
				this.continuar.setVisible(true);
				this.continuar.setBounds(430,338,150,50);
				this.continuar.setContentAreaFilled(false);

				//defini��o do texto da janela
				this.txt.setText(tex);
				this.txt.setBounds(50,52,tex.length()*10,30*(1+pulalinha));
				this.txt.setFont(new Font("Georgia",Font.BOLD, 25));
				this.txt.setForeground(Color.black);
				this.texto.add(txt);
				
				//fundo
				this.texto.add(fundo);
				this.fundo.setBounds(0,0,600,400);
				
				this.texto.setVisible(true);
	}
	
	
}
