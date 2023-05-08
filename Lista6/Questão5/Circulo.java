public class Circulo {
    private int x, y, r;

    public Circulo(int x, int y, int r){
        setAbscissa(x);
        setOrdenada(y);
        if(validaCirculo(r))
            setRaio(r);
        else
            setRaio(1);
    }

    public Circulo(){
        this(0, 0, 1);
    }

    public Circulo(int r){
        this(0, 0, r);
    }
    
    public Circulo(int x, int y){
        this(x, y, 1);
    }

    public boolean validaCirculo(int r){
        boolean flag = false;
        if(r > 0)
            flag = true;
        return flag;
    }

    public void setAbscissa(int x){
        this.x = x;
    }

    public void setOrdenada(int y){
        this.y = y;
    }

    public void setRaio(int r){
        this.r = r;
    }

    public int getAbscissa(){
        return x;
    }
    

    public int getOrdenada(){
        return y;
    }


    public int getRaio(){
        return r;
    }

    public void imprimirCirculo(){
        System.out.println("Centro = (" + getAbscissa() + ", " + getOrdenada() + ")");
        System.out.println("Raio = " + getRaio());
        System.out.println("Perimetro = " + perimeter());
        System.out.println("Área = " + area());
    }

    public float area(){
        return (float)Math.PI * r * r;
    }

    public float perimeter(){
        return (float)Math.PI * 2 * r;
    }

    public boolean isInnerPoint(Ponto2D point){
        boolean flag = false;
        if(r - distancia(point) >= 0)
            flag = true;
        return flag;
    }

    public float distancia(Ponto2D p){
        float result;
        result = (float)Math.sqrt(((getAbscissa() - p.getX()) * (getAbscissa() - p.getX())) + ((getOrdenada() - p.getY()) * (getOrdenada() - p.getY())));
        return result;
    }

    public boolean isBiggerThan(Circulo outroCirculo){
        boolean flag = false;
        if(area() > outroCirculo.area())
            flag = true;
        return flag;
    }

}
