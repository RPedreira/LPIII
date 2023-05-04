public class ClienteContato {
    public static void main(String args []){
        Contato contato01 = new Contato();
        Data hoje = new Data();
        int idade;

        hoje.inicializarData();
        contato01.inicializarContato();
        idade = contato01.calcularIdade(hoje);
        contato01.imprimirContato();
        System.out.println("Idade de contato01 = " + idade);
    }
}
