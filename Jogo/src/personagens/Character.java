package personagens;

public abstract class Character { // NPCs t�m os msm atributos 
	
	private String nome;
	private String profiss�o;
	private int sexo;
	private int idade;

	public Character() {
	}

	public Character(String nome, int sexo) {
		this.nome = nome;
		this.sexo = sexo;
	}

	public Character(String nome, int sexo, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}

	public Character(String nome, int sexo, int idade, String profiss�o) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.profiss�o = profiss�o;
	}

	public String getProfiss�o() {
		return profiss�o;
	}

	public void setProfiss�o(String profiss�o) {
		this.profiss�o = profiss�o;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

}
