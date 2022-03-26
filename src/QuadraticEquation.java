public class QuadraticEquation {
    double a, b, c;
    double r1;
    double r2;
     static double delta;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    public double getDiscriminant() {
        delta = this.b * this.b - 4 * this.a * this.c;
        return delta;
    }


    public double getR1(){
        return r1 = -this.b+ Math.sqrt(this.delta)/2*a;
    }

    public double getR2(){
        return r2 = -this.b- Math.sqrt(this.delta)/2*a;
    }

    public void findRoot(){
        if (this.getDiscriminant()<0){
            System.out.println("The equation has no root.");
        }
        else if (this.getDiscriminant()==0){
            System.out.println("The equation has one root is: " +this.getR1());
        } else {
        System.out.printf("Equation has 2 roots Root1:%f Root2:%f",this.getR1(), this.getR2());
    }

}}
