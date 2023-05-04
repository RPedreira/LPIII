import java.util.Scanner;

public class Data {
    private int dia, mes, ano;

    public void inicializarData(){
        int dia = 0, mes = 0, ano = 0;
        boolean valido = false;
        Scanner scan = new Scanner(System.in);
        while(!valido)
        {
            dia = scan.nextInt();
            mes = scan.nextInt();
            ano = scan.nextInt();
            valido = verificarData(dia, mes, ano);
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean verificarData(int dia, int mes, int ano){
        boolean result = false;
        if(ano >= 0)
        {
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
            {
                if(dia > 0 && dia <= 31)
                    result = true;
            }
            else if(mes == 4 || mes == 6 || mes == 9 || mes == 11)
            {
                if(dia > 0 && dia <= 30)
                    result = true;
            }
            else
            {
                if(ano%4 != 0 && dia > 0 && dia <= 28)
                    result = true;
                else if(ano%4 == 0 && dia > 0 && dia <= 29)
                    result = true;
            }
        }
        if(result)
            System.out.println("Esta data é válida!");
        else
            System.out.println("Esta data é inválida!");
        return result;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    public void imprimirData(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    public void imprimirDataExtenso(){
        System.out.print(dia + " de ");
        if(mes == 1)
            System.out.println("janeiro de " + ano);
        else if(mes == 2)
            System.out.println("fevereiro de " + ano);
        else if(mes == 3)
            System.out.println("março de " + ano);
        else if(mes == 4)
            System.out.println("abril de " + ano);
        else if(mes == 5)
            System.out.println("maio de " + ano);
        else if(mes == 6)
            System.out.println("junho de " + ano);
        else if(mes == 7)
            System.out.println("julho de " + ano);
        else if(mes == 8)
            System.out.println("agosto de " + ano);
        else if(mes == 9)
            System.out.println("setembro de " + ano);
        else if(mes == 10)
            System.out.println("outubro de " + ano);
        else if(mes == 11)
            System.out.println("novembro de " + ano);
        else
            System.out.println("dezembro de " + ano);
    }
}
