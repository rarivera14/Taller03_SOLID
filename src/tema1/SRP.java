package tema1;

public class SRP {
	
	public class Persona {
	    public String nombre;
	    public String apellido;
	    public Email email;
	    
	    public Persona(String nombre, String apellido, Email email){
	        this.apellido = apellido;
	        this.nombre = nombre;
	        this.email = email;
	    }    
	    
	    public void saludar() {
	        System.out.println("Bienvenido!"); 
	    }
	}
	
	public class Email {
		public String email;
		
		public Email(String email) {
			if (validarEmail(email)) {
				this.email = email;
			}else {
				throw new Error("Invalid email!");
			}
		}
		
	    public boolean validarEmail(String email) {
	    	/* Validacion si es un emial funcional*/
	    	return true; //Para que no me de error
	    }
	}

}
