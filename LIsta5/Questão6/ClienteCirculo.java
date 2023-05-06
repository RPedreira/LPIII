public class ClienteCirculo {
    public static void main(String args []){
        Circulo circulo01 = new Circulo(), circulo02 = new Circulo(3, 4), circulo03 = new Circulo(5);
        Ponto2D ponto = new Ponto2D(1, 1);

        System.out.println("Circulo01 :");
        circulo01.imprimirCirculo();
        System.out.println("Circulo02 :");
        circulo02.imprimirCirculo();
        System.out.println("Circulo03 :");
        circulo03.imprimirCirculo();

        if(circulo01.isBiggerThan(circulo02))
            System.out.println("Circulo01 é maior que Circulo02");
        else
            System.out.println("Circulo01 não é maior que Circulo02");
        if(circulo01.isBiggerThan(circulo03))
            System.out.println("Circulo01 é maior que Circulo03");
        else
            System.out.println("Circulo01 não é maior que Circulo03");
        if(circulo02.isBiggerThan(circulo03))
            System.out.println("Circulo02 é maior que Circulo03");
        else
            System.out.println("Circulo02 não é maior que Circulo03");

        if(circulo01.isInnerPoint(ponto))
            System.out.println("O ponto está contido no Circulo01");
        else
            System.out.println("O ponto não está contido no Circulo01");
        if(circulo02.isInnerPoint(ponto))
            System.out.println("O ponto está contido no Circulo02");
        else
            System.out.println("O ponto não está contido no Circulo02");
        if(circulo03.isInnerPoint(ponto))
            System.out.println("O ponto está contido no Circulo03");
        else
            System.out.println("O ponto não está contido no Circulo03");
    }
    
}
