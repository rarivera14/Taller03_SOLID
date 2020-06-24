package tema1;

public class LSP {
	public class Animal {
	    public void comer(){
	        //funcinalidades
	        
	    }
	}
	public class Leopardo extends AnimalesCorredores {
	    @Override
	    public void correr(){
	        System.out.println("Leopardo corriendo");
	        
	    }
	}
	public class Leon extends AnimalesCorredores {
	    @Override
	    public void correr(){
	        System.out.println("Leon corriendo");
	        
	    }
	}
	public class AnimalesCorredores extends Animal{
	    
	    public void correr(){
	        
	    }
	    
	}
	public class Tortuga extends Animal{
	    @Override
	    public void comer(){
	        System.out.println("Tortuga comiendo ");
	        
	    }
}
}