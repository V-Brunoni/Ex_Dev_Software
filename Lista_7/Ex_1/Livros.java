package Lista_7.Ex_1;

public class Livros extends Produto{
	
	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void dados(String nome, double preco, String autor){
		super.dados(nome, preco);
		this.autor = autor;
	}
	
	public String toString() {
		return super.toString() + "\nAutor: " + this.autor;
	}
	

}
