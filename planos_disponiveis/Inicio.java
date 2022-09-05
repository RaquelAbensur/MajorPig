package planos_disponiveis;

    import java.util.Scanner;

public class Inicio {

    public static Void main(String[] args) {
        return null;
    }

public class Planos {

    double planoA;
    double planoB = 40;
    double planoC = 50;
    nivel++;

    public void aprimorar(double saldo, String escolha){
        do{
            System.out.printf("Digite o plano da sua escolha \"planoA\", \"planoB\" ou \"planoC\"");
            Scanner sc = new Scanner(System.in);
            String escolha = sc.nextLine();
            if (escolha.equals("planoB"){
                (saldo >= planoB)
                nivel++;
            }
            else (escolha == planoC && saldo >= planoC){

            }sc.close();
        }while (true);
    }
}
    public void autorizar(int nivel) {

        if ( nivel == 0 ){
            System.out.println("ACESSO AUTORIZADO");

        } else {

             System.out.println("ACESSO NEGADO");
        }
    }
}