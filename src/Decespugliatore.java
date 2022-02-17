public class Decespugliatore extends Macchinario {

    protected boolean accensioneElettronica;

    public Decespugliatore(String marcaMacchinario, boolean accensioneElettronica){
        super(marcaMacchinario);
        this.accensioneElettronica = accensioneElettronica;
    }
}
