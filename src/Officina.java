public class Officina {

    private Nodo head;
    private int nPostiMax = 10;
    private int nPostiOccupati;

    public void aggiungiInTesta(Object info) {
        if (nPostiOccupati <= nPostiMax) {
            head = new Nodo(info, head);
            ++nPostiOccupati;
        }
        else
            System.out.println("L'officina è piena");
    }

    public void rimuoviInTesta() {
        if (nPostiOccupati > 0)
            head = head.getLink();
        else
            System.out.println("L'officina è vuota");

    }


}
