import java.util.List;

public class Compra {
	private Pago pago;
	private List articulos;
	
	//DIP
	public Compra(Pago pago) {
		//inicializaciones
	}
	
	public void agregarArticulo(Articulo articulo){
		//agregar un articulo a la compra
	}
	
	public void removerArticulo(Articulo articulo) {
		//remover un articulo de la compra
	}
}
