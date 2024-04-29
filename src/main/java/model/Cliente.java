package model;

public class Cliente {
    private String nome;

    public IConta getConta() {
        return conta;
    }

    private IConta conta;

    public String getNome() {
        return nome;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    void AdicionarConta(IConta conta){
        this.conta = conta;
    }

    @Override
    public String toString() {
        return nome;
    }
}
