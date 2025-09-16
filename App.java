import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       String salaDesejada = "A219";
       String salaInformada = "";
       Scanner scanner = new Scanner(System.in);

       System.out.println("Digite o número da sala da disciplina de PSC: ");
        salaInformada = scanner.next();

        if (salaDesejada.equals(salaInformada)) {
            System.out.println("Você está no caminho certo.");
        } else {
            System.out.println("Você está perdido(a), se encontre.");
        }

        scanner.close();
    }
}