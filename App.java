import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe um número N:");
    int n = sc.nextInt();
    int contador = 0;

    for (int i = 0; i < n; i ++){
        System.out.println("Informe um par de números:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(y == 0){
            System.out.println("divisao impossivel");
        }else{
            double divisao = (double) x/y;
            System.out.println(divisao);
            contador++;
        }
    }
    }
}
