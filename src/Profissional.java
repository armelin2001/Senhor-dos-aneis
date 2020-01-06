
public class Profissional {
	private double capital;

	public Profissional(String nome) {
		super(nome);
		this.score = 0;

		// TODO Auto-generated constructor stub
	}
	public void imprimir() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Score: "+ this.getScore());
		System.out.println("Capital: "+ getCapital());

	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}

	protected void ganhar(int p) {
		score+=p;
		capital+=(4*p);
	}

	protected void perder(int p) {
		score-=p;
		capital-=(4*p);		}

}
