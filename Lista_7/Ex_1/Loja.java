package Lista_7.Ex_1;

import java.util.ArrayList;

public class Loja {
	public static void main(String[] args) {
		
		
		ArrayList<Produto> p = new ArrayList<Produto>();
		
		
		Livros l1 = new Livros();
		l1.dados("A Arte da Guerra", 49.90, "Sun Tzu");
		
		Livros l2 = new Livros();
		l2.dados("Codigo Limpo", 70.00, "Robert Cecil Martin");
		
		CDs cd1 = new CDs();
		cd1.dados("Black Album", 30.00, 12);
		
		CDs cd2 = new CDs();
		cd2.dados("The Dark Side of the Moon", 25.00, 9);
		
		DVDs dvd1 = new DVDs();
		dvd1.dados("Pulp Fiction: Tempo de Violencia", 50.00, 2.34);
		
		p.add(l1);
		p.add(l2);
		p.add(cd1);
		p.add(cd2);
		p.add(dvd1);
		
		for(Produto produto : p) {
			System.out.println(produto.toString());
		}
		
		
		
		
		
		
	}

}
