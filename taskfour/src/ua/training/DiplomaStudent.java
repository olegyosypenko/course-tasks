package ua.training;

public class DiplomaStudent extends Student{
    private String diplomaTheme;

    public DiplomaStudent(String diplomaTheme, String name, int course, int id) {
        super(name, course, id);
        this.diplomaTheme = diplomaTheme;
    }

    public String getDiplomaTheme() {
        return diplomaTheme;
    }

    public void setDiplomaTheme(String diplomaTheme) {
        this.diplomaTheme = diplomaTheme;
    }
}
