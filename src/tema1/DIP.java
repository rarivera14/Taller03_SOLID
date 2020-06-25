package tema1;
//Este ejemplo muestra las correctas relaciones que deben tener los distintos 
//metodos para evitar el acoplamiento de estos.

//En este ejemplo ilustraremos un a un robot que puede tener varias funcioanlidades 
//dependiendo de la accion que el usuario desee que realice
public class DIP {

	
	public class cuerpoRobot{
	//Distintios cuerpos dependiendo su accion
	public void Saltar(){
		
		//accion saltar
	}
	
	public void Nadar() {
		
		//accion nadar
	}
	
	public void Flash() {
		
		//accion correr
	}
	
	public void Volar() {
		
		//accion volar
	}
	
	public void cambiardeForma() {
		
		//accion cambiardeForma
	}

	
	}
	//Ahora se crea al robot y repende del usuario en que cuerpo coloque al robot, este hace la accion
	//Esto funcionaria para cualquier robot 
	public class Robot{
		public cuerpoRobot cuerpo;
		public Robot() {}
		
		public void Saltar() {
			
			if(cuerpo!=null)
				cuerpo.Saltar();
				
		}
public void Nadar() {
			
			if(cuerpo!=null)
				cuerpo.Nadar();
				
		}
public void Flash() {
	
	if(cuerpo!=null)
		cuerpo.Flash();
		
}
public void Volar() {
	
	if(cuerpo!=null)
		cuerpo.Volar();
		
}
public void cambiardeForma() {
	
	if(cuerpo!=null)
		cuerpo.cambiardeForma();
		
}

//Es este caso el robot posee todas esas acciones, pero la RESPONSABILIDAD es de la clase CUERPOROBOT
//
		
	}
	
	
	

}
