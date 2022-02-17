public class Motozappa extends Macchinario {

    protected int nRuote;

    public Motozappa(String marcaMacchinario, int nRuote){
        super(marcaMacchinario);
        this.nRuote = nRuote;
    }

    public String toString(){
        return super.toString() + nRuote;
    }
}
