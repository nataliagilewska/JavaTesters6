public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");


        Samochod s1 = new Samochod("Fiat", "126p", "BIA345", "czerwony", 100000, 5, 6, 25,3);
        s1.informacja();
        s1.tankuj(4);
        s1.informacja();

        Motor m1 = new Motor ("Yamaha", "Hamaki","LUB8765", "biały", 15000, 2, 4, 70);
        m1.informacja();
        m1.tankuj(1);
        m1.informacja();

        SamochodyDostawcze sd1= new SamochodyDostawcze("Fiat", "Dostawczak", "WAR345", "niebieski", 550000, 10, 4, 15000,3);
        sd1.informacja();
        sd1.tankuj(4);
        sd1.informacja();
    }


}
