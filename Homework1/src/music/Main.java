package music;

import com.sun.deploy.util.SessionState;
import sun.security.x509.DeltaCRLIndicatorExtension;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Director d1 = new Director("Ivan",16);
        Customer c1 = new Customer("Petar");
        RecordStudio r1 = new RecordStudio(0, 13.0);
        Director d2 = new Director("Gary",43);
        Customer c2 = new Customer("Ivona");
        RecordStudio r2 = new RecordStudio(5,30.0);

        // Task 1
        MusicCompany company = new MusicCompany("The Voice Company",d1,r1);
        MusicCompany company1 = new MusicCompany("The Best Company",d2,r2);
        company.studio.bookStudio(10, c1);
        // Task 2
        company.studio.changePricePerHour(28.0);
        // Task 3
        company.studio.studioProfit(8);
        // Task 4
        company.studio.studioProfitEuroAndDollar(8);
        // Task 5
        company.compareTwoMusicComapanyPrices(r1, r2);
        // Task 6
        company.studio.discountByPersentage(30);
        //Task 7
        d1.compareTwoDirectors(d1,d2);
    }
}
