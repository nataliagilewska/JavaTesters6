import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");


        Samochod s1 = new Samochod("Fiat", "126p", "BIA345", "czerwony", 100000, 5, 6, 25,3);
        s1.informacja();
        s1.tankuj(4);
        s1.informacja();
        s1.jedz(1);
        s1.informacja();
        Samochod s2 = new Samochod("Nissan", "Juke", "BIA102", "brazowy", 200000, 6, 2, 200000,5);
        Samochod s3 = new Samochod("Ford", "Mustang", "WAW123", "czerwony", 10000000, 10, 7, 5000000,5);

        Motor m1 = new Motor ("Yamaha", "Hamaki","LUB8765", "biały", 15000, 2, 4, 70);
        m1.informacja();
        m1.tankuj(1);
        m1.informacja();
        m1.jedz(100);
        m1.informacja();

        SamochodyDostawcze sd1= new SamochodyDostawcze("Fiat", "Dostawczak", "WAR345", "niebieski", 550000, 10, 4, 15000,3);
        sd1.informacja();
        sd1.tankuj(4);
        sd1.informacja();
        sd1.jedz(4);
        sd1.informacja();


        //ZAD. 6 z kolejnych zajec
        List<Samochod> listaSamochodow = new ArrayList<Samochod>();
        listaSamochodow.add(s1);
        listaSamochodow.add(s2);
        listaSamochodow.add(s3);
        System.out.println(listaSamochodow.get(0).marka+" "+listaSamochodow.get(0).model);
        System.out.println(listaSamochodow.get(1).marka+" "+listaSamochodow.get(1).model);
        System.out.println(listaSamochodow.get(2).marka+" "+listaSamochodow.get(2).model);
    }


}
