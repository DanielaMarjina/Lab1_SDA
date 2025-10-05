import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Poligon {
    private Punct[] puncte;

    public Poligon(Punct[] puncte) {
        this.puncte = puncte;
    }

    public Poligon(String numeFisier) {
        ArrayList<Punct> listaPuncte = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(numeFisier));
            while (sc.hasNextDouble()) {
                double x = sc.nextDouble();
                if (!sc.hasNextDouble()) break;
                double y = sc.nextDouble();
                listaPuncte.add(new Punct(x, y));
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu a fost gasit");
        }
        puncte = new Punct[listaPuncte.size()];
        puncte = listaPuncte.toArray(puncte);
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

    public double aria() {
        double ariaTotala = 0.0;
        for (int i = 1; i < puncte.length - 1; i++) {
            double a = puncte[0].distanta(puncte[i]);
            double b = puncte[i].distanta(puncte[i + 1]);
            double c = puncte[i + 1].distanta(puncte[0]);

            double p = (a + b + c) / 2.0;
            double aria = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            ariaTotala += aria;
        }
        return ariaTotala;
    }

    public String toString() {
        String rezultat = "Poligon format din ";
        for (Punct p : puncte) {
            rezultat += p.toString() + " ";
        }
        return rezultat.trim();
    }
}
