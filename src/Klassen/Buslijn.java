//Vincent Hazekamp - S1140691

package src.Klassen;

import java.util.ArrayList;

public class Buslijn {
    private Eindhalte eindhalte;
    public ArrayList<Tussenstop> tussenstoplijst;

    public Buslijn(Eindhalte eindhalte){
        this.eindhalte = eindhalte;
        tussenstoplijst = new ArrayList<Tussenstop>();
    }

    public String getNaam(){return eindhalte.getNaam();}

    public void voegTussenstopToe(int bevolking, int afstand){
        tussenstoplijst.add(new Tussenstop("Stop", bevolking, afstand));
    }
    
    public void voegTussenStopToe(String n, int bevolking, int afstand, String kleur, boolean heeftOverstap){
        tussenstoplijst.add(new Tussenstop(n, bevolking, afstand, kleur, heeftOverstap));
    }

    public String toString(){
        return "Buslijn\nEindhalte:"+eindhalte+"\nTussenstops:"+tussenstoplijst;
    }

    public int zoekOp(String naam){
        Tussenstop x = new Tussenstop("", 0, 0);
        for(Tussenstop stop : tussenstoplijst){
            if(stop.getNaam().equals(naam)){
                x = stop;
            }
        }
        return tussenstoplijst.indexOf(x);
    }

    public boolean wijzigTussenstop(String naam_huidig, String naam_nieuw, String kleur_nieuw, boolean heeftOverstap_nieuw){
        boolean x = false;
        for(Tussenstop stop : tussenstoplijst){
            if(stop.getNaam().equals(naam_huidig)){
                stop.setNaam(naam_nieuw);
                stop.setKleur(kleur_nieuw);
                stop.setHeeftOverstap(heeftOverstap_nieuw);
                x = true;
            }
        }
        return x;
    }
}
