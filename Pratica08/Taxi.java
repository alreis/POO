package Pratica08;

public class Taxi extends AutomovelLigeiro{
	
	int NumeroLicenca;

	public Taxi(int matricula, String marca, String modelo, int cilindrada, int numeroDoQuadro,
			int capacidadeDaBagageira) {
		super(matricula, marca, modelo, cilindrada, numeroDoQuadro, capacidadeDaBagageira);
	}
	public Taxi() {}

	public int getNumeroLicenca() {
		return NumeroLicenca;
	}

	public void setNumeroLicenca(int numeroLicenca) {
		NumeroLicenca = numeroLicenca;
	}

	@Override
	public int getCapacidadeDaBagageira() {
		// TODO Auto-generated method stub
		return super.getCapacidadeDaBagageira();
	}

	@Override
	public void setCapacidadeDaBagageira(int capacidadeDaBagageira) {
		// TODO Auto-generated method stub
		super.setCapacidadeDaBagageira(capacidadeDaBagageira);
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