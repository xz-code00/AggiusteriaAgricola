public class Tosaerba extends Macchinario {

    protected int nRuote;

    public Tosaerba(String marcaMacchinario, int nRuote){
        super(marcaMacchinario);
        this.nRuote = nRuote;
    }

    public String toString(){
        return super.toString() + nRuote;
    }

}
