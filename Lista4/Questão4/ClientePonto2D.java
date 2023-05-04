public class ClientePonto2D {
    public static void main(String args []){
        Ponto2D ponto01 = new Ponto2D(), ponto02 = new Ponto2D();

        ponto01.setX(0);
        ponto01.setY(0);
        ponto02.setX(4);
        ponto02.setY(-5);

        ponto01.imprimirPonto();
        System.out.println("Quadrante do ponto01 = " + ponto01.quadrante());
        ponto02.imprimirPonto();
        System.out.println("Quadrante do ponto02 = " + ponto02.quadrante());
        System.out.println("A distancia entre os pontos é = " + ponto01.distancia(ponto02));
    }
}
