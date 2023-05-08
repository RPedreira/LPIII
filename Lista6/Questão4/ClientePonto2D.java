public class ClientePonto2D {
    public static void main(String args []){
        Ponto2D ponto01 = new Ponto2D(), ponto02 = new Ponto2D(4, -5);

        ponto01.imprimirPonto();
        System.out.println("Quadrante do ponto01 = " + ponto01.quadrante());
        ponto02.imprimirPonto();
        System.out.println("Quadrante do ponto02 = " + ponto02.quadrante());
        System.out.println("A distancia entre os pontos é = " + ponto01.distancia(ponto02));
        System.out.println("A distancia entre o ponto02 e o ponto (5, 3) é = " + ponto02.distancia(5, 3));
        System.out.println("A distancia entre o ponto02 e a origem das coordenadas é = " + ponto02.distancia());
    }
}