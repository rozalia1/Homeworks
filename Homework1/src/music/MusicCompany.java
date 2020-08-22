package music;


public class MusicCompany{
    private String companyName;
    public Director director;
    public RecordStudio studio;



    public MusicCompany(String name, Director director, RecordStudio studio){
        companyName = name;
        this.director = director;
        this.studio = studio;
    }

    public void compareTwoMusicComapanyPrices(RecordStudio st1, RecordStudio st2){

        if(st1.getPricePerHour()> st2.getPricePerHour()){
            System.out.print("\n" + companyName + " has higher price per hour.");
        }else{
            System.out.print("\n" + companyName + " has lower price per hour.");
        }

    }

}
