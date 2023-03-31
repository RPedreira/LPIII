import java.util.Scanner;

class Multimetro {
  public static void main(String[] args) {
    int i = 0;
    double[] valores = new double[10]
    double media = 0, desvio = 0;
    Scanner scan = new Scanner (System.in);

    while(i < 10){
      valores[i] = scan.nextDouble();
      media += valores[i];
      i++;
    }
    media /= i;
    i = 0;

    while(i<10){
      desvio += (valores[i] - media)*(valores[i] - media);
      System.out.println("Leitura " + (++i) + " : " + valores[i-1]);
    }
    desvio /= i;
    desvio = Math.sqrt(desvio);
    System.out.println("\nMédia = " + media);
    System.out.println("Desvio = " + desvio);
    if (desvio > 0.1*media) System.out.println("Multimetro quebrado!");
    else System.out.println("Multimetro funcionando!");
  }
}