package Lista_2;

import java.text.DecimalFormat;

public class Ex_7 {
	public static void main(String[] args) {	
		  
		double Chico = 1.50;
		double Ze = 1.10;
		int ano = 0;
		
		DecimalFormat df = new DecimalFormat("#.##");
	
		while(Chico >= Ze) {
			Chico += 0.02;
			Ze += 0.03;
			ano++;
			
			System.out.println("Altura Chico: "+df.format(Chico)+" Altura Ze: "+df.format(Ze)+" Ano: "+ano);			
		}
		
		
		System.out.println("Serao necessarios "+ano+" anos para que Zé seja maior que Chico.");
		
		
		
		
		
		
	}

}
