
public class PagoPayPal implements Pago {
	private boolean loggedIn; //conexion a cuenta paypal
	@Override
	// EL CASO DEL PATO
	public void realizarCobro(double monto) {
		if (!loggedIn) {
			LogIn();
		}
		//cargar el monto de compra al medio de pago
	}
	private void LogIn() {
		
	}
}
