package banco_package;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("xxx Extrato Conta Corrente xxx");
        super.imprimirInfosComuns();
    }

    

}
