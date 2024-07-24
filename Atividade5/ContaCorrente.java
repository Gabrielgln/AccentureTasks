import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContaCorrente {
    private int numero;
    private Cliente cliente;
    private double saldo;
    private LocalDateTime data;

    public ContaCorrente() {}

    public ContaCorrente(int numero, Cliente cliente, double saldo, LocalDateTime data) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
        this.data = data;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso.");
    }

    public void sacar(double valor){
        if(this.saldo < valor){
            System.out.println("Saldo indisponível para saque.");
            return;
        }

        this.saldo -= valor;
    }

    public void exibirExtrato(){
        System.out.println("                                                 ");
        System.out.println("-------------------------------------------------");
        System.out.println("                EXTRATO BANCÁRIO                 ");
        System.out.println("-------------------------------------------------");
        System.out.println("Número da Conta: " + this.numero);
        System.out.println("Nome do Cliente: " + this.cliente.getNome());
        System.out.println("Data do Extrato: " + LocalDateTime.now().toString());
        System.out.println("-------------------------------------------------");
        System.out.printf("Saldo Atual: R$ %.2f%n", this.saldo);
        System.out.println("-------------------------------------------------");
    }

    public void transferir(double valor, ContaCorrente contaCorrente){
        if(this.saldo < valor){
            System.out.println("Saldo indisponível para transferência.");
            return;
        }

        this.saldo -= valor;
        contaCorrente.saldo += valor;
        System.out.printf("Transferência no valor de R$ %.2f para a conta de número %d realizada com sucesso.%n", valor, contaCorrente.numero);
    }
}
