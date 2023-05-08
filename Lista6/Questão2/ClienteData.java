public class ClienteData {
    public static void main(String args []){
        Data data01 = new Data(11, 11, 1999), data02 = new Data();

        if(data01.isPrevious(data02))
        {
            System.out.println("Data01 é anterior a Data02");
            System.out.println("Data01 é " + data01.dayOfWeek());
            System.out.println("Data02 é " + data02.dayOfWeek());
            System.out.println("A diferença é de " + data01.howManyDays(data02) + " dias");
        }
        else
        {
            System.out.println("Data01 não é anterior a Data02");
            System.out.println("Data01 é " + data01.dayOfWeek());
            System.out.println("Data02 é " + data02.dayOfWeek());
            System.out.println("A diferença é de " + data01.howManyDays(data02) + " dias");
        }
        
        data02.setData(data01);
        if(data01.isPrevious(data02))
        {
            System.out.println("Data01 é anterior a Data02");
            System.out.println("Data01 é " + data01.dayOfWeek());
            System.out.println("Data02 é " + data02.dayOfWeek());
            System.out.println("A diferença é de " + data01.howManyDays(data02) + " dias");
        }
        else
        {
            System.out.println("Data01 não é anterior a Data02");
            System.out.println("Data01 é " + data01.dayOfWeek());
            System.out.println("Data02 é " + data02.dayOfWeek());
            System.out.println("A diferença é de " + data01.howManyDays(data02) + " dias");
        }

        data02.setDia(16);
        if(data01.isPrevious(data02))
        {
            System.out.println("Data01 é anterior a Data02");
            System.out.println("Data01 é " + data01.dayOfWeek());
            System.out.println("Data02 é " + data02.dayOfWeek());
            System.out.println("A diferença é de " + data01.howManyDays(data02) + " dias");
        }
        else
        {
            System.out.println("Data01 não é anterior a Data02");
            System.out.println("Data01 é " + data01.dayOfWeek());
            System.out.println("Data02 é " + data02.dayOfWeek());
            System.out.println("A diferença é de " + data01.howManyDays(data02) + " dias");
        }
    }
    
}
