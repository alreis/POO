package Pratica08;

public class Viaturas implements KmPercorridosInterface{
	
	private int matricula;
	private String marca;
	private String modelo;
	private int cilindrada;
	private int numeroDoQuadro;
	
	public Viaturas(int matricula, String marca, String modelo, int cilindrada, int numeroDoQuadro) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.numeroDoQuadro = numeroDoQuadro;
	}
	public Viaturas() {}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilidrada) {
		this.cilindrada = cilidrada;
	}
	public int getNumeroDoQuadro() {
		return numeroDoQuadro;
	}
	public void setNumeroDoQuadro(int numeroDoQuadro) {
		this.numeroDoQuadro = numeroDoQuadro;
	}

	@Override
	public void trajeto(int quilometros) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int ultimoTrajeto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int distanciaTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
