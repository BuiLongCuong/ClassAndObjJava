import java.util.Scanner;

public class QuadraticEquation {
    public double a;
    public double b;
    public double c;

    QuadraticEquation(double a, double b, double c){
        this.a =a;
        this.b =b;
        this.c =c;
    }
    public void showInfo(){
        System.out.println("Ba số của phương trình bậc 2: "+a+" , "+b+" , "+c);
    }
    public void tinhToan(){
       double Denta= b*b-4*a*c;
       double canBacHaiDenta = Math.sqrt(Denta);
       if(Denta <0){
           System.out.println("Phương trình vô nghiệm!");
       }else if(Denta ==0){
           double nghiemKep = ((-b)/(2*a));
           System.out.println("Phương trình có nghiệm kép: x="+nghiemKep);
       }else if(Denta >0){
           double x1= ((-b)+ canBacHaiDenta)/(2*a);
           double x2= ((-b)- canBacHaiDenta)/(2*a);
           System.out.println("Phương trình có 2 nghiệm phân biệt: x1="+x1+" , x2="+x2);
       }
    }
}
class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập 3 số cho phương trình bậc 2: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation pt1 = new QuadraticEquation(a,b,c);
        pt1.showInfo();
        pt1.tinhToan();
    }
}
