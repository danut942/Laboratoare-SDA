package ro.usv;

public class EcuatieGrad1 {
    private float a,b;

    EcuatieGrad1(float a,float b)
    {
        this.a=a;
        this.b=b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public String toString()
    {
        return getA()+"x+"+getB()+"=0";
    }
    public void rezolva()
    {
        float x = 0;
        if (a!=0)
        {
            x = (-b/a);
            System.out.println("=> x="+x+"\n");
        }else{
            System.out.println("result is undefined");
        }
    }

}