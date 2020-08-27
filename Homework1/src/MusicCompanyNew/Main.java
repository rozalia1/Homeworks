package MusicCompanyNew;

import java.util.Dictionary;

public class Main {
    public static void main(String[] args) {
        Director d1 = new Director("Nikolov",22);
        Customer c1 = new Customer("Rozalia");
        RecordStudio rs1 = new RecordStudio(8,13.0);
        MusicCompany mc1 = new MusicCompany("The Voice",d1,rs1);

        Director d2 = new Director("Tsveti", 43);
        Customer c2 = new Customer("Vitomir");
        RecordStudio rs2 = new RecordStudio(12,22.0);
        MusicCompany mc2 = new MusicCompany("The City",d2,rs2);

        //Task 1
        if(rs1.bookedStudio(c1,10) == 1){
            System.out.println("Task 1: The studio is booked successfully");
        }
        else{
            System.out.println("Task 1: You can't book the studio for so many hours.");
        }
        //Task 2
        if (rs1.getPrice() >= rs1.getMinPrice()) {
            System.out.println("Task 2: You've changed the price successfully. The new price is: " + rs1.getPrice());
        } else {
            System.out.println("Task 2: You can't set price lower than " + rs1.getMinPrice());
        }
        //Task 3
        System.out.println("Task 3: The profit for this day is: " + rs1.profitPerDay());
        //Task 4
        System.out.println("Task 4: The price in Euro is: " + rs1.priceInEuro());
        System.out.println("Task 4: The price in Dollars is: " + rs1.priceInDollar());
        //Task 5
        int a = mc1.compareThePriceForTwoCompanies(mc1,mc2,rs1,rs2);
        if (a==1){
            System.out.println("Task 5: " + mc1.getCompanyName() + " has higher price(" + rs1.getPrice() + ") than " + mc2.getCompanyName() +  "(" + rs2.getPrice() + ").");
        }
        else if (a==-1) {
            System.out.println("Task 5: " + mc2.getCompanyName() + " has higher price(" + rs2.getPrice() + ") than " + mc1.getCompanyName() +  "(" + rs1.getPrice() + ").");
        }
        else {
            System.out.println("Task 5: The prices of both companies are equals.");
        }
        //Task 6
        System.out.println("Task 6: The discounted price is: " + rs1.percentageDiscount(20.0));
        //Task 7
       int b = mc1.compareTheAgeOfTwoDirectors(mc1,mc2,d1,d2);
        if (b==1){
            System.out.println("Task 7: The director " + d1.getDirectorName() + "(" + d1.getAge() +  ") is bigger than " + d2.getDirectorName() + "(" + d2.getAge() + ").");
        }
        else if (b==-1) {
            System.out.println("Task 7: The director " + d2.getDirectorName() + "(" + d2.getAge() +  ") is bigger than " + d1.getDirectorName() + "(" + d1.getAge() + ").");
        }
        else {
            System.out.println("Task 7: The age of the two directors is the same.");
        }
    }
}
