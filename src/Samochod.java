public class Samochod extends Pojazd {
    int ileDrzwi;
    public Samochod(String marka, String model, String nrRej, String kolor, double cena, double spalanie, double stanZbiornika, double licznik, int ileDrzwi)
    {
        super(marka, model, nrRej, kolor, cena, spalanie, stanZbiornika, licznik);
        this.ileDrzwi=ileDrzwi;
    }
    public void informacja()
    {
        System.out.println(super.info()+ " Ilość drzwi: "+ileDrzwi);
        //String pom= "Numer: "+super.nrRej+" Kolor: "+super.kolor+" Cena: "+super.cena+" Spalanie: "+super.spalanie+" Stan zbiornika: "+super.stanZbiornika+" Licznik: "+super.licznik;
        //return pom;
        //System.out.println("cos");
        //System.out.println("Numer: "+super.nrRej+" Kolor: "+super.kolor+" Cena: "+super.cena+" Spalanie: "+super.spalanie+" Stan zbiornika: "+super.stanZbiornika+" Licznik: "+super.licznik);
    }
}
