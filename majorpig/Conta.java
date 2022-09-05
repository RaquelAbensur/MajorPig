package majorpig;

public class Conta {

    int numero;
    int agencia;
    double saldo;

    Planos planos = new Planos();
    
    public Conta() {
    }

    public Conta (int numero, int agencia, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public int verifConta (int numero){
        return numero;
    }

 
}
