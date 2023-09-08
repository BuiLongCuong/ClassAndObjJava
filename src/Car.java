 public class Car{
    public String name;
    public String color;
    public double weight;
    public int soBanh;
    public Car( String name,String color, double weight, int soBanh){
        this.name= name;
        this.color = color;
        this.weight = weight;
        this.soBanh = soBanh;
    }
    public void go(){
        System.out.println(this.name + this.color+" đang chạy");
        System.out.println(this.name+" đang chạy");
    }
}


class Main1 {
    public static void main(String[] args) {
       Car car1 = new Car("Mec", " black", 500, 4);
        car1.go();
    }
}