public class Director {
    StudentBuilder studentBuilder;
    Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }else{
            return createMBAStudent();
        }
    }

    private Student createMBAStudent() {
        return studentBuilder.setAge(15).setRollNumber(69).setSubjects().build();
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setAge(20).setRollNumber(68).setSubjects().build();
    }
}
