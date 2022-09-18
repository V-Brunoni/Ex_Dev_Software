package Lista_4.Ex_6;

public class Produto {
	
	String nome;
	double peso;
	double preco;
	double r;
	
	
	public Produto(String nome, double peso, double preco) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
		
	}	
	public void aumentarPreco(Produto p) {
		System.out.println("Nome do Produto: "+nome);
		System.out.println("Preco Atual: R$ "+preco);
		if(preco <= 50) {
			r = preco * 0.20;
			System.out.println("Valor do Reajuste: R$ "+r);
			preco = r + preco;
			System.out.println("Novo preco do produto: R$ "+preco+"\n");
			
		}else{
			r = preco * 0.10;
			System.out.println("Valor do Reajuste: R$ "+r);
			preco = r + preco;
			System.out.println("Novo preco do produto: R$ "+preco+"\n");
		}
		
		
	}

}
