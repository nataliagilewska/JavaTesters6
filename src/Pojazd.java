public abstract class Pojazd {
    protected String marka;
    protected String model;
    protected String nrRej;
    protected String kolor;
    protected double cena;
    protected double spalanie;
    protected double stanZbiornika;
    protected double licznik;

    public Pojazd(String marka, String model, String nrRej, String kolor, double cena, double spalanie, double stanZbiornika, double licznik)
    {
        this.marka=marka;
        this.model=model;
        this.nrRej=nrRej;
        this.kolor=kolor;
        this.cena=cena;
        this.spalanie=spalanie;
        this.stanZbiornika=stanZbiornika;
        this.licznik=licznik;
    }

    public String info()
    {
        return "Marka: "+marka+" Model: "+model+" Numer: "+nrRej+" Kolor: "+kolor+" Cena: "+cena+" Spalanie: "+spalanie+" Stan zbiornika: "+stanZbiornika+" Licznik: "+licznik;
    }

    public void jedz(double ile)
    {
        licznik+=ile;
        stanZbiornika-=(ile*0.1);
        if (stanZbiornika<0)
        {
            stanZbiornika=0;
        }
    }

    public void tankuj (double ileLac)
    {
        stanZbiornika+=ileLac;
    }



    //(String nrRej, String kolor, double cena, double spalanie, double stanZbiornika, double licznik, int ileDrzwi)
    //    {
}
