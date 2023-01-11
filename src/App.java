import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner n = new Scanner(System.in);
        
        System.out.printf("Informe o número de início do intervalo:\n");
        int qtd1 = n.nextInt();

        System.out.printf("Informe o número final do intervalo:\n");
        int qtd2 = n.nextInt();

        for (int i = qtd1; i <= qtd2; i++) {
            String word = "";
            for (int j = qtd1; j <= i; j++) {
                word += i;
            }
            System.out.println(word);
        }
    }
}
