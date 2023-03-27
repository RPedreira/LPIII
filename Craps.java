import java.util.Random;

public class Craps {
  public static void main(String[] args) {
    int dado1, dado2, ponto, jogada = 1;
    Random rand = new Random();

    dado1 = rand.nextInt(6) + 1;
    dado2 = rand.nextInt(6) + 1;
    ponto = dado1 + dado2;

    System.out.println("Dado 1 = " + dado1 + ", Dado 2 = " + dado2);
    System.out.println("Ponto = " + ponto);

    if (ponto == 7 || ponto == 11) {
      System.out.println("Vc ganhou :-)");
    } else if (ponto == 2 || ponto == 3 || ponto == 12) {
      System.out.println("Vc perdeu :-(");
    } else {
      System.out.println("Iniciando estágio 2");
      do {
        dado1 = rand.nextInt(6) + 1;
        dado2 = rand.nextInt(6) + 1;
        System.out.println("Dado 1 = " + dado1 + ", Dado 2 = " + dado2);
        System.out.println("Jogada " + jogada + " = " + (dado1 + dado2));
        jogada++;
      } while ((dado1 + dado2) != ponto && (dado1 + dado2) != 7);
      if ((dado1 + dado2) == 7) {
        System.out.println("Vc perdeu :-(");
      } else
        System.out.println("Vc ganhou :-)");
    }
  }
}