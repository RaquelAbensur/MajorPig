package majorpig;

public class User {
    
    String email;
    String senha;

    Conta conta = new Conta();
    BotMajorPig bot = new BotMajorPig();

    public void verifConta(int i) {
    }

    public void addDados(String newEmail,String newSenha){
        this.email = newEmail;
        this.senha = newSenha;
    }
}
