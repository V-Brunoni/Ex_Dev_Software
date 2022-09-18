//4) Leia o nome e 3 notas de um aluno. Se obtiver média maior que 7 exibir a mensagem de aprovado, se ficar entre 5 e 7, exibir a mensagem em exame, e
//se for abaixo disso, exibir reprovado. Lembrando que terá que exibir o nome do aluno também.

package Lista_1;

import java.util.Scanner;

public class Ex_4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome_aluno;
		float nota1, nota2, nota3;
		float media;
		
		System.out.println("Informe o nome do Aluno: ");
		nome_aluno = sc.next();
		
		System.out.println("Informe a primeira nota: ");
		nota1 = sc.nextFloat();

		System.out.println("Informe a segunda nota: ");
		nota2 = sc.nextFloat();

		System.out.println("Informe a terceira nota: ");
		nota3 = sc.nextFloat();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("Media: " +media);
		
		if(media >= 7) {
			System.out.println("O aluno "+nome_aluno+" esta Aprovado!!!");
		}else {
		if(media >= 5 && media < 7) {
			System.out.println("O aluno "+nome_aluno+" esta em Exame!!!");
		}else {
			System.out.println("O aluno "+nome_aluno+" esta Reprovado!!!");
		}
		}
		
		
		
	}

}
