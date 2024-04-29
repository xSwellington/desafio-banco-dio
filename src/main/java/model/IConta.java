package model;

public interface IConta {
    double getSaldo();
    void depositar(double valor);
    double sacar(double valor);
    void transferir(double valor, IConta conta);
    void exibirExtrato();
    Cliente getTitular();
    String getNumero();
    String getAgencia();
}
