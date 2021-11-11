public class Conta {
    
    private double saldo;
    private String numero;
    private boolean especial;
    private double limite;

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getNumero(){
        return this.numero;
    }

    public void setEspecial(boolean especial){
        this.especial = especial;
    }

    public boolean getEspecial(){
        return this.especial;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public double getLimite(){
        return this.limite;
    }

    public void sacar(double saque){
        if(this.saldo > saque){
            this.saldo = this.saldo - saque;
            
            
            
        }else{
            System.out.println("Erro");
            System.out.println("Voce nao tem saldo !!!!!");
        }
    }

    public void depositar(double deposito){
        if(deposito > 0){
            this.saldo = this.saldo + deposito;
            
            if(this.saldo > this.limite){
                System.out.println("Erro");
                System.out.println("Voce passou do seu limite, o deposito foi negado");
                this.saldo = this.saldo - deposito;

            }
        }else{
            System.out.println("Erro");
            System.out.println("O valor que voce inseriu é invalido");
        }
    }

    public String verificaChequeEspecial(){
        String teste;

        if(this.especial == true){
            teste = "Tem cheque especial";
        }else{
            teste = "Nao tem cheque especial";
        }

        return teste;
    }

    public void verSaldo(){
        System.out.println(this.saldo + " reais");
    }

}
