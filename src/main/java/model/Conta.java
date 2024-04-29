package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Conta implements IConta {
    private double saldo = 0;
    private Cliente titular;
    private String agencia;
    private String numero;

    private List<String> extrato = new ArrayList<>();

    public Cliente getTitular() {
        return titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    Conta(Cliente titular, String agencia, String numero, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        titular.AdicionarConta(this);
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public double sacar(double valor) {
        if (saldo < valor) throw new RuntimeException("Sem saldo suficiente.");
        saldo -= valor;
        extrato.add("Sacado " + valor + " na data de " + new Date());
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) throw new RuntimeException("O valor a ser depositado precisa ser maior que zero.");
        extrato.add("Depositado " + valor + " na data de " + new Date());
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta conta) {
        sacar(valor);
        conta.depositar(valor);
        extrato.add("Transferido " + valor + " na data de " + new Date() + " para a conta " + conta.getTitular() + "[" + conta.getAgencia() + " | " + conta.getNumero() + "]");
    }

    @Override
    public void exibirExtrato() {
        extrato.forEach(System.out::println);
    }
}
