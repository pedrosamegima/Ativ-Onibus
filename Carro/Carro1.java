package Carro;

public class Carro1 extends Veiculos {

	public Carro1(String placa, String modelo, String cor, int ano) {
		super(placa, modelo, cor, ano);
		
	}

	@Override
	public void frear() {
		System.out.println("O carro está freando.");
		
	}

	@Override
	public void virar() {
		System. out.println ("O carro está virando.");
		
	}

	@Override
	public void acelerar() {
		System.out.println("O carro está acelerando.");
		
	}

	@Override
	public void ligar() {
		System.out.println ("O carro está ligado.");
		
	}

}
