package majorpig_user;

    import java.util.Scanner;

public class Usuario {
    
    public String emailAdress;
    public int idUser = 1;
    String senha;
    int nivel;
    static int idConta = 1;
    byte idade;

    Conta contaBanco = new Conta(idUser);


    public Usuario(String setEmail, String setSenha) {
    }



    public void registro (String setEmail,String setSenha){

        this.idUser = idConta++;
        this.emailAdress = setEmail;
        this.senha = setSenha;
        idConta++;

        System.out.printf("A conta %s foi criada com sucesso \n", setEmail);
        System.out.printf("Entre em sua conta ou crie uma nova");
    
    }


    
    public static void logar(String bEmail, String bSenha){
        for (int i = 1; i <= idConta; i++){
            System.out.printf("Digite 'logar' para entrar em sua conta ou crie uma nova digitando 'criar': ");
        }
    }
    public static void main(String[] args) {
    do{
        System.out.println("Entrar \"logar\", \"criar\", or \"sair\"");
        try (Scanner in = new Scanner(System.in)) {
            Object input = in.nextLine();
            if (input.equals("logar")){
                System.out.println("Insira seu email: ");
                String bEmail = in.nextLine();
                System.out.println("Insira sua senha: ");
                String bSenha = in.nextLine();
                //int a = conta;
                logar(bEmail, bSenha);
                System.out.println("Login feito com sucesso!");
                input = in.nextLine();
            }else if (input.equals("criar")){
                System.out.println("Insira um email valido: ");
                String setEmail = in.nextLine();
                System.out.println("Insira uma senha: ");
                String setSenha = in.nextLine();
                new Usuario (setEmail, setSenha);
            }else if (input.equals("sair")){
                break;
            }else{
                System.out.println("Opção errada, escolha logar ou criar!");
                    input = in.nextLine();}
        }
    }while (true);
}



}