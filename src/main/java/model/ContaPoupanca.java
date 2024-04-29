package model;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente titular, String agencia, String numero, double saldo) {
        super(titular, agencia, numero, saldo);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 10000) {
            valor+= valor * 0.01;
        }
        super.depositar(valor);
    }
}
