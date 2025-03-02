package bibliotecas;

import personagens.Jogador;

public abstract class Biblioteca {

	protected String[] tx; // textos
	protected String choice, op1, op2, op3; // Strings para a interface de escolhas
	protected Jogador player; // variavel para corrigir o g\u00EAnero do personagem nos textos
	protected boolean masculino;

	// Getters and Setters
	public void setPlayer(Jogador player) {
		this.player = player;
		if (this.player.getSexo() == 0)
			masculino = true;
	}

	public Jogador getPlayer() {
		return player;
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
	// Fim dos Getter and Setters
}
