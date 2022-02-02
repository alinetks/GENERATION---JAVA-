package application;

public class Pregui�a extends Animal{
	
	public String move;
	public String a�ao;

		
	public Pregui�a (String nome, int idade, String som, String move, String a�ao)
	{ 
		super(nome, idade, som);
		
		this.move = move;
		this.a�ao = a�ao;
	}

	@Override
	public void emitirSom()
	{ 
		System.out.println("Zzzzzzzz...");
	}
	
	

public String getMove() {
	return move;
}


public void setMove(String move) {
	this.move = move;
}


public String getA�ao() {
	return a�ao;
}


public void setA�ao(String a�ao) {
	this.a�ao = a�ao;
}		
}
