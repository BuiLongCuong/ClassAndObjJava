import java.util.Arrays;
import java.util.Scanner;

public class Student {
    public String name;
    public int age;
    public double[] arrScores;

    Student(String name, int age, double[] arr) {
        this.name = name;
        this.age = age;
        this.arrScores = arr;
    }

    public void showInfo() {
        System.out.println("Họ và tên: " + this.name);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Điểm: " + Arrays.toString(this.arrScores));
    }

    public double agvScores() {
        int count = 0;
        double sum = 0;
        for (int i = 0; i < arrScores.length; i++) {
            sum += arrScores[i];
            count++;
        }
        double avg = sum / count;
        System.out.println("Điểm trung bình của sv: " + avg);
        return avg;
    }

    //    public void choice(){
//        System.out.println("1.Chỉnh sửa thông tin");
//        System.out.println("2.Lưu");
//        Scanner input = new Scanner(System.in);
//        int choice = input.nextInt();
//        switch (choice){
//            case 1:
//                editInfo();
//                break;
//            case 2:
//                System.out.println("Thông tin đã được lưu!");
//                break;
//            default:
//                System.out.println("Mời bạn chọn lại!");
//        }
//    }
//    public void editInfo(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập tên của sinh viên:");
//        String name =input.nextLine();
//        System.out.println("Nhập tuổi của sinh viên:");
//        int age = input.nextInt();
//        System.out.println("Nhập điểm của 4 môn:");
//        double scores1= input.nextDouble();
//        double scores2= input.nextDouble();
//        double scores3= input.nextDouble();
//        double scores4= input.nextDouble();
//        Student sv1 = new Student(name, age, new double[] {scores1,scores2,scores3,scores4});
//        sv1.showInfo();
//    }
}

class Main3{
    public static void main(String[] args) {
//        for (int i = 1; i < 3; i++) {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Nhập tên của sinh viên "+ i+":");
//            String name = input.nextLine();
//            System.out.println("Nhập tuổi của sinh viên "+i+":");
//            int age = input.nextInt();
//            System.out.println("Nhập điểm 4 môn của sinh viên "+i+":");
//            double scores1 = input.nextDouble();
//            double scores2 = input.nextDouble();
//            double scores3 = input.nextDouble();
//            double scores4 = input.nextDouble();
//            Student sv1 = new Student(name, age, new double[]{scores1, scores2, scores3, scores4});
//            Student sv2 = new Student(name, age, new double[]{scores1, scores2, scores3, scores4});
//            sv1.showInfo();
//            sv1.agvScores();
//            sv1.choice();
//            sv2.showInfo();
//            sv2.agvScores();
//            sv2.choice();
//        }
        Student sv1 = new Student("Vương Quốc An", 18, new double[]{7, 8, 9, 10});
//        sv1.showInfo();
        double avgSv1= sv1.agvScores();
//        System.out.println(avgSv1);
        Student sv2 = new Student("Dương Văn Bản", 18, new double[]{6, 8, 8, 9});
//        sv2.showInfo();
        double avgSv2= sv2.agvScores();
//        System.out.println(avgSv2);
        if(avgSv1>avgSv2){
            sv1.showInfo();
            sv1.agvScores();
        }else {
            sv2.showInfo();
            sv2.agvScores();
        }
    }
}