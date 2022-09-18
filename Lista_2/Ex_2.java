package Lista_2;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        
        float km;
        float litros;
        float consumo;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Informe a distância percorrida pelo veiculo: ");
        km = sc.nextFloat();
        
        
        System.out.println("Informe o combustivel gasto em litros: ");
        litros = sc.nextFloat();
        
        consumo = km/litros;
        
        System.out.println("O consumo do veiculo foi "+consumo+ " Km/L");
        
        
        
        
    }
    
}
