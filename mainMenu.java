import java.util.Scanner;

public class mainMenu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //segitiga
        System.out.println("=====SEGITIGA=====");
        System.out.print("Masukkan alas : ");
        double alas = in.nextDouble();
        System.out.print("Masukkan tinggi : ");
        double tinggi = in.nextDouble();
        System.out.print("Masukkan sisi 1 : ");
        double sisi1 = in.nextDouble();
        System.out.print("Masukkan sisi 2 :");
        double sisi2 = in.nextDouble();

        Segitiga s = new Segitiga();
        s.setAlas(alas);
        s.setTinggi(tinggi);
        s.setSisi1(sisi1);
        s.setSisi2(sisi2);

        System.out.printf("Luas segitiga adalah %.2f%n", s.getLuas());
        System.out.printf("Keliling segitiga adalah %.2f%n", s.getKeliling());
        System.out.println();
        



        //persegi
        System.out.println("=====PERSEGI======");
        System.out.print("Masukkan sisi : ");
        int sisi = in.nextInt();

        Persegi p = new Persegi();
        p.setSisi(sisi);

        System.out.println("Luas persegi adalah " +p.getLuas());
        System.out.println("Keliling persegi adalah " +p.getKeliling());
        System.out.println();




        //lingkaran
        System.out.println("=====LINGKARAN=====");
        System.out.print("Masukkan jari-jari : ");
        int r = in.nextInt();

        Lingkaran l = new Lingkaran();
        l.setR(r);

        System.out.printf("Luas lingkaran adalah %.2f%n", l.getLuas());
        System.out.printf("Keliling lingkaran adalah %.2f%n", l.getKeliling());

        in.close();
    }
}
