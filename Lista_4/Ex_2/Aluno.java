package Lista_4.Ex_2;

public class Aluno {
	
	String nome;
	int idade;
	double media;
	
	public Aluno(String nome, int idade, float media) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.media = media;
	}
	
	
	public void calcularMedia(double n1, double n2, double n3) {
		media = (n1 + n2 + n3)/3;
		System.out.println("Media: "+media);
		
	}
	
	public void verificarAprovacao() {
		if(media < 5) {
			System.out.println("Reprovado!!!");
		}else if(media >= 5 && media < 7) {
			System.out.println("Em exame!!!");
		}else if(media >= 7) {
			System.out.println("Aprovado!!!");
		}
	}

}
