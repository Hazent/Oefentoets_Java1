//Vincent Hazekamp - S1140691

package src.Klassen;

public class Eindhalte {
    private String naam;
    private int bevolking;

    public Eindhalte(String n, int bevolking){
        this.naam = n;
        this.bevolking = bevolking;
    }

    public int getBevolking(){return this.bevolking;}
    public String getNaam(){return this.naam;}
    public void setNaam(String n){this.naam = n;}
    
}
