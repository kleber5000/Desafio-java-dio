package banco_package;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("xxx Extrato Conta Poupança xxx");
        super.imprimirInfosComuns();
    }

    

}