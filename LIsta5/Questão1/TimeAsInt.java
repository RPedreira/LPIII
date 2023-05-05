public class TimeAsInt {
    private int tempo;

    public int getTempo(){
        return tempo;
    }
    
    public void standartToInt(int horas, int minutos, int segundos){
        tempo = segundos + (minutos * 60) + (horas * 3600);
    }

    public TimeAsInt(){}

    public TimeAsInt(int tempo){
        if(validateTimeAsInt(tempo))
            this.tempo = tempo;
        else
            this.tempo = 0;
    }

    public TimeAsInt(int horas, int minutos, int segundos){
        if(validateTime(horas, minutos, segundos))
            standartToInt(horas, minutos, segundos);
    }
    
    public boolean validateTimeAsInt(int tempo){
        boolean flag = false;
        if(tempo >= 0 && tempo < 86400)
            flag = true;
        return flag;
    }

    public boolean validateTime(int horas, int minutos, int segundos){
        boolean flag = false;
        if((horas >= 0 && horas < 24) && (minutos >= 0 && minutos < 60) && (segundos >= 0 && segundos <60))
            flag = true;
        return flag;
    }

    public int diff(TimeAsInt outraHora){
        int diferença;
        if(getTempo() < outraHora.getTempo())
            diferença = outraHora.getTempo() - getTempo();
        else
            diferença = getTempo() - outraHora.getTempo();
        return diferença;
    }

}
