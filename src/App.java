import banco_package.Cliente;
import banco_package.Conta;
import banco_package.ContaCorrente;
import banco_package.ContaPoupanca;

public class App {
    public static void main(String[] args) {
        Cliente kleber = new Cliente();
        kleber.setNome("Kleber");

        Conta cc = new ContaCorrente(kleber);
        Conta poupanca = new ContaPoupanca(kleber);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
