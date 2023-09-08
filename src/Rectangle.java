import java.util.Scanner;

public class Rectangle {
    public double chieudai;
    public double chieurong;

    public Rectangle(double chieudai, double chieurong){
        this.chieudai=chieudai;
        this.chieurong=chieurong;
    }
    public void tinhDientich(){
        double S= this.chieudai*this.chieurong;
        System.out.println("Diện tích hình chữ nhật là : "+S);
    }
    public void tinhChuvi(){
        double CV= (this.chieudai+this.chieurong)*2;
        System.out.println("Chu vi hình chữ nhật là : "+CV);
    }
//    public void showInfoHcn(){
//        System.out.println("Chiều dài của hình chữ nhật: "+ this.chieudai);
//        System.out.println("Chiều rộng của hình chữ nhật: "+ this.chieurong);
//    }
}
class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chiều dài của hình chữ nhật: ");
        double chieudai = input.nextDouble();
        System.out.println("Nhập chiều rộng của hình chữ nhật: ");
        double chieurong = input.nextDouble();
        Rectangle hcn1 = new Rectangle(chieudai,chieurong);
//        hcn1.showInfoHcn();
        hcn1.tinhDientich();
        hcn1.tinhChuvi();
    }
}