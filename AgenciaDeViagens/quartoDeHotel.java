package AgenciaDeViagens;

public class quartoDeHotel extends alojamentos {
	
	private String Single, Double, Twin, Triple;

	public quartoDeHotel(String id, String nome, String local, double precoPorNoite, boolean disponibilidade,
			double avaliacao) {
		super(id, nome, local, precoPorNoite, disponibilidade, avaliacao);
		// TODO Auto-generated constructor stub
	}

	public String getSingle() {
		return Single;
	}

	public void setSingle(String single) {
		Single = single;
	}

	public String getDouble() {
		return Double;
	}

	public void setDouble(String d) {
		Double = d;
	}

	public String getTwin() {
		return Twin;
	}

	public void setTwin(String twin) {
		Twin = twin;
	}

	public String getTriple() {
		return Triple;
	}

	public void setTriple(String triple) {
		Triple = triple;
	} 
	
	

}
