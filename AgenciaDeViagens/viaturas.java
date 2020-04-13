package AgenciaDeViagens;

public class viaturas {
	private char A, B, C, D, E, F;
	private String gasolina, diesel;
	
	public viaturas(char a, char b, char c, char d, char e, char f, String gasolina, String diesel) {
		super();
		A = a;
		B = b;
		C = c;
		D = d;
		E = e;
		F = f;
		this.gasolina = gasolina;
		this.diesel = diesel;
	}
	
	public char getA() {
		return A;
	}
	public void setA(char a) {
		A = a;
	}
	public char getB() {
		return B;
	}
	public void setB(char b) {
		B = b;
	}
	public char getC() {
		return C;
	}
	public void setC(char c) {
		C = c;
	}
	public char getD() {
		return D;
	}
	public void setD(char d) {
		D = d;
	}
	public char getE() {
		return E;
	}
	public void setE(char e) {
		E = e;
	}
	public char getF() {
		return F;
	}
	public void setF(char f) {
		F = f;
	}
	public String getGasolina() {
		return gasolina;
	}
	public void setGasolina(String gasolina) {
		this.gasolina = gasolina;
	}
	public String getDiesel() {
		return diesel;
	}
	public void setDiesel(String diesel) {
		this.diesel = diesel;
	}
	
}
