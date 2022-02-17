abstract public class Macchinario {

    protected static int numeroOrdine;
    protected String marcaMacchinario;
    protected double costoTotRiparazione;

    public Macchinario(String marcaMacchinario){
        numeroOrdine++;
        this.marcaMacchinario = marcaMacchinario;
        costoTotRiparazione = 0;
    }

    public String toString(){
        return numeroOrdine + marcaMacchinario + costoTotRiparazione;
    }
}
