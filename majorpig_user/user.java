package majorpig_user;

     import java.util.Scanner;

public class User {

    String email_adress;
    int id;
    String senha;
    byte idade;
    String nickname;
    int nivel;

    MajorPig majorPig = new MajorPig();

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("login> ");
            String login = in.nextLine();
            System.out.println("senha> ");
            String senha = in.nextLine();
  
            if(login.equals("kiwi") && senha.equals("1234567")){
                System.out.printf("Usuário %s logado com sucesso.", login);
            if(login.equals("lily") && senha.equals("7654321")){
                System.out.printf("Usuário %s logado com sucesso.", login);
            }else{
                System.out.println("Login ou senha inválidos!");
                }
            }
        }
    }
}