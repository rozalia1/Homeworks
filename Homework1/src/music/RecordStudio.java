package music;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

public class RecordStudio {
    private final double minPricePerHour = 10.0;
    private int rentedHours;
    private double pricePerHour;
    private int maxRentHours = 8;

    public double getPricePerHour (){
        return pricePerHour;
    }

    public RecordStudio (int hours, double price){
    this.rentedHours = hours;
    this.pricePerHour = price;

}
    public void bookStudio(int rentHours,Customer customer){
        if(this.rentedHours + rentHours > maxRentHours){
            int freeHours = maxRentHours - rentedHours;
            System.out.print("You can't book this studio for these hours. Free hours left: " + freeHours);
        }else{
            System.out.println("You have booked the studio successfully!");
        }
    }

    public void changePricePerHour (double newPrice){
        pricePerHour = newPrice;
        System.out.print("\nThe amended price is:" +newPrice);

    }

    public void studioProfit(int rentedHours){
        double profit = 0.0;
        profit = rentedHours*pricePerHour;
        System.out.print("\nThe profit for today is: " + profit);
    }

    public void studioProfitEuroAndDollar(int rentedHours){
        double profitEuro = 0.0, profitDollar = 0.0;
        double euro = 1.96;
        double dollar = 1.66;
        profitEuro = rentedHours*pricePerHour*euro;
        profitDollar = rentedHours*pricePerHour*dollar;
        System.out.print("\nThe profit in EURO for today is: " + profitEuro);
        System.out.print("\nThe profit in Dollar for today is: " + profitDollar);
    }

    public void discountByPersentage (int percentage){
        double devidePercentage = 0.0;
        devidePercentage = percentage/100.0;
        double discoutnPrice= devidePercentage*pricePerHour;
        double finalPrice = pricePerHour - discoutnPrice;
        if(finalPrice < minPricePerHour){
            System.out.print("\nThis price is lower than the minumal!" );
        }
        else {
            System.out.print("\nThe price with the persentage discount is: " + finalPrice);
        }
    }
}

