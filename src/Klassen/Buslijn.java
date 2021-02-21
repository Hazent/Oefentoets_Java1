package src.Klassen;

//Vincent Hazekamp - S1140691

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
    
}
