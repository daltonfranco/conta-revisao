public class App {
    public static void main(String[] args){
        Conta conta = new Conta();
        conta.setLimite(5000.00);

        conta.depositar(1000.00);

        conta.verSaldo();
    }
}
