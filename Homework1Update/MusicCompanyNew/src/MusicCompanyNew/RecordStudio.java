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
    //Task 1
    public String bookedStudio(Customer customer, int bookedHours) {
        if (bookedHours < maxBookedHoursPerDay) {
            int alreadyBooked = 0;
            alreadyBooked += bookedHours;
            leftHours = maxBookedHoursPerDay - bookedHours;
            return "The studio is booked successfully";
        }
        else {

            return "You can't book the studio for " + bookedHours + ". The left hours are:" + leftHours;
        }
    }

    //Task 2
    public String changePrice(double newPrice) {
        if (newPrice > minPricePerHour) {
            price = newPrice;
            return "You've changed the price successfully. The new price is: " + price;
        } else {
            return "You have to enter price bigger than " + minPricePerHour + " (minimal one)";
        }
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
