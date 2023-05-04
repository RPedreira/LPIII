import java.util.Scanner;
public class Contato {
    private String nome, email, telefone;
    private Data dataNascimento = new Data();

    private void setNome(){
        Scanner scan = new Scanner(System.in);
        String nome;
        nome = scan.nextLine();
        this.nome = nome;
    }

    private void setEmail(){
        Scanner scan = new Scanner(System.in);
        String email;
        email = scan.nextLine();
        this.email = email;
    }

    private void setTelefone(){
        Scanner scan = new Scanner(System.in);
        String telefone;
        telefone = scan.nextLine();
        this.telefone = telefone;
    }

    private String getNome(){
        return nome;
    }

    private String getEmail(){
        return email;
    }

    private String getTelefone(){
        return telefone;
    }
    
    public void inicializarContato(){
        setNome();
        setEmail();
        setTelefone();
        dataNascimento.inicializarData();
    }

    public void imprimirContato(){
        System.out.println("Nome = " + getNome());
        System.out.println("Email = " + getEmail());
        System.out.println("Telefone = " + getTelefone());
        System.out.print("Data de nascimento = ");
        dataNascimento.imprimirData();
    }

    public int calcularIdade(Data hoje){
        int result = 0;
        result = hoje.getAno() - dataNascimento.getAno();
        if(hoje.getMes() - dataNascimento.getMes() < 0)
            result--;
        else if(hoje.getMes() - dataNascimento.getMes() == 0 && hoje.getDia() - dataNascimento.getDia() < 0)
            result--;
        return result;
    }
   
}
