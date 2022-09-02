package majorpig_user;

public class user {
    
    private String email_adress;
    private int idUser = 1;
    private String senha;
    public byte idade;
    public String nickname;
    private int nivel;

    public user (String Aemail, String Asenha, String nickname) {

        this.idUser = count++;
        this.email_adress = Aemail;
        this.senha = Asenha;
        this.nickname = Anickname;
        count++;

        System.out.printf("A conta %s foi criada \n", Anickname);
        System.out.printf("Entre com a sua conta ou crie uma nova");

    }
    
    public static void login(String Bemail, String Bsenha) {
        for (int i = 1; i <= count; i++) {
            System.out.printf("Digite 'logar' para entrar em seu perfil ou 'criar' para abrir nova conta");
        }
    }
    do
    {
        System.out.println("Entrar \"logar\", \"criar\", or \"sair\"");
        input = scanner.nextLine();
        if (input.equals("logar")
        {
            System.out.println("email");
            String Bemail = scanner.nextLine();
            System.out.println("senha");
            String Bsenha = scanner.nextLine();
            int a = count;
            login(Bemail, Bsenha);
            System.out.println("Login feito com sucesso!");
            input = scanner.nextLine();
        }
        else if (input.equals("criar")
        {
            System.out.println("email");
            String Aemail = scanner.nextLine();
            System.out.println("senha");
            String Asenha = scanner.nextLine();
            user count = new user(Aemail, Asenha);
            System.out.println("Conta criada com sucesso!");
            input = scanner.nextLine();
        }
        else if (input.equals("sair")
        {
            break; // sair do loop
        }
        else
        {
            System.out.println("opção errada, escolha logar ou criar!");
                input = scanner.nextLine();
        }
    } while (true);
}
