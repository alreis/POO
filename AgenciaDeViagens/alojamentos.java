package AgenciaDeViagens;

public class alojamentos {
	
	private String id;
	private String nome;
	private String local;
	private double precoPorNoite;
	private boolean disponibilidade;
	public double avaliacao;
	public alojamentos(String id, String nome, String local, double precoPorNoite, boolean disponibilidade,
			double avaliacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.local = local;
		this.precoPorNoite = precoPorNoite;
		this.disponibilidade = disponibilidade;
		this.avaliacao = avaliacao;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public double getPrecoPorNoite() {
		return precoPorNoite;
	}
	public void setPrecoPorNoite(double precoPorNoite) {
		this.precoPorNoite = precoPorNoite;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public double getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}
	
}
