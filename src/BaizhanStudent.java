public class BaizhanStudent {

    int id;
    String sname;
    int age;
    Computer computer;

    void study(){
        System.out.println(""+computer.brand);
    }
    public static void main(String[] args) {
        Computer c1= new Computer();
        c1.brand = "lianxiang";
        c1.price = 6000;

        Computer c2= new Computer();
        c2.brand = "deil";
        c2.price =5000;

        BaizhanStudent stu1= new BaizhanStudent()；
        stu1.id=1001;
        stu1.name="gaoqi";
        stu1.age=18;
        stu1.computer=c1;

        stu1.study();


    }
}
