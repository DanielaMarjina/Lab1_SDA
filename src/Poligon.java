

public class Poligon {
    private Punct[] puncte;

    public Poligon(Punct[] puncte) {
        this.puncte = puncte;
    }

    public double perimetru()
    {
        double perimetru=0.0;
        for (int i=0;i< puncte.length-1;i++)
        {
            perimetru+=puncte[i].distanta(puncte[i+1]);
        }
        perimetru+=puncte[puncte.length-1].distanta(puncte[0]);
        return perimetru;
    }

    public String toString() {
        String rezultat = "Poligon format din ";
        for (Punct p : puncte) {
            rezultat += p.toString() + " ";
        }
        return rezultat.trim();
    }
}
