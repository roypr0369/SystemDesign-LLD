public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        subjects.add("Macro Economics");
        subjects.add("Micro Economics");
        subjects.add("Statistics");
        subjects.add("Quantitative Aptitude");
        return this;
    }
}
