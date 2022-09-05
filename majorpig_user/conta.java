package majorpig_user;

public class Conta{

    int numero;
    double saldo;
    int agencia;

    Planos planos = new Planos();

    public void contaSelecionada (int setAgencia, int setConta){

        this.agencia = setAgencia;
        this.numero = setConta;

        System.out.printf("A conta %s foi registrada com sucesso \n");
    }

    
    public double recuperarSaldo(){
        return saldo;
    }

    public void usuario (double valor) {
        this.saldo = valor;
        System.out.println("Criando uma instancia da conta...");
    }
}
