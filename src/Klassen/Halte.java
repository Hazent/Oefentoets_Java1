package src.Klassen;

public abstract class Halte {
    private String naam;
    private int bevolking;

    public Halte(String n, int bevolking){
        if(n.equals("") || n == null){
            this.naam = "????";
        } else {
            this.naam = n;
        }
        this.bevolking = bevolking;
    }

    public int getBevolking(){return this.bevolking;}
    public String getNaam(){return this.naam;}

    public void setBevolking(int b){this.bevolking = b;}
    public void setNaam(String n){this.naam = n;}
}
