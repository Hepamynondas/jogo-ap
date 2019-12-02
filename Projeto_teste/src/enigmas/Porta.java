package enigmas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Porta {

	private JFrame frame;
	private int i;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Porta window = new Porta();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Porta() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 527, 423);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setIconImage(new ImageIcon("src/imagens/Icone.png").getImage());
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				if (JOptionPane.showConfirmDialog(null,
						"Tem certeza que deseja sair do jogo (todo seu progresso ser� perdido)?", "Sair",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});

		Texto_enigma caixa = new Texto_enigma();
		caixa.getFrame().setBounds(frame.getX() + frame.getWidth() + 100, frame.getY(), caixa.getFrame().getWidth(),
				caixa.getFrame().getHeight());
		caixa.getTxt1()
				.setText("	Encontre o c�digo de quatro d�gitos que abre a porta. Voc� pode usar os"
						+ " n�meros de 0 a 5, mas cada um s� pode ser usado uma vez. As pequenas luzes"
						+ " ao lado de cada sequ�ncia de n�meros s�o as chaves para a resolu��o do"
						+ " desafio, uma vez que elas indicam as semelhan�as entre a sequ�ncia e o"
						+ " c�digo final. Cada luz branca indica um n�mero em comum com o c�digo mas"
						+ " com a posi��o diferente da que teria no c�digo final. Cada luz laranja"
						+ " indica um n�mero em comum com o c�digo e com a posi��o correta do c�digo final.");

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel[] digitos = new JLabel[4];
		JButton[] botao = new JButton[4];
		for (i = 0; i < 4; i++) {
			digitos[i] = new JLabel("0");
			digitos[i].setIcon(new ImageIcon(Porta.class.getResource("/imagens/senha_0.png")));
			digitos[i].setBounds(143 + (i * 63), 277, 48, 61);
			panel.add(digitos[i]);

			botao[i] = new JButton();
			botao[i].setFocusPainted(false);
			botao[i].setBorderPainted(false);
			botao[i].setBorder(null);
			botao[i].setPressedIcon(new ImageIcon(Porta.class.getResource("/imagens/senha_botao_pressionado.png")));
			botao[i].setContentAreaFilled(false);
			botao[i].setIcon(new ImageIcon(Porta.class.getResource("/imagens/senha_botao.png")));
			botao[i].setSelectedIcon(null);
			botao[i].setBounds(143 + (i * 63), 245, 41, 34);
			botao[i].addActionListener(new ActionListener() {
				int k = 1;
				int y = i;

				public void actionPerformed(ActionEvent e) {
					digitos[y].setIcon(new ImageIcon("src/imagens/senha_" + k + ".png"));
					digitos[y].setText("" + k);
					k++;
					if (k == 6)
						k = 0;
				}
			});
			panel.add(botao[i]);
		}

		JButton confirma = new JButton("confirma");
		confirma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (digitos[0].getText().contentEquals("0") && digitos[1].getText().contentEquals("1")
						&& digitos[2].getText().contentEquals("5") && digitos[3].getText().contentEquals("4")) {
					JOptionPane.showMessageDialog(null, "nice"); // Acertou a combina��o
				} else {
					JOptionPane.showMessageDialog(null, "errrrrrrrrou");
				}
			}
		});
		confirma.setBounds(422, 350, 89, 23);
		panel.add(confirma);

		JLabel Fundo = new JLabel();
		Fundo.setIcon(new ImageIcon(Porta.class.getResource("/imagens/senha.png")));
		Fundo.setBounds(0, 0, 513, 387);
		panel.add(Fundo);
	}
}
