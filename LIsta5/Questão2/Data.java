public class Data {
    private int dia, mes, ano;

    public Data(){}

    public Data(int dia, int mes, int ano){
        if(verificarData(dia, mes, ano))
        {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
        else
        {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
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

    public boolean isPrevious(Data outraData){
        boolean flag = false;

        if(ano < outraData.getAno())
            flag = true;
        else if(ano == outraData.getAno())
        {
            if(mes < outraData.getMes())
                flag = true;
            else if(mes == outraData.getMes())
            {
                if(dia < outraData.getDia())
                    flag = true;
            }
        }
        return flag;
    }

    public int allDaysSinceZero(){
        int total, aux;
        total = ((ano - 1) * 365) + ((ano - 1) / 4);
        aux = mes - 1;
        switch(aux)
        {
            case 1: total += 31;
                    break;
            case 2: total += 59;
                    break;
            case 3: total += 90;
                    break;
            case 4: total += 120;
                    break;
            case 5: total += 151;
                    break;
            case 6: total += 181;
                    break;
            case 7: total += 212;
                    break;
            case 8: total += 243;
                    break;
            case 9: total += 273;
                    break;
            case 10:total += 304;
                    break;
            case 11:total += 334;
                    break;
        }
        total += dia;
        return total;
    }

    public int howManyDays(Data outraData){
        int total1, total2;

        total1 = allDaysSinceZero();
        total2 = outraData.allDaysSinceZero();

        return total2 - total1;
    }

    public String dayOfWeek(){
        int aux;
        String result;
        aux = allDaysSinceZero() % 7;
        switch(aux){
            case 1: result = "Domingo";
                    break;
            case 2: result = "Segunda-feira";
                    break;
            case 3: result = "Terça-feira";
                    break;
            case 4: result = "Quarta-feira";
                    break;
            case 5: result = "Quinta-feira";
                    break;
            case 6: result = "Sexta-feira";
                    break;
            default:result = "Sábado";
                    break;
        }
        return result;
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
        return result;
    }

}
