package MusicCompanyNew;

public class Director {
    private String directorName;
    private int age;

    public Director(String directorName, int age) {
        this.directorName = directorName;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getDirectorName(){
        return directorName;
    }
}
