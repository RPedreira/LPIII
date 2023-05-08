public class Ponto2D {
    private int x, y;
    
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;
    }
        
    public Ponto2D(){
        this(0, 0);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void imprimirPonto(){
        System.out.println("(" + getX() + ", " + getY() + ")");
    }

    public boolean isEixoX(){
        boolean result = false;
        if(y == 0)
            result = true;
        return result;
    }

    public boolean isEixoY(){
        boolean result = false;
        if(x == 0)
            result = true;
        return result;
    }

    public boolean isEixos(){
        boolean result = false;
        if(y == 0 && x == 0)
            result = true;
        return result;
    }

    public int quadrante(){
        int result;
        if(isEixos() || isEixoX() || isEixoY())
            result = 0;
        else if(x > 0 && y > 0)
            result = 1;
        else if(x < 0 && y > 0)
            result = 2;
        else if(x < 0 && y < 0)
            result = 3;
        else
            result = 4;
        return result;
    }

    public float distancia(int x, int y){
        float result;
        result = (float)Math.sqrt(((getX() - x) * (getX() - x)) + ((getY() - y) * (getY() - y)));
        return result;
    }
    
    public float distancia(Ponto2D p){
        return distancia(p.getX(), p.getY());
    }

    public float distancia(){
        return distancia(0, 0);
    }

}