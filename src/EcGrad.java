public class EcGrad {
    private double a;
    private double b;

    public EcGrad(double a, double b) {
        this.a = a;
        this.b = b;
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

    @Override
    public String toString() {
        return a+"x+"+b+"=0";
    }

//    public String Rezolva()
//    {
//        if (a==0 && b==0){
//            return "Infinitate de solutii";
//        }
//        else if (a==0)
//        {
//            return "Nu e posibil";
//        }
//        else {
//            double x=-b/a;
//            return "Solutia este "+x;
//        }
//    }

    public String Rezolva()
        {
            if (a==0 && b==0){
                throw new IllegalArgumentException("Infinitate de solutii");
            }
            else if (a==0)
            {
                throw new IllegalArgumentException("Nu e posibil");
            }
            else {
                double x=-b/a;
                return "Solutia este "+x;
            }
        }
}
