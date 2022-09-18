package Lista_4.Ex_6;

public class Principal {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Bis", 150, 5);
		Produto p2 = new Produto("Copo", 30, 20);
		Produto p3 = new Produto("Tenis", 100, 500);
		Produto p4 = new Produto("Fone", 20, 150);
		Produto p5 = new Produto("Camiseta", 10, 90);
		
		p1.aumentarPreco(p1);
		p2.aumentarPreco(p2);
		p3.aumentarPreco(p3);
		p4.aumentarPreco(p4);
		p5.aumentarPreco(p5);
		
	}

}
