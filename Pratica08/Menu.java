package Pratica08;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		EscolhaDeViaturas();
	}
	public static void EscolhaDeViaturas() {
		int tipoDeViatura;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Lista: \n");
		System.out.print("1: Motociclos		|		4: Pesados de mercadorias \n");
		System.out.print("2: Carros		|		5: Pesados de passageiros \n");
		System.out.print("3: Taxis \n");
		System.out.print("*****************************************************************\n");
		System.out.print("Escolha o Tipo de Viatura que deseja alugar: ");
		tipoDeViatura = sc.nextInt();
		System.out.print("\n");
		
		switch(tipoDeViatura) {
		case 1:
			ListaMotas();
			break;
		case 2:
			ListaCarros();
			break;
		case 3:
			ListaTaxis();
			break;
		case 4:
			ListaPesadosDePassageiros();
			break;
		case 5:
			ListaPesadosDeMercadorias();
			break;
		}
		
		sc.close();
	}
	public static void ListaMotas() {
		ArrayList<Motociclo> listaMotas = new ArrayList<Motociclo>();
		
		Motociclo mota;
		
		mota = new Motociclo();
		mota.setMarca("Yamaha");
		mota.setMatricula(9999999);
		mota.setModelo("Modelo 01");
		mota.setCilindrada(600);
		mota.setTipo("Desportivo");
		
		listaMotas.add(mota);
		
		mota = new Motociclo();
		mota.setMarca("Honda");
		mota.setMatricula(8888888);
		mota.setModelo("Modelo 02");
		mota.setCilindrada(600);
		mota.setTipo("Estrada");
		
		listaMotas.add(mota);
		
		System.out.println("Mostociclos:");
		
		for(int i = 0; i < listaMotas.size(); i++) {
		System.out.println("***********************************************");
		System.out.print("\n");
		System.out.println("Marca: " + listaMotas.get(i).getMarca());
		System.out.println("Matricula: " + listaMotas.get(i).getMatricula());
		System.out.println("Modelo: " + listaMotas.get(i).getModelo());
		System.out.println("Cilindra: " + listaMotas.get(i).getCilindrada());
		System.out.println("Tipo: " + listaMotas.get(i).getTipo() + "\n");
		
		}
	}
	public static void ListaCarros() {
		ArrayList<AutomovelLigeiro> listaCarros = new ArrayList<AutomovelLigeiro>();
		
		AutomovelLigeiro carro;
		
		carro = new AutomovelLigeiro();
		carro.setMarca("Fiat");
		carro.setMatricula(9999999);
		carro.setModelo("Punto");
		carro.setCilindrada(600);
		carro.setNumeroDoQuadro(70);
		carro.setCapacidadeDaBagageira(5);
		
		listaCarros.add(carro);
		
		carro = new AutomovelLigeiro();
		carro.setMarca("Fiat");
		carro.setMatricula(8888888);
		carro.setModelo("Uno");
		carro.setCilindrada(600);
		carro.setNumeroDoQuadro(100);
		carro.setCapacidadeDaBagageira(4);
		
		listaCarros.add(carro);
		
		System.out.println("Carros:");
		
		for(int i = 0; i < listaCarros.size(); i++) {
		System.out.println("***********************************************");
		System.out.print("\n");
		System.out.println("Marca: " + listaCarros.get(i).getMarca());
		System.out.println("Matricula: " + listaCarros.get(i).getMatricula());
		System.out.println("Modelo: " + listaCarros.get(i).getModelo());
		System.out.println("Cilindra: " + listaCarros.get(i).getCilindrada());
		System.out.println("Numero do quadro: " + listaCarros.get(i).getNumeroDoQuadro());
		System.out.println("Capacidade da bagageira: " + listaCarros.get(i).getCapacidadeDaBagageira() + "\n");
		
		}
	}
	public static void ListaTaxis() {
		ArrayList<Taxi> listaTaxis = new ArrayList<Taxi>();
		
		Taxi carro;
		
		carro = new Taxi();
		carro.setMarca("Mercedes-Benz");
		carro.setMatricula(9999999);
		carro.setModelo("Classe A 250 e");
		carro.setCilindrada(10000);
		carro.setNumeroDoQuadro(300);
		carro.setCapacidadeDaBagageira(4);
		carro.setNumeroLicenca(0101010101);
		
		listaTaxis.add(carro);
		
		carro = new Taxi();
		carro.setMarca("Audi");
		carro.setMatricula(8888888);
		carro.setModelo("A4");
		carro.setCilindrada(7000);
		carro.setNumeroDoQuadro(300);
		carro.setCapacidadeDaBagageira(4);
		carro.setNumeroLicenca(1010101010);
		
		listaTaxis.add(carro);
		
		System.out.println("Taxis:");
		
		for(int i = 0; i < listaTaxis.size(); i++) {
		System.out.println("***********************************************");
		System.out.print("\n");
		System.out.println("Marca: " + listaTaxis.get(i).getMarca());
		System.out.println("Matricula: " + listaTaxis.get(i).getMatricula());
		System.out.println("Modelo: " + listaTaxis.get(i).getModelo());
		System.out.println("Cilindra: " + listaTaxis.get(i).getCilindrada());
		System.out.println("Numero do quadro: " + listaTaxis.get(i).getNumeroDoQuadro());
		System.out.println("Capacidade da bagageira: " + listaTaxis.get(i).getCapacidadeDaBagageira());
		System.out.println("Numero da licença: " + listaTaxis.get(i).getNumeroLicenca() + "\n");
		
		}
	}
	public static void ListaPesadosDePassageiros() {
		ArrayList<PesadoDePassageiros> listaPesadosDePassageiros = new ArrayList<PesadoDePassageiros>();
		
		PesadoDePassageiros carro;
		
		carro = new PesadoDePassageiros();
		carro.setMarca("Mercedes-Benz");
		carro.setMatricula(9999999);
		carro.setModelo("Classe A 250 e");
		carro.setCilindrada(10000);
		carro.setNumeroDoQuadro(300);
		carro.setPeso(8000);
		carro.setNumeroMaxDePassageiros(256);
		
		listaPesadosDePassageiros.add(carro);
		
		carro = new PesadoDePassageiros();
		carro.setMarca("Volvo");
		carro.setMatricula(8888888);
		carro.setModelo("A4");
		carro.setCilindrada(7000);
		carro.setNumeroDoQuadro(300);
		carro.setPeso(8000);
		carro.setNumeroMaxDePassageiros(198);
		
		listaPesadosDePassageiros.add(carro);
		
		System.out.println("Pesados de passageiros:");
		
		for(int i = 0; i < listaPesadosDePassageiros.size(); i++) {
		System.out.println("***********************************************");
		System.out.print("\n");
		System.out.println("Marca: " + listaPesadosDePassageiros.get(i).getMarca());
		System.out.println("Matricula: " + listaPesadosDePassageiros.get(i).getMatricula());
		System.out.println("Modelo: " + listaPesadosDePassageiros.get(i).getModelo());
		System.out.println("Cilindra: " + listaPesadosDePassageiros.get(i).getCilindrada());
		System.out.println("Numero do quadro: " + listaPesadosDePassageiros.get(i).getNumeroDoQuadro());
		System.out.println("Capacidade da bagageira: " + listaPesadosDePassageiros.get(i).getPeso());
		System.out.println("Numero da licença: " + listaPesadosDePassageiros.get(i).getNumeroMaxDePassageiros() + "\n");
		}
	}
	public static void ListaPesadosDeMercadorias() {
		ArrayList<PesadoDeMercadorias> listaPesadosDeMercadorias = new ArrayList<PesadoDeMercadorias>();
		
		PesadoDeMercadorias carro;
		
		carro = new PesadoDeMercadorias();
		carro.setMarca("Mercedes-Benz");
		carro.setMatricula(9999999);
		carro.setModelo("Classe A 250 e");
		carro.setCilindrada(10000);
		carro.setNumeroDoQuadro(300);
		carro.setPeso(10000);
		carro.setCargaMaxima(100000);
		
		listaPesadosDeMercadorias.add(carro);
		
		carro = new PesadoDeMercadorias();
		carro.setMarca("Volvo");
		carro.setMatricula(8888888);
		carro.setModelo("A4");
		carro.setCilindrada(7000);
		carro.setNumeroDoQuadro(300);
		carro.setPeso(8000);
		carro.setCargaMaxima(70000);
		
		listaPesadosDeMercadorias.add(carro);
		
		System.out.println("Pesados de mercadorias:");
		
		for(int i = 0; i < listaPesadosDeMercadorias.size(); i++) {
		System.out.println("***********************************************");
		System.out.print("\n");
		System.out.println("Marca: " + listaPesadosDeMercadorias.get(i).getMarca());
		System.out.println("Matricula: " + listaPesadosDeMercadorias.get(i).getMatricula());
		System.out.println("Modelo: " + listaPesadosDeMercadorias.get(i).getModelo());
		System.out.println("Cilindra: " + listaPesadosDeMercadorias.get(i).getCilindrada());
		System.out.println("Numero do quadro: " + listaPesadosDeMercadorias.get(i).getNumeroDoQuadro());
		System.out.println("Capacidade da bagageira: " + listaPesadosDeMercadorias.get(i).getPeso());
		System.out.println("Numero da licença: " + listaPesadosDeMercadorias.get(i).getCargaMaxima() + "\n");
		}
	}
}
