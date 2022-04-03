public class Main {

    public static void main(String[] args) {
        Cliente lorenzo = new Cliente();
        lorenzo.setNome("Lorenzo");

        Conta cc = new ContaCorrente(lorenzo);
        Conta poupanca = new ContaPoupanca(lorenzo);

        cc.depositar(100);
        cc.transferir(100,poupanca);
        cc.imprimirExtrato();

        poupanca.imprimirExtrato();
    }
}
