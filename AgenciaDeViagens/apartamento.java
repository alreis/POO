package AgenciaDeViagens;

public class apartamento extends alojamentos {
	private int numeroDeQuartos;

	public apartamento(String id, String nome, String local, double precoPorNoite, boolean disponibilidade,
			double avaliacao) {
		super(id, nome, local, precoPorNoite, disponibilidade, avaliacao);
		// TODO Auto-generated constructor stub
	}

	public int getNumeroDeQuartos() {
		return numeroDeQuartos;
	}

	public void setNumeroDeQuartos(int numeroDeQuartos) {
		this.numeroDeQuartos = numeroDeQuartos;
	}
	
}
