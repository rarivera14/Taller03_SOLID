package tema1;



public class ISP {
	
	interface Mamifero {
		public void amamantar();	
	}
	
	interface MCorredor {
		public void correr();
	}
	
	interface MPonedorHuevos {
		public void ponerHuevos();
	}
	
	interface MNadador {
		public void nadar();
	}

	class Ornitorrinco implements Mamifero, MPonedorHuevos, MNadador {

		@Override
		public void nadar() {
			// TODO Auto-generated method stub
		}

		@Override
		public void amamantar() {
			// TODO Auto-generated method stub
		}

		@Override
		public void ponerHuevos() {
			// TODO Auto-generated method stub
		}
	}

	
	class Perro implements Mamifero, MCorredor{

		@Override
		public void correr() {
			// TODO Auto-generated method stub
		}

		@Override
		public void amamantar() {
			// TODO Auto-generated method stub
		}

	}
	
	class Delfin implements Mamifero, MNadador {
		@Override
		public void amamantar() {
			// TODO Auto-generated method stub
		}

		@Override
		public void nadar() {
			// TODO Auto-generated method stub
		}
	}
	
	


}
