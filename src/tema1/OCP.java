package tema1;

import tema1.Bebida;
import tema1.Cafe;
import tema1.Cafeteria;
import tema1.Tee;

public class OCP {
	public static void main(String args[]) {
		Bebida[] pedidos = {new Cafe(), new Tee(), new Cafe()};
		Cafeteria.entregarBebidas(pedidos);
	}
	
}

class Cafeteria{
	public static void entregarBebidas(Bebida[] pedidos) {
		for(Bebida b : pedidos){
			b.prepararBebida();
		}
	}
}

interface Bebida {
	void prepararBebida();
}

class Cafe implements Bebida {
	@Override
	public void prepararBebida() {
		// Preparar café
		System.out.println("Café listo!");
	}
}

class Tee implements Bebida {
	@Override
	public void prepararBebida() {
		// Preparar tee
		System.out.println("Té listo!");
	}
}
