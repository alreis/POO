package Pratica08;

public class PesadoDeMercadorias extends Pesados{
	
	private double cargaMaxima;
	
	public PesadoDeMercadorias(int matricula, String marca, String modelo, int cilindrada, int numeroDoQuadro,
			double peso) {
		super(matricula, marca, modelo, cilindrada, numeroDoQuadro, peso);
		// TODO Auto-generated constructor stub
	}
	public PesadoDeMercadorias() {}

	public double getCargaMaxima() {
		return cargaMaxima;
	}


	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
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


	@Override
	public double getPeso() {
		// TODO Auto-generated method stub
		return super.getPeso();
	}


	@Override
	public void setPeso(double peso) {
		// TODO Auto-generated method stub
		super.setPeso(peso);
	}


	@Override
	public int getMatricula() {
		// TODO Auto-generated method stub
		return super.getMatricula();
	}


	@Override
	public void setMatricula(int matricula) {
		// TODO Auto-generated method stub
		super.setMatricula(matricula);
	}


	@Override
	public String getMarca() {
		// TODO Auto-generated method stub
		return super.getMarca();
	}


	@Override
	public void setMarca(String marca) {
		// TODO Auto-generated method stub
		super.setMarca(marca);
	}


	@Override
	public String getModelo() {
		// TODO Auto-generated method stub
		return super.getModelo();
	}


	@Override
	public void setModelo(String modelo) {
		// TODO Auto-generated method stub
		super.setModelo(modelo);
	}


	@Override
	public int getCilindrada() {
		// TODO Auto-generated method stub
		return super.getCilindrada();
	}


	@Override
	public void setCilindrada(int cilindrada) {
		// TODO Auto-generated method stub
		super.setCilindrada(cilindrada);
	}


	@Override
	public int getNumeroDoQuadro() {
		// TODO Auto-generated method stub
		return super.getNumeroDoQuadro();
	}


	@Override
	public void setNumeroDoQuadro(int numeroDoQuadro) {
		// TODO Auto-generated method stub
		super.setNumeroDoQuadro(numeroDoQuadro);
	}
	
	

}
