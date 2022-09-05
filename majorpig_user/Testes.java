package majorpig_user;

public class Testes {
    public static void main (String[] arg){

        Usuario kiwi = new Usuario("kiwi@email.com", "senha321");
        Usuario lily = new Usuario("lily@email.com", "senha123");


        lily.contaBanco.recuperarSaldo();
        kiwi.contaBanco.recuperarSaldo();

        
    

    }
    
}
