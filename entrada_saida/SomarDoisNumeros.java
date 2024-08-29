import java.util.Scanner;
public class SomarDoisNumeros {
    public static void main(String[] args){
        /* declaração de variaveis capturar dois numeros*/
        Scanner leitor = new Scanner(System.in);
        int a, b, resultado;
        /*entrada de dados*/
        System.out.println("Digite um valor: ");
        a = leitor.nextInt();
        System.out.println("Digite outro valor: ");
        b = leitor.nextInt();
        /*processamento*/
        resultado = a + b;
        /*System.out.println(a + " + " + b + "=" + resultado);*/
        /*saida de dados*/
        System.out.printf("%d + %d = %d\n", a, b, resultado);
    }
    
}