package majorpig_user;

public class Conta {
    int numero;
    double saldo;
    int agencia;

    User user = new User();

    public void autorizar (int numero, int id){
    }
    
    public double recuperarSaldo(){
        return saldo;
    }

    public Conta (double valor) {
        this.saldo = valor;
        System.out.println("Criando uma instancia da conta...");
    }
}
