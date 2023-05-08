public class ClienteRoboSimples {
    public static void main(String args []){
        RoboSimples robo01 = new RoboSimples(), robo02 = new RoboSimples("Bender"), robo03 = new RoboSimples("Bartolomeo", 1, 1, "NE");

        System.out.println(robo01.toString());
        System.out.println(robo02.toString());
        System.out.println(robo03.toString());

        robo02.mudaDireção("NO");
        robo01.move();
        robo02.move();
        robo03.move(5);

        System.out.println(robo01.toString());
        System.out.println(robo02.toString());
        System.out.println(robo03.toString());
    }
}
