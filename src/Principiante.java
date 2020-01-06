
public class Principiante {
	private double bonus;

	public Principiante(String nome) {
		super(nome);
		this.score = 0;

		// TODO Auto-generated constructor stub
	}

	public void imprimir() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Score: "+ this.getScore());
		System.out.println("Bonus: "+ bonus);

	}



	protected void ganhar(int p) {
		score+=p;
		bonus+=(0.1*p);
	}

	protected void perder(int p) {
		score-=p;
		bonus-=(0.1*p);
	}
}
