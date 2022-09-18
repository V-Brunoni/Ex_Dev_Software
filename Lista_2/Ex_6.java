package Lista_2;

import java.util.Scanner;

public class Ex_6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int idade;
		
		System.out.println("Informe sua idade: ");
		idade = sc.nextInt();
		
		
		if(idade >= 18 && idade <= 67) {
			System.out.println("Pode doar Sangue!");
		}else {
			System.out.println("Não pode dar Sangue!");
		}
		
		
		
		
		
		
	}

}
