package music;


public class Director{
    private String directorName;
    private int directorAge;

    public Director(String name, int age) {
        directorName = name;
        directorAge = age;
    }

    public String getDirectorName(){
        return directorName;
    }

    public int getDirectorAge(){
        return directorAge;
    }


    public void compareTwoDirectors(Director dr1, Director dr2){

        if(dr1.getDirectorAge()>dr2.getDirectorAge()){
            System.out.print("\n" + dr1.getDirectorName() + " is bigger than " + dr2.getDirectorName());
        }else{
            System.out.print("\n" + dr2.getDirectorName() + " is bigger than " + dr1.getDirectorName());
        }

    }

}
