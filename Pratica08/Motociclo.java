package Pratica08;

public class Motociclo extends Viaturas {
	
	private String Tipo;

	public Motociclo(int matricula, String marca, String modelo, int cilindrada, int numeroDoQuadro, String Tipo) {
		super(matricula, marca, modelo, cilindrada, numeroDoQuadro);
		this.Tipo = Tipo;
	}
	public Motociclo() {}
	
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
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
	public void setCilindrada(int cilidrada) {
		// TODO Auto-generated method stub
		super.setCilindrada(cilidrada);
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
	@Override
	public void trajeto(int quilometros) {
		// TODO Auto-generated method stub
		super.trajeto(quilometros);
	}
	@Override
	public int ultimoTrajeto() {
		// TODO Auto-generated method stub
		return super.ultimoTrajeto();
	}
	@Override
	public int distanciaTotal() {
		// TODO Auto-generated method stub
		return super.distanciaTotal();
	}
	
	
	
}
