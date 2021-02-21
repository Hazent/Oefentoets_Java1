//Vincent Hazekamp - S1140691

package src.Klassen;
import java.awt.*;

public class Tussenstop extends Halte {
    private int afstand;
    private static Tussenstop nieuwsteTussenstop;
    private boolean heeftOverstap;
    private Color kleur;

    public Tussenstop(String n, int bevolking, int afstand, String kleur, boolean heeftOverstap){
        super(n, bevolking);
        this.afstand = afstand;
        setKleur(kleur);
        this.heeftOverstap = heeftOverstap;

        Tussenstop.nieuwsteTussenstop = this;
    }

    public Tussenstop(String n, int bevolking, int afstand){
        this(n, bevolking, afstand, "?", false);

        Tussenstop.nieuwsteTussenstop = this;
    }

    public String toString(){
        return super.getNaam()+", bevolking: "+super.getBevolking()+" inwoners, afstand: "+afstand+" km, heeftOverstap: "+heeftOverstap;
    }


    public boolean getHeeftOverstap(){return this.heeftOverstap;}
    public int getAfstand(){return this.afstand;}
    public Color getKleur(){return this.kleur;}

    public void setHeeftOverstap(boolean o){this.heeftOverstap = o;}
    public void setAfstand(int a){this.afstand = a;}
    public void setKleur(String k){
        if(k.equals("rood")){
            this.kleur = Color.red;
        } else if(k.equals("paars")){
            this.kleur = Color.magenta;
        } else if(k.equals("zwart")){
            this.kleur = Color.black;
        } else if(k.equals("blauw")){
            this.kleur = Color.blue;
        } else if(k.equals("?")){
            this.kleur = Color.yellow;
        } else {
            this.kleur = Color.yellow;
        }
    }

    public static Tussenstop getNieuwsteTussenstop(){return Tussenstop.nieuwsteTussenstop;}
    
}
