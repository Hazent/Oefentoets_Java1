//Vincent Hazekamp - S1140691

package src.Klassen;

public class Eindhalte extends Halte{
    public Eindhalte(String n, int bevolking){
        super(n, bevolking);
    }

    public String toString(){
        return "Eindhalte "+super.getNaam()+", bevolking: "+super.getBevolking()+" inwoners";
    }
}
