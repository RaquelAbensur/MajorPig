import java.util.Scanner;

public class Teste {
    
    String emailAdress;
    static int idUser = 1;
    String senha;
    int nivel;
    int conta = 1;
    //String nickname;
    byte idade;
    private String aNickname;

    public Teste (String aEmail, String aSenha){

        this.idUser = idUser++;
        this.emailAdress = aEmail;
        this.senha = aSenha;
        //this.nickname = aNickname;

        System.out.printf("A conta %s foi criada com sucesso \n", aNickname);
        System.out.printf("Entre em sua conta ou crie uma nova");
    
    }

    public static void login(String bEmail, String bSenha){
        for (int i =1; 1 <= idUser; i++){
            System.out.printf("Digite 'logar' para entrar em sua conta ou crie uma nova digitando 'criar': ");
        }
    }
    
    do{
        System.out.println("Entrar \"logar\", \"criar\", or \"sair\"");
        Scanner in = new Scanner(System.in);
        Object input = in.nextLine();
        if (input.equals("logar"))
        {
            System.out.println("Insira seu email: ");
            String bEmail = in.nextLine();
            System.out.println("Insira sua senha: ");
            String bSenha = in.nextLine();
            int a = idUser;
            login(bEmail, bSenha);
            System.out.println("Login feito com sucesso!");
            input = in.nextLine();
        }
        else if (input.equals("criar"))
        {
            System.out.println("Insira um email valido: ");
            String aEmail = in.nextLine();
            System.out.println("Insira uma senha: ");
            String aSenha = in.nextLine();
            Teste conta = new Teste (aSenha, aEmail);
        }
        else if (input.equals("sair"))
        {
            break;
        }
        else
        {
            System.out.println("Opção errada, escolha logar ou criar!");
                input = in.nextLine();
        }
    }while (true);
}