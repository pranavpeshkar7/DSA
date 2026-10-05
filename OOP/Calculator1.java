public class Calculator1 {
    public static void main(String args[]){
        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(9, 4);
        Complex a = Complex.add(c1,c2);
        Complex d = Complex.diff(c1, c2);
        Complex p = Complex.product(c1, c2);
        a.printComplex();
        d.printComplex();
        p.printComplex();
    }
}

class Complex{
    int real;
    int imag;

    Complex(int r, int i){
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real), (a.imag+b.imag));
    }

    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real), (a.imag-b.imag));
    }

    public static Complex product(Complex a, Complex b){
        return new Complex(((a.real*b.real)-(a.imag*b.imag)), ((a.real*b.real)+(a.imag*b.imag)));
    }

    public void printComplex(){
        if(real == 0 && imag!=0){
            System.out.println(imag + "i");
        }else if(real!=0 && imag == 0){
            System.out.println(real);
        }else{
            System.out.println(real+"+"+imag+"i");
        }
    }
}