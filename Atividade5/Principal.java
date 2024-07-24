import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Gabriel", "133.188.255-99", "Lira");
        ContaCorrente contaCorrente1 = new ContaCorrente(1111, cliente1, 100, LocalDateTime.now());
        Cliente cliente2 = new Cliente("Verônica", "133.188.255-91", "Gonçalves");
        ContaCorrente contaCorrente2 = new ContaCorrente(2222, cliente2, 200, LocalDateTime.now());

        contaCorrente2.exibirExtrato();
        contaCorrente2.transferir(50, contaCorrente1);
        contaCorrente2.exibirExtrato();

        contaCorrente1.exibirExtrato();
        contaCorrente1.depositar(30);

        contaCorrente2.exibirExtrato();
        contaCorrente2.depositar(30);
    }
}
