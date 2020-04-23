package Pratica08;

public abstract class Pesados extends Viaturas {
	
	private double peso;

	public Pesados(int matricula, String marca, String modelo, int cilidrada, int numeroDoQuadro, double peso) {
		super(matricula, marca, modelo, cilidrada, numeroDoQuadro);
		this.peso = peso;
	}
	public Pesados() {}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	

}
