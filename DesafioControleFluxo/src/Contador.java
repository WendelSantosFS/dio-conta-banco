import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro: ");
            int num1 = scan.nextInt();

            System.out.println("Digite o segundo parâmetro: ");
            int num2 = scan.nextInt();

            getValueIteration(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }

    }

    static void getValueIteration(int param1, int param2) throws ParametrosInvalidosException {
        if (param1 > param2) {
            throw new ParametrosInvalidosException();
        }

        int result = param2 - param1;
        printConsole(result);
    }

    static void printConsole(int valueToFor) {
        for (int i= 1; i <= valueToFor; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

}
// if param1 > param2 === CustomException