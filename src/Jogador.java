
public class Jogador {
	private String nome;
	protected int score;

	public Jogador(String nome) {

		this.setNome(nome);
		this.score = 0;
	}

	public void imprimir() {
		System.out.println("Nome: " + getNome());
		System.out.println("Score: " + score);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getScore() {
		return score;
	}

	public void setNome(int score) {
		this.score = score;
	}
}
