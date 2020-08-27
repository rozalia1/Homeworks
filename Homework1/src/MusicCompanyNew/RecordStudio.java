package MusicCompanyNew;

public class RecordStudio {

    private int maxBookedHoursPerDay;
    private double price;
    private int leftHours;
    public Customer customer;
    final private double minPricePerHour = 10.0;

    RecordStudio( int maxBookedHoursPerDay, double price) {
        this.maxBookedHoursPerDay = maxBookedHoursPerDay;
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    public double getMinPrice(){
        return minPricePerHour;
    }
    public int getLeftHours(){
        return leftHours;
    }

    //Task 1
    public int bookedStudio(Customer customer, int bookedHours) {
        if (bookedHours < maxBookedHoursPerDay) {
            int alreadyBooked = 0;
            alreadyBooked += bookedHours;
            leftHours = maxBookedHoursPerDay - bookedHours;
            return 1;
        }
        else {
            return 0;
        }
    }

    //Task 2
    public double changePrice(double newPrice) {
        price = newPrice;
        return newPrice;
    }
    //Task 3
    public double profitPerDay (){
        return price*(maxBookedHoursPerDay-leftHours);
    }
    //Task 4
    public double priceInEuro (){
        return profitPerDay()*1.96;
    }
    public double priceInDollar(){
        return profitPerDay()*1.65;
    }

    //Task 6
    public double percentageDiscount (double percentage){
        double modifiedPercentage = percentage/100;
        double discount = modifiedPercentage*price;
        return price-discount;
    }
}
