package model;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente titular, String agencia, String numero, double saldo) {
        super(titular, agencia, numero, saldo);
    }

    @Override
    public double sacar(double valor) {
        valor += valor * 0.5;
        super.sacar(valor);
        return getSaldo();
    }
}
