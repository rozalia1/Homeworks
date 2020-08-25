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
    public String compareThePriceForTwoCompanies(MusicCompany musicCompany, MusicCompany musicCompany1, RecordStudio recordStudio, RecordStudio recordStudio1){
        double firstPrice = recordStudio.getPrice();
        double secondPrice = recordStudio1.getPrice();
        if (firstPrice > secondPrice){
            return "The studio price of " + musicCompany.getCompanyName() + " is " + firstPrice + " and it is bigger than the price of  second studio " + musicCompany1.getCompanyName() +" which is " + secondPrice ;
        }
        else {
            return "The studio price of " + musicCompany1.getCompanyName() + " is " + secondPrice + " and it is bigger than the price of  second studio " + musicCompany.getCompanyName() +" which is " + firstPrice;
        }
    }
    //Task 7
    public String compareTheAgeOfTwoDirectors (MusicCompany musicCompany, MusicCompany musicCompany1,Director director, Director director1){
        int firstAge = director.getAge();
        int secondAge = director1.getAge();
        if (firstAge>secondAge){
            return "The director of " + musicCompany.getCompanyName() + " is older (" +firstAge+ ") than the director of " + musicCompany1.getCompanyName() + " - " + secondAge;
        }
        else {
            return "The director of " + musicCompany1.getCompanyName() + " is older (" +secondAge+ ") than the director of " + musicCompany.getCompanyName() + " - " + firstAge;
        }
    }

}
