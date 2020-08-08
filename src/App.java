public class App {
    public static void main(String[] args) {
        System.out.println("Custom exceptions are very much useful when we need to handle specific exceptions related to the business logic");
        try {
            throw new MinhaExcecao("checked exception");
        } catch (MinhaExcecao excecao) {
            System.out.println(excecao.getMessage());
            System.out.println("Checked exceptions are exceptions that need to be treated explicitly.\n");
        }

        try {
            throw new MinhaOutraExcecao("unchecked exception");
        }
        catch (MinhaOutraExcecao excecao) {
            System.out.println(excecao.getMessage());
        }
    }
}
