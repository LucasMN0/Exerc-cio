import java.util.Scanner;
import java.util.*;

public class Teste{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x,y;
        int divisao;
            System.out.printf("Informe um número: ");
            x = sc.nextInt();
            System.out.printf("Informe um número: ");
            y = sc.nextInt();
        try{
            divisao = x/y;
        }catch(ArithmeticException e){
            System.out.println("\n Erro: Divisão por zero não é permitida.\nO novo valor de zero vai ser 1");
            divisao = x;
        }
        System.out.println(divisao);
    }
}
