public class Main {
    public static void main(String[] args) {
        Director obj1 = new Director(new EngineeringStudentBuilder());
        Director obj2 = new Director(new MBAStudentBuilder());

        System.out.println(obj1.createStudent().toString());
        System.out.println(obj2.createStudent().toString());
    }
}