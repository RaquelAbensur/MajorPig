package majorpig_user;

<<<<<<< HEAD
public class conta {
=======
public class Conta{

>>>>>>> 3760c63d51591e47a7962da3e291b4721f0beb10
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

<<<<<<< HEAD
    public conta (double valor) {
=======
    public void usuario (double valor) {
>>>>>>> 3760c63d51591e47a7962da3e291b4721f0beb10
        this.saldo = valor;
        System.out.println("Criando uma instancia da conta...");
    }
}
