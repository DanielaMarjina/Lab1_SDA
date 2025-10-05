import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        try {
            File fisier = new File("src//puncte.txt");
            Scanner sc = new Scanner(fisier);

            int n = sc.nextInt();
            Punct[] puncte = new Punct[n];

            for (int i = 0; i < n; i++) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                puncte[i] = new Punct(x, y);
            }

            Poligon poligon = new Poligon(puncte);
            System.out.println(poligon);
            System.out.println("Perimetrul este:"+poligon.perimetru());
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu a fost gasit");
        }

        EcGrad ec_grad = new EcGrad(2, 3);
        System.out.println(ec_grad.toString());
        System.out.println(ec_grad.Rezolva());

        Punct punct_1 = new Punct();
        System.out.println(punct_1.toString());

        Punct punct_a = new Punct(1, 4);
        Punct punct_b = new Punct(2, 5);
        System.out.println(punct_a);
        System.out.println(punct_b);
        System.out.println("Distanta este " + punct_b.distanta(punct_a));

        //Citire de la tastaura
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti coordonatele punctului");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        Punct punct_nou = new Punct(x, y);
        System.out.println(punct_nou);
        System.out.println("Distanta este " + punct_nou.distanta(punct_a));
        System.out.println("Distanta este " + punct_nou.distanta(punct_b));

        Punct pcte[] = new Punct[4];
        pcte[0] = new Punct(1, 2);
        pcte[1] = new Punct(4, 2);
        pcte[2] = new Punct(4, 4);
        pcte[3] = new Punct(1, 4);

        Poligon poligon = new Poligon(pcte);
        System.out.println(poligon.perimetru());


    }
}
