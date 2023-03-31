import java.util.Scanner;

public class BatalhaNaval{
    public static void main(String[] args){
        char[][] jogador1 = new char[5][5] , jogador2 = new char[5][5], visual1 = new char[5][5], visual2 = new char[5][5];
        int linha, coluna, jogador = 1, barcos1 = 5, barcos2 = 5, turno;
        boolean flag;
        Scanner scan = new Scanner(System.in);

        inicia_matriz(jogador1);
        inicia_matriz(jogador2);
        inicia_matriz(visual1);
        inicia_matriz(visual2);

        System.out.println("Welcome to Battleship!");
        
          // Define mapa jogador1
        System.out.println("PLAYER 1, ENTER YOUR SHIPS’ COORDINATES.");  
        for(int i = 0; i < 5; i++)
        {
              do
             {
                System.out.println("Enter ship " + (i+1) + " location:");
                linha = scan.nextInt();
                coluna = scan.nextInt();
                flag = valida_mapa(jogador1, linha, coluna);
                if(flag) jogador1[linha][coluna] = '@';
              }while(!flag);
        }
        printa_mapa (jogador1);
        // Define mapa jogador2
        System.out.println("PLAYER 2, ENTER YOUR SHIPS’ COORDINATES.");
        for(int i = 0; i < 5; i++)
        {
          do
          {
            System.out.println("Enter ship " + (i+1) + " location:");  
            linha = scan.nextInt();
            coluna = scan.nextInt();
            flag = valida_mapa(jogador2, linha, coluna);
            if(flag) jogador2[linha][coluna] = '@';
          }while(!flag);
        }
        printa_mapa (jogador2);

        do
        {
            if(jogador == 1)
            {
              System.out.println("Player 1, enter hit row/column:"); 
              linha = scan.nextInt();
              coluna = scan.nextInt();
              turno = batalha(visual1, jogador2, linha, coluna, jogador);
            }
            else
            {
              System.out.println("Player 2, enter hit row/column:");
              linha = scan.nextInt();
              coluna = scan.nextInt();
              turno = batalha(visual2, jogador1, linha, coluna, jogador);
            }

            if(turno == 1 && jogador == 1) jogador++;
            else if(turno == 1 && jogador == 2) jogador--;
            else if(turno == 2 && jogador == 1)
            {
                jogador++;
                barcos2--;
            }
            else if(turno == 2 && jogador == 2)
            {
                jogador--;
                barcos1--;
            }
        }while(barcos1 > 0 && barcos2 > 0);
      if(jogador == 1) System.out.println("PLAYER 2 WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!");
      else System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!");
      System.out.println("Final boards");
      System.out.println("");
      printa_mapa(jogador1);
      printa_mapa(jogador2);
    }

    public static void inicia_matriz (char[][] matriz){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++) matriz[i][j] = '-';
        }
    }

    public static boolean valida_mapa (char[][] matriz, int linha, int coluna){
        if((linha < 0 || linha > 4) || (coluna < 0 || coluna > 4))
        {
            System.out.println("Invalid coordinates. Choose different coordinates.");
            return false;
        }
        if(matriz[linha][coluna] == '@')
        {
            System.out.println("You already have a ship there. Choose different coordinates.");
            return false;
        }
        return true;
    }

    public static int valida_tiro (char[][] matriz, int linha, int coluna, int jogador){
      
      int result = 0;
      
      if((linha < 0 || linha > 4) || (coluna < 0 || coluna > 4))
        {
            System.out.println("Invalid coordinates. Choose different coordinates.");
          result = 0;  
        }
        else if(matriz[linha][coluna] == 'X' || matriz[linha][coluna] == 'O')
        {
            System.out.println("You already fired on this spot. Choose different coordinates.");
          result = 0;
        }
        else if(matriz[linha][coluna] == '-')
        {
            System.out.println("Player " + jogador + " MISSED!");
          result = 1;  
        }
        else if(matriz[linha][coluna] == '@')
        {
          System.out.print("Player " + jogador + " hit Player ");
          if(jogador == 1) System.out.println("2's SHIP!!!");
          else System.out.println("1's SHIP!!!");
          result = 2;  
        }
        return result;
    }

    public static int batalha(char[][] visual, char[][] matriz, int linha, int coluna, int jogador){
        int mov;

        mov = valida_tiro (matriz, linha, coluna, jogador);

        if(mov == 1)
        {
            matriz[linha][coluna] = 'O';
            visual[linha][coluna] = 'O';
            printa_mapa(visual);
        }
        else if(mov == 2)
        {
            matriz[linha][coluna] = 'X';
            visual[linha][coluna] = 'X';
            printa_mapa(visual);
        }
        return mov;
    }

    public static void printa_mapa (char[][] matriz){
      System.out.println("  0 1 2 3 4");
      for(int i = 0; i < 5; i++)
      {
        System.out.print(i);
        for(int j = 0; j < 5; j++) System.out.print(" " + matriz[i][j]);
        System.out.println(" ");
      }
      System.out.println(" ");
    }
}