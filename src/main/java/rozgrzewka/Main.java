package rozgrzewka;

public class Main {

    public static void main(String[] args){

        Margaritha pizza1 = new Margaritha(30,400);
        System.out.println("Pizza1  " + pizza1.getPrice() + " zl" + pizza1.getWeight());
        System.out.println(pizza1.description());

        Napoli pizza2 = new Napoli(35,400);
        System.out.println("Pizza2  " + pizza2.getPrice() + " zl" + pizza2.getWeight());
        System.out.println(pizza2.description());
        Arabiata pasta1 = new Arabiata(31,380);
        System.out.println("Pasta1  " + pasta1.getPrice() + " zl" + pasta1.getWeight());

        AglioOlio pasta2 = new AglioOlio(34,410);
        System.out.println("Pasta2  " + pasta2.getPrice() + " zl" + pasta2.getWeight());



    }
}
