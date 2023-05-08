public class Time{
    private int horas, minutos, segundos;

    public void setHoras(int horas){
        this.horas = horas;
    }

    public void setMinutos(int minutos){
        this.minutos = minutos;
    }

    public void setSegundos(int segundos){
        this.segundos = segundos;
    }

    public Time(int horas, int minutos, int segundos){
        if(validateTime(horas, minutos, segundos)){
            setHoras(horas);
            setMinutos(minutos);
            setSegundos(segundos);
        }
    }

    public Time(Time outraHora){
        this(outraHora.horas, outraHora.minutos, outraHora.segundos);
    }
    
    public Time(int horas, int minutos){
        this(horas, minutos, 0);
    }
    
    public Time(int horas){
        this(horas, 0);
    }

    public Time(){
        this(0);
    }

    public void infoTime(){
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }

    public boolean validateTime(int horas, int minutos, int segundos){
        boolean flag = false;
        if((horas >= 0 && horas < 24) && (minutos >= 0 && minutos < 60) && (segundos >= 0 && segundos <60))
            flag = true;
        return flag;
    }

    public boolean validateTime(int horas, int minutos){
        return validateTime(horas, minutos, 0);
    }

    public boolean validateTime(int horas){
        return validateTime(horas, 0);
    }

    public boolean isAm(){
        boolean flag = false;
        if(horas < 12)
            flag = true;
        return flag;
    }

    public int cron(Time outraHora){
        TimeAsInt agora = new TimeAsInt(horas, minutos, segundos), aux = new TimeAsInt(outraHora.horas, outraHora.minutos, outraHora.segundos);
        return agora.diff(aux);
    }

    public void intToStandart(TimeAsInt hora){
        horas = hora.getTempo() / 3600;
        minutos = hora.getTempo() % 3600;
        segundos = hora.getTempo() % 60;
    }

    public void addTime(int h, int m, int s){
        setSegundos(segundos + s);
        setMinutos(minutos + m + (segundos / 60));
        setSegundos(segundos % 60);
        setHoras(horas + h + (minutos / 60));
        setMinutos(minutos % 60);
        setHoras(horas % 24);
    }

    public void addTime(Time outraHora){
        addTime(outraHora.horas, outraHora.minutos, outraHora.segundos);
    }
    
    public void addTime(int m, int s){
        addTime(0, m, s);
    }

    public void addTime(int s){
        addTime(0, s);
    }

}