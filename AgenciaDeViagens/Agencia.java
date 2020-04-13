package AgenciaDeViagens;

public class Agencia {
	private String nomeAgencia;
	private String enderecoAgencia;
	
	public Agencia(String nomeAgencia, String enderecoAgencia) {
		super();
		this.nomeAgencia = nomeAgencia;
		this.enderecoAgencia = enderecoAgencia;
	}
	
	public String getNomeAgencia() {
		return nomeAgencia;
	}
	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}
	public String getEnderecoAgencia() {
		return enderecoAgencia;
	}
	public void setEnderecoAgencia(String enderecoAgencia) {
		this.enderecoAgencia = enderecoAgencia;
	}

}
