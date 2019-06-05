public abstract class Pojazd {
    protected String marka;
    protected String model;
    protected String nrRej;
    protected String kolor;
    protected double cena;
    protected double spalanie;
    protected double stanZbiornika;
    protected double licznik;

    public Pojazd(String nrRej, String kolor, double cena, double spalanie, double stanZbiornika, double licznik)
    {
        this.nrRej=nrRej;
        this.kolor=kolor;
        this.cena=cena;
        this.spalanie=spalanie;
        this.stanZbiornika=stanZbiornika;
        this.licznik=licznik;
    }

    public void info()
    {
        System.out.println("Numer: "+nrRej+" Kolor: "+kolor+" Cena: "+cena+" Spalanie: "+spalanie+" Stan zbiornika: "+stanZbiornika+" Licznik: "+licznik);
    }

}
