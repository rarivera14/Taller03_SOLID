
package tema1;
//este ejemplo viola el principio de LSP
//porque no todas las clases que heredan pueden comportarse como la clase padre
class Animal{
	void comer() {};
	void crecer() {};
	void correr() {};
	
}
//si tenemos clases como Leon, Leopardo, van a cumplir la herencia
//pero llega el caso de tortug
class Tortugas extends Animal{
	void comer() {};
	void crecer() {};
	void correr() {
		throw new Error();
		//aqui el problema porque no va a permitir este metodo
		//y manejarlo dentro de una funcion donde se especifique la instancia de clase
		//y se realice una logica este viola el principio ya que se comporta diferente
	};
}
//la solucion seria crear rediseñar con componentes individuales 
//para que implemente las funcionalidades requeridas

interface Comer{
	void comer();
}
interface Crecer{
	void crecer();
}
interface Correr{
	void correr();
}
class Leon implements Comer, Correr, Crecer{
	@Override
	public void crecer() {}
	@Override
	public void correr() {}
	@Override
	public void comer() {};
	
}
class Tortuga implements Crecer, Comer{
	@Override
	public void comer() {}
	@Override
	public void crecer() {}
}
	//con este cambio se puede utilizar mejor las funcionalidades