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
    public void showInfoHcn(){
        System.out.println("Chiều dài của hình chữ nhật: "+ this.chieudai);
        System.out.println("Chiều rộng của hình chữ nhật: "+ this.chieurong);
    }
}
class Main{
    public static void main(String[] args) {
        Rectangle hcn1 = new Rectangle(5.6,9);
        hcn1.showInfoHcn();
        hcn1.tinhDientich();
        hcn1.tinhChuvi();
    }
}