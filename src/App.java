public class App {
    public static void main(String[] args) throws Exception {
        int qtd = 5;
        for (int i = 1; i <= qtd; i++) {
            String word = "";
            for (int j = 1; j <= i; j++) {
                word += i;
            }
            System.out.println(word);
        }
    }
}
