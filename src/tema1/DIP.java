package tema1;

public class DIP {
	public static interface IcuerpoRobot{
	//Distintios cuerpos dependiendo su accion
	public void Saltar();
	
	public void Nadar();
	
	public void Flash();
	
	public void Volar();
	
	public void cambiardeForma() ;
	
	}
	

	

	public class Robot{
	private IcuerpoRobot robot;
	
	public Robot(IcuerpoRobot robotcom) {
		robot= robotcom;
		
		
	}
	}
	
	
	
	public void Robot() {}
	public IcuerpoRobot robot;
	
	
}


	
	


