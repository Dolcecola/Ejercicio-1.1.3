import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        int num1 = 0, num2 = 1, suma = 1;
        System.out.println("Introduce el numero para la serie de fibonacci: ");
        Scanner entrada = new Scanner(System.in);
        int f = entrada.nextInt();

        do {
            System.out.println(suma);
            suma= num1 + num2;
            num1 = num2;
            num2 = suma;
        }while(suma < f);
    }
}