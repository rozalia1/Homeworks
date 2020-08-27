package MusicCompanyNew;

public class MusicCompany {
    private String companyName;
    Director director;
    RecordStudio recordStudio;

    MusicCompany (String companyName, Director director, RecordStudio recordStudio){
        this.companyName = companyName;
        this.director = director;
        this.recordStudio = recordStudio;
    }
    public String getCompanyName (){
        return companyName;
    }

    ///Task 5
    public int compareThePriceForTwoCompanies(MusicCompany musicCompany, MusicCompany musicCompany1, RecordStudio recordStudio, RecordStudio recordStudio1){
        double firstPrice = recordStudio.getPrice();
        double secondPrice = recordStudio1.getPrice();
        Integer first = new Integer((int)firstPrice);
        Integer second = new Integer((int)secondPrice);
        return first.compareTo(second);

    }
    //Task 7
    public int compareTheAgeOfTwoDirectors (MusicCompany musicCompany, MusicCompany musicCompany1, Director director, Director director1){
        int firstAge = director.getAge();
        int secondAge = director1.getAge();
        Integer first = new Integer(firstAge);
        Integer second = new Integer(secondAge);
        return  first.compareTo(second);
    }


}
