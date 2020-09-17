
import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

public class aplic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente contaCorrente = new ContaCorrente(1, 0);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        int option;
        boolean validador;

        while (true) {
            System.out.println(
                    "\n1-Depositar"
                    + "\n2-Sacar"
                    + "\n3-Consultar Saldo"
                    + "\n4-Sair"
            );

            System.out.println("\nOpção: ");
            option = scanner.nextInt();

            if (option == 4) {
                break;
            }

            switch (option) {
                case 1: {
                    System.out.println("Valor a ser depositado: ");
                    contaCorrente.depositar(scanner.nextDouble());
                    System.out.println("O valor foi depositado (*￣▽￣*)");
                    break;
                }
                case 2: {
                    System.out.println("Valor a ser sacado: ");
                    validador = contaCorrente.sacar(scanner.nextDouble());

                    System.out.println(validador
                            ? "\nO valor foi sacado O(∩_∩)O"
                            : "\nSaldo insulficiente ㄟ(≧◇≦)ㄏ");
                    break;
                }
                case 3: {
                    System.out.println("\nSaldo: " + df.format(contaCorrente.getSaldo()));
                    break;
                }
                default: {
                    System.out.println("\nOpção inválida `(*>﹏<*)′");
                    break;
                }
            }

        }
    }

}
