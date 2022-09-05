package majorpig_user;

    import java.util.Scanner;

public class Usuario {
    
    public String emailAdress;
    public int idUser = 1;
<<<<<<< HEAD
    public String senha;
    public int nivel;
    static int conta = 1;
    public byte idade;
=======
    String senha;
    int nivel;
    static int idConta = 1;
    byte idade;
>>>>>>> 3760c63d51591e47a7962da3e291b4721f0beb10

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
        try (Scanner sc = new Scanner(System.in)) {
            Object input = sc.nextLine();
            if (input.equals("logar")){
                System.out.println("Insira seu email: ");
                String bEmail = sc.nextLine();
                System.out.println("Insira sua senha: ");
                String bSenha = sc.nextLine();
                //int a = conta;
                logar(bEmail, bSenha);
                System.out.println("Login feito com sucesso!");
                input = sc.nextLine();
            }else if (input.equals("criar")){
                System.out.println("Insira um email valido: ");
<<<<<<< HEAD
                String aEmail = sc.nextLine();
                System.out.println("Insira uma senha: ");
                String aSenha = sc.nextLine();
                new Usuario (aEmail, aSenha);
=======
                String setEmail = in.nextLine();
                System.out.println("Insira uma senha: ");
                String setSenha = in.nextLine();
                new Usuario (setEmail, setSenha);
>>>>>>> 3760c63d51591e47a7962da3e291b4721f0beb10
            }else if (input.equals("sair")){
                break;
            }else{
                System.out.println("Opção errada, escolha logar ou criar!");
                    input = sc.nextLine();}
                    sc.close();
        }
    }while (true);
}



}