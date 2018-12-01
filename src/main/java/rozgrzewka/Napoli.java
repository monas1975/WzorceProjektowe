package rozgrzewka;

public class Napoli extends Pizza {
    public Napoli(double price, double weight) {
        super(price, weight);
    }

    public String description() {
        return "Pizza smaczna ";
    }
}
