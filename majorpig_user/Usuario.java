package majorpig_user;

    import java.util.Scanner;

public class Usuario {
    
    public String emailAdress;
    public int idUser = 1;
    public String senha;
    public int nivel;
    static int conta = 1;
    public byte idade;

    public Usuario (String aEmail, String aSenha){

        this.idUser = conta++;
        this.emailAdress = aEmail;
        this.senha = aSenha;
        conta++;

        System.out.printf("A conta %s foi criada com sucesso \n", aEmail);
        System.out.printf("Entre em sua conta ou crie uma nova");
    
    }
    public static void logar(String bEmail, String bSenha){
        for (int i = 1; i <= conta; i++){
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
                String aEmail = sc.nextLine();
                System.out.println("Insira uma senha: ");
                String aSenha = sc.nextLine();
                new Usuario (aEmail, aSenha);
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