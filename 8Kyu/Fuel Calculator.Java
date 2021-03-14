//In this kata you will have to write a function that takes litres and pricePerLitre as arguments.
//Purchases of 2 or more litres get a discount of 5 cents per litre, purchases of 4 or more
//litres get a discount of 10 cents per litre, and so on every two litres,
//up to a maximum discount of 25 cents per litre. But total discount per
//litre cannot be more than 25 cents. Return the toal cost rounded to 2 decimal places.
//Also you can guess that there will not be negative or non-numeric inputs.
//
//Good Luck!

public class Kata {
    public static double fuelPrice(int litres, double pricePerLitre) {
        double pricePerLiterWithDescount = pricePerLitre;
        for (int i = 2; i <= 10; i += 2) {
            if (litres >= i) {
                pricePerLiterWithDescount -= 0.05;
            }
        }
        return Double.parseDouble(String.format("%.2f", litres * pricePerLiterWithDescount));
    }
}