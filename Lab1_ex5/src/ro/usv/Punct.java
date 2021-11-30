package ro.usv;

public class Punct {
    private float x,y;
    Punct(float x, float y)
    {
        this.x=x;
        this.y=y;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public String toString()
    {
        return "("+getX()+","+getY()+")";
    }
    public double distanta(Punct p)
    {
        // Formula pentru distanta euclidianaAa
        // d(p,q) = sqrt( (xp-xq)^2 + (yp-yq)^2)
        double result=Math.sqrt(Math.pow(getX()-p.getX(),2)+Math.pow(getY()-p.getY(),2));
        return result;
    }
}
