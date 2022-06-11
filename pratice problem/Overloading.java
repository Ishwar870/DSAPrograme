package Array;

public class Overloading {
    public int Overloading(int x , int y){
        return (x+y);
    }
    public int Overloading(int x , int y, int z){
        return (x+y+z);
    }
    public double Overloading(double x, double y){
        return (x+y);
    }
    public static void main(String[] args) {
        Overloading a = new Overloading();
        System.out.println(a.Overloading(10,20));
        System.out.println(a.Overloading(10,20,30));
        System.out.println(a.Overloading(20.0,30.0));
    }
}
