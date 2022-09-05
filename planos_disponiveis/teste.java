package planos_disponiveis;

public class teste {
    
    public static Void main(String[] args) {
        return null;
    }

public class plano {

        int valor;
        int id;

    public void autorizar(int nivel) {

        if ( nivel >= id ){
            System.out.println("ACESSO AUTORIZADO");

        } else {

             System.out.println("ACESSO NEGADO");
        }

    }
    }
}
