package Arithmetic;

/**
 * to do
 * - add()
 * - subtract()
 * - multiply()
 * - divide()
 * - getMin()
 * - getMax()**/

public class Arithmetic<T extends Number,E extends Number> {
    private T a;
    private E b;

    private double res = 0.0;
    public Arithmetic(T a, E b){
        this.a = a;
        this.b = b;
    }
    public Number add(){
        res = this.a.doubleValue() + this.b.doubleValue();
        return res;
    }

    public Number subtract(){
        res = this.a.doubleValue() - this.b.doubleValue();
        return res;
    }

    public Number multiply(){
        res = this.a.doubleValue() * this.b.doubleValue();
        return res;
    }

    public Number divide(){
        if(this.b.doubleValue() == 0){
            System.out.println("Cannot divide by zero!");
        }
        res = this.a.doubleValue() / this.b.doubleValue();
        return res;
    }

    public Number getMin(){
        return Math.min(a.doubleValue(),b.doubleValue());
    }

    public Number getMax(){
        return Math.max(a.doubleValue(),b.doubleValue());
    }
}

