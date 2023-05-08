public class RoboSimples {
    private  String nomeDoRobo;
    private int posicaoXAtual,posicaoYAtual;
    private String direcaoAtual;

    // Para o mapa de colisão poderia ser criada uma variável de classe no formato de matriz
    // ou criar uma lista de robôs no codigo principal e, antes de fazer o movimento, percorrer
    // a lista verificando se a posição futura do robô já está ocupada por algum outro robô.
    // Uma classe MapaDeColisao também resolveria...
    
    RoboSimples(String nome, int px, int py, String d){
        nomeDoRobo = nome;
        posicaoXAtual = px;
        posicaoYAtual = py;
        direcaoAtual = d;
    }

    RoboSimples(String nome){
        this(nome, 0, 0, "N");
    }

    RoboSimples(){
        this("Wally");
    }

    public void move(){
        this.move(1);
    }

    public void move(int passos){
        if (direcaoAtual == "N") posicaoYAtual += passos;
        if (direcaoAtual == "S") posicaoYAtual -= passos;
        if (direcaoAtual == "E") posicaoXAtual += passos;
        if (direcaoAtual == "O") posicaoXAtual -= passos;
        if (direcaoAtual == "NE")
        {
            posicaoXAtual += passos;
            posicaoYAtual += passos;
        }
        if (direcaoAtual == "NO")
        {
            posicaoXAtual -= passos;
            posicaoYAtual += passos;
        }
        if (direcaoAtual == "SE")
        {
            posicaoXAtual += passos;
            posicaoYAtual -= passos;
        }
        if (direcaoAtual == "SO")
        {
            posicaoXAtual -= passos;
            posicaoYAtual -= passos;
        }
    }

    public void mudaDireção(String novaDirecao){
        direcaoAtual = novaDirecao;
    }

    public String toString(){
        String str = "\nNome do robo: "+nomeDoRobo+"\n";
        str = str + "Posicao do robo: ("+posicaoXAtual+", "+posicaoYAtual+")\n";
        str = str + "Direcao do robo: "+direcaoAtual;

        return str;
    }

    public boolean validaRobo(String nome, String direcao){
        boolean flag = true;
        if(nome == null || (direcao != "N" && direcao != "S" && direcao != "E" && direcao != "O"))
            flag = false;
        return flag;
    }
}