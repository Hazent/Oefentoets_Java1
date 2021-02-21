//Vincent Hazekamp - S1140691

package src.Klassen;
import java.awt.*;

public class Tussenstop {
    private String naam;
    private int bevolking;
    private int afstand;
    private static Tussenstop nieuwsteTussenstop;
    private boolean heeftOverstap;
    private Color kleur;

    public Tussenstop(String n, int bevolking, int afstand, String kleur, boolean heeftOverstap){
        this.naam = n;
        this.bevolking = bevolking;
        this.afstand = afstand;
        this.kleur = Color.decode(kleur);
        this.heeftOverstap = heeftOverstap;
    }

    public Tussenstop(String n, int bevolking, int afstand){
        this(n, bevolking, afstand, "", false);
    }

    public int getBevolking(){return this.bevolking;}
    public String getNaam(){return this.naam;}
    public boolean getHeeftOverstap(){return this.heeftOverstap;}
    public int getAfstand(){return this.afstand;}
    public Color getKleur(){return this.kleur;}

    public void setBevolking(int b){this.bevolking = b;}
    public void setNaam(String n){this.naam = n;}
    public void setHeeftOverstap(boolean o){this.heeftOverstap = o;}
    public void setAfstand(int a){this.afstand = a;}
    public void setKleur(String k){this.kleur = Color.decode(k);}

    public static Tussenstop getNieuwsteTussenstop(){return Tussenstop.nieuwsteTussenstop;}
    
}
