import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class App {
    public static void main(String[] args) {
        var clienteA = new Cliente("Mario");
        var clienteB = new Cliente("João");
        var clienteC = new Cliente("Lúcio");

        var contaA = new ContaCorrente(clienteA, "AG001", "001", 2500);
        var contaB = new ContaPoupanca(clienteB, "AG001", "002", 0);
        var contaC = new ContaCorrente(clienteC, "AG001", "003", 100);


        contaA.transferir(1000, contaB);
        contaB.transferir(1000, contaC);
        contaC.depositar(5000);
        contaA.sacar(100);

        contaA.exibirExtrato();
        contaB.exibirExtrato();
        contaC.exibirExtrato();
    }
}
