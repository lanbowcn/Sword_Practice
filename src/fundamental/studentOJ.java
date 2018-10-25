package fundamental;

public class studentOJ {
    int id;
    int age;
    String name;
    Computer comp;

    public void study() {
        System.out.println("I'm studying!"+" use: "+comp.Brand);;
    }

    public void play(){
        System.out.println("I'm playing !!xixi!");
    }

     public static void main(String[] args){
        studentOJ student=new studentOJ();
        student.age=18;
        student.id=1033;
        student.name="zhaopp";

        Computer com = new Computer();
        com.Brand="lenovo";

        student.comp=com;

        student.play();
        student.study();
     }


}
class Computer{
    String Brand;
}