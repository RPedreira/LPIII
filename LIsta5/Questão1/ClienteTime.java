public class ClienteTime {
    public static void main(String args []){
        Time hora01 = new Time(23, 50, 12), hora02 = new Time(21, 40, 30);

        hora01.infoTime();
        hora02.infoTime();

        if(hora01.isAm())
            System.out.println("Hora01 é manhã");
        else
            System.out.println("Hora01 não é manhã");
        if(hora02.isAm())
            System.out.println("Hora02 é manhã");
        else
            System.out.println("Hora02 não é manhã");

        System.out.println("A diferença entre os dois é de " + hora01.cron(hora02) + " segundos");
        
        hora01.addSeconds(20000);
        if(hora01.isAm())
            System.out.println("Hora01 é manhã");
        else
            System.out.println("Hora01 não é manhã");
        if(hora02.isAm())
            System.out.println("Hora02 é manhã");
        else
            System.out.println("Hora02 não é manhã");

        System.out.println("A diferença entre os dois é de " + hora01.cron(hora02) + " segundos");
    }
    
}
