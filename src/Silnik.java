public abstract class Silnik {
    Boolean uruchomiony;

    public Silnik(Boolean uruchomiony)
    {
        this.uruchomiony=uruchomiony;
    }

    public void wlaczSilnik()
    {
        uruchomiony=true;
    }
    public void wylaczSilnik()
    {
        uruchomiony=false;
    }

}
