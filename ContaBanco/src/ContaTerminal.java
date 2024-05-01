import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: Conhecer e importar a classe Scanner

        Scanner sc = new Scanner(System.in);
            int numero;
            String agencia;
            String nomeCliente;
            double saldo;

        // Exibir as mensagens para o nosso usuario
        // Obter pela Scanner os valores digitados no terminal
        System.out.print("POr Favor, digite o número da agencia! : ");
        agencia = sc.nextLine();
        System.out.print("Digite numero da conta: ");
        numero = sc.nextInt();
        System.out.print("Digite nome do cliente: ");
        sc.nextLine();
        nomeCliente = sc.nextLine();
        System.out.print("Digite o Saldo: R$ ");
        saldo = sc.nextDouble();

        // Exibir a mensagem conta Criada
        System.out.println();
        System.out.print("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, ");
        System.out.println("sua agencia é " + agencia + ", conta " + numero + " e seu saldo de R$ " + saldo + " já esta disponivel para saque" );

      sc.close();
    }
}

