package majorpig;

    import java.util.Scanner;

public class Planos {

    Conta conta = new Conta();
    
    double planoA;
    double planoB = 40;
    double planoC = 50;
    private int nivel;
        
    public void aprimorar(String escolha){

        System.out.printf("Digite o plano da sua escolha \"planoA\", \"planoB\" ou \"planoC\"");
        Scanner sc = new Scanner(System.in);
        escolha = sc.nextLine();
        if (escolha.equals("planoB")){
            (this.conta.saldo >= planoB)
        }
        else if (escolha.equals("planoC")){
            (this.conta.saldo >= planoC)
        }
        else
        {
            System.out.println("Opção incorreta!");
        }
    }
}
