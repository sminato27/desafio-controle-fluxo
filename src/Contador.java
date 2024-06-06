import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int param1 = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        int param2 = scanner.nextInt();
        int param3 = 15, param4 = 2;

        try {
            contar(param1, param2, param3, param4);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo valor deve ser MAIOR que o primeiro.");
        }
    }

    static void contar(int param1, int param2, int param3, int param4) throws ParametrosInvalidosException {
        // Valida se param1 é MAIOR que param2 e lança a exceção.
        if (param1 > param2){
            throw new ParametrosInvalidosException();
        }

        int contagem = param2 - param1;
        // Realiza o 'for' para imprimir os números com base na variável 'contagem'.
        for (int x = param1; x <= param2; x++ )
            System.out.println("Imprimindo o número " + x);

        System.out.println("\nForçando a exceção:");
        if (param3 > param4){
            throw new ParametrosInvalidosException();
        }
    }
}
