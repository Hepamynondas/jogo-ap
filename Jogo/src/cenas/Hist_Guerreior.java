package cenas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import bibliotecas.Biblio_Guerreiro;
import enigmas.Hidra;
import enigmas.Labirinto;
import enigmas.Porta;
import graficos.Geral;
import graficos.Texto;
import mapas.Maps;
import menus.Creditos;
import menus.Menu_inicial;
import modelo.Teste;
import personagens.Jogador;
import sons.Musica;

public class Hist_Guerreior {

	private ActionListener continuar, escolha1, escolha2, escolha3;
	private Biblio_Guerreiro vet = new Biblio_Guerreiro(); // Vetor de texto
	private Musica musica = new Musica();
	private Musica[] musicasSegunda;
	private Jogador player;

	public Hist_Guerreior(Jogador player) {
		this.player = player;
		this.player.setClase(2);
		vet.setPlayer(this.player);

	}

	public void guerreiro1(Texto t1) {
		Geral geral = new Geral();

		vet.grr_1();
		geral.escolhas_3(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						destino();
					} else
						cont++;
				}
			}
		};

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				vet.grr_2(1);
				geral.escolhas_0(t1, vet);
				t1.getContinuar().addActionListener(continuar);

			}
		};

		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				vet.grr_2(2);
				geral.escolhas_0(t1, vet);
				t1.getContinuar().addActionListener(continuar);
			}
		};

		escolha3 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				vet.grr_2(3);
				geral.escolhas_0(t1, vet);
				t1.getContinuar().addActionListener(continuar);
			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
		geral.getChoice().getOpcao3().addActionListener(escolha3);
	}

	public void destino() {

		if (player.getDias() != 0) {

			JFrame frame = new JFrame();
			JLabel dias = new JLabel("faltam " + player.getDias() + " dias");
			dias.setBounds(1030, 120, 200, 100);
			dias.setFont(new Font("Georgia", Font.BOLD, 14));
			dias.setForeground(Color.BLACK);
			frame.getContentPane().add(dias);

			ImageIcon relogioIMG = new ImageIcon("src/imagens/relogio" + player.getHoras() + ".png");
			relogioIMG.setImage(relogioIMG.getImage().getScaledInstance(100, 100, 100));
			JLabel rel = new JLabel(relogioIMG);
			rel.setBounds(1030, 50, 100, 100);
			frame.getContentPane().add(rel);

			Maps mapa = new Maps(frame);
			mapa.zerarBotoes();

			ActionListener alameda = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					player.passaHora();
					alameda();

				}

			};
			ActionListener catedral = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					player.passaHora();
					catedral();
				}

			};
			ActionListener torre = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					player.passaHora();
					torre();
				}

			};
			if (!player.getEnigma(0)) {
				mapa.getBtnAlamedaPonteiros().setVisible(true);
				mapa.getAlamedaPonteirosFundo().setVisible(true);
				mapa.getBtnAlamedaPonteiros().addActionListener(alameda);
			}
			if (!player.getEnigma(1)) {
				mapa.getBtnCatedral().setVisible(true);
				mapa.getCatedralFundo().setVisible(true);
				mapa.getBtnCatedral().addActionListener(catedral);
			}
			if (!player.getEnigma(2)) {
				mapa.getBtnTorreArcana().setVisible(true);
				mapa.getTorreArcanaFundo().setVisible(true);
				mapa.getBtnTorreArcana().addActionListener(torre);
			}
		} else {
			player.setQtd();
			guerra();
		}

	}

	public void torre() {
		Geral geral = new Geral();
		Texto t1 = new Texto();

		vet.grr_3_torre();
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
//						t1.getTexto().dispose();
						new Labirinto(player, t1.getTexto());
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void torreDerrota() {

		Geral geral = new Geral();
		Texto t1 = new Texto();

		vet.grr_4_torre_lose();
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						destino();

					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void torreVitoria() {

		Geral geral = new Geral();
		Texto t1 = new Texto();

		this.player.setEnigma(2, true);
		this.player.passaDia();

		vet.grr_4_torre_win();
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						destino();
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void catedral() {
		Geral geral = new Geral();
		Texto t1 = new Texto();

		vet.grr_3_catedral();
		geral.escolhas_3(t1, vet);

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				catedral1(t1, 1);
				t1.getContinuar().addActionListener(continuar);

			}
		};

		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				catedral1(t1, 2);
				t1.getContinuar().addActionListener(continuar);
			}
		};

		escolha3 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				catedral1(t1, 3);
				t1.getContinuar().addActionListener(continuar);
			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);
		geral.getChoice().getOpcao3().addActionListener(escolha3);

	}

	public void catedral1(Texto t1, int x) {
		Geral geral = new Geral();

		vet.grr_4_catedral(x);
		geral.escolhas_2(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						new Hidra(player);
					} else
						cont++;
				}
			}
		};

		escolha1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				vet.grr_5_catedral_cinismo();
				geral.escolhas_0(t1, vet);
				t1.getContinuar().addActionListener(continuar);

			}
		};

		escolha2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				t1.getTexto().remove(geral.getChoice().getPanel_1());
				vet.grr_5_catedral_agressivo();
				geral.escolhas_0(t1, vet);
				t1.getContinuar().addActionListener(continuar);
			}
		};

		geral.getChoice().getOpcao1().addActionListener(escolha1);
		geral.getChoice().getOpcao2().addActionListener(escolha2);

	}

	public void catedralDerrota(int x) {

		Geral geral = new Geral();
		Texto t1 = new Texto();

		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						destino();

					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);
	}

	public void catedralVitoria() {

		Geral geral = new Geral();
		Texto t1 = new Texto();

		this.player.setEnigma(1, true);
		this.player.passaDia();

		vet.grr_6();
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						destino();
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void alameda() {
		Geral geral = new Geral();
		Texto t1 = new Texto();

		vet.grr_3_alameda();
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						new Porta(player);
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void alamedaDerrota() {

		Geral geral = new Geral();
		Texto t1 = new Texto();

		vet.grr_4_alameda_lose();
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						destino();

					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void alamedaVitoria() {

		Geral geral = new Geral();
		Texto t1 = new Texto();

		this.player.setEnigma(0, true);
		this.player.passaDia();

		vet.grr_4_alameda_win();
		geral.escolhas_0(t1, vet);

		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						destino();
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void guerra() {
		Geral geral = new Geral();
		Texto t1 = new Texto();

		if (player.getEnigma(1))
			vet.grr_5_com_map();
		else
			vet.grr_5_sem_mapa();

		geral.escolhas_0(t1, vet);
		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						new Teste(player);
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void guerraVitoria() {
		Geral geral = new Geral();
		Texto t1 = new Texto();

		if (player.getEnigma(1)) {

			if (player.getEnigma(0))
				vet.grr_6_kelastar();
			else if (player.getEnigma(2))
				vet.grr_6_muriel();
			else
				vet.grr_6_ninguem();

		} else {

			switch (player.getQtd()) {
			case 1:
				vet.grr_6_sem_mapa_win_um_rec();
				break;
			case 2:
				vet.grr_6_sem_mapa_win_dois_rec();
				break;
			default:
				vet.grr_6_sem_mapa_win_sem_rec();
				break;
			}

		}

		geral.escolhas_0(t1, vet);
		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						Creditos cr = new Creditos();

						new Thread() {
							public void run() {
								try {
									sleep(5000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								cr.setVisible(false);
								new Menu_inicial();
							}
						}.start();

						cr.mostraCreditos();
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

	public void guerraDerrota() {
		Geral geral = new Geral();
		Texto t1 = new Texto();

		if (player.getEnigma(1)) {
			vet.grr_6_lose();
		} else
			vet.grr_6_sem_mapa_derrota();

		geral.escolhas_0(t1, vet);
		continuar = new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent e) {
				if (geral.isFlag()) {
					if (cont == (vet.getTx().length - 1)) {
						t1.getContinuar().removeActionListener(continuar);
						t1.getTexto().dispose();
						Creditos cr = new Creditos();

						new Thread() {
							public void run() {
								try {
									sleep(5000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								cr.setVisible(false);
								new Menu_inicial();
							}
						}.start();

						cr.mostraCreditos();
					} else
						cont++;
				}
			}
		};

		t1.getContinuar().addActionListener(continuar);

	}

}
