public class ClienteData {
    public static void main(String args []){
        Data data01 = new Data();
        Data data02 = new Data();
        int dia, mes, ano;

        data01.setDia(1);
        data01.setMes(12);
        data01.setAno(2020);

        dia = data01.getDia();
        mes = data01.getMes();
        ano = data01.getAno();

        System.out.println("Data01 = " + dia + '/' + mes + '/' + ano);

        data02.inicializarData();
        data01.imprimirData();
        data02.imprimirData();
        data01.imprimirDataExtenso();
        data02.imprimirDataExtenso();
    }
}
