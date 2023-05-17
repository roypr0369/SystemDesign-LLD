import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        subjects.add("OS");
        subjects.add("OOPS");
        subjects.add("CN");
        subjects.add("DBMS");
        return this;
    }
}
