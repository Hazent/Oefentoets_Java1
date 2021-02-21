//Vincent Hazekamp - S1140691

import src.Klassen.*;

public class MainProgramma{
    public static void main(String[] args) {
        //Vraag 1A
        Eindhalte e1 = new Eindhalte("Zwolle CS", 57745);

        System.out.println(e1);

        Eindhalte e2 = new Eindhalte("", 18304);
        System.out.println(e2);

        //Vraag 1B
        Tussenstop t1 = new Tussenstop("Hattem", 8987, 3, "rood", true);
        System.out.println(t1);

        System.out.println(Tussenstop.getNieuwsteTussenstop());

        Tussenstop t2 = new Tussenstop("Kampen", 10214, 9, "paars", true);
        
        System.out.println(Tussenstop.getNieuwsteTussenstop());
    }
}