public class Motor extends Pojazd {
    public Motor(String marka, String model, String nrRej, String kolor, double cena, double spalanie, double stanZbiornika, double licznik) {
        super(marka, model, nrRej, kolor, cena, spalanie, stanZbiornika, licznik);
    }
    public void informacja()
    {
        System.out.println(super.info());
        //String pom= "Marka: "+super.marka+" Model: "+super.model+"Numer: "+super.nrRej+" Kolor: "+super.kolor+" Cena: "+super.cena+" Spalanie: "+super.spalanie+" Stan zbiornika: "+super.stanZbiornika+" Licznik: "+super.licznik;
        //return pom;
        //System.out.println("cos");
        //System.out.println("Numer: "+super.nrRej+" Kolor: "+super.kolor+" Cena: "+super.cena+" Spalanie: "+super.spalanie+" Stan zbiornika: "+super.stanZbiornika+" Licznik: "+super.licznik);
    }

    //public void informacja()
    //{
      //  System.out.println(super.info());
    //}
}
