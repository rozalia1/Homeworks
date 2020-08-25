package MusicCompanyNew;

import java.util.Dictionary;

public class Main {
    public static void main(String[] args) {
        Director d1 = new Director("Nikolov",43);
        Customer c1 = new Customer("Rozalia");
        RecordStudio rs1 = new RecordStudio(8,10.0);
        MusicCompany mc1 = new MusicCompany("The Voice",d1,rs1);

        Director d2 = new Director("Tsveti", 24);
        Customer c2 = new Customer("Vitomir");
        RecordStudio rs2 = new RecordStudio(12,22.0);
        MusicCompany mc2 = new MusicCompany("The City",d2,rs2);

        //Task 1
        System.out.println("Task 1:" + rs1.bookedStudio(c1,3));
        System.out.println("Task 1:" + rs1.bookedStudio(c1, 10));
        //Task 2
        System.out.println("Task 2:" + rs1.changePrice(12.0));
        //Task 3
        System.out.println("Task 3: The profit for this day is: " + rs1.profitPerDay());
        //Task 4
        System.out.println("Task 4: The price in Euro is: " + rs1.priceInEuro());
        System.out.println("Task 4: The price in Dollars is: " + rs1.priceInDollar());
        //Task 5
        System.out.println("Task 5: " + mc1.compareThePriceForTwoCompanies(mc1,mc2,rs1,rs2));
        //Task 6
        System.out.println("Task 6: The discounted price is: " + rs1.percentageDiscount(20.0));
        //Task 7
        System.out.println("Task 7: " + mc1.compareTheAgeOfTwoDirectors(mc1,mc2,d1,d2));
        System.out.println("Task 7: " + mc1.compareTheAgeOfTwoDirectors(mc1,mc2,d1,d2));
    }
}
