package Carro;

public class Principal {

	public static void main(String[] args) {
		 Carro1 porsche = new Carro1("00000", "Fl", "Vermelho", 2023) ;
		 porsche.ligar(); 
		 porsche.acelerar () ;
		 porsche.virar ();
		 porsche.frear () ;
			
			
		Onibus mercedes = new Onibus ("11111", "XB1", "Prata", 2020) ;
		mercedes.ligar() ; 
		mercedes.acelerar();
		mercedes.virar (); 
		mercedes.frear ();

	}

}
