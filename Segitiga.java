public class Segitiga {
    double alas;
    double tinggi;
    double sisi1;
    double sisi2;

    Segitiga() {
        this.alas = 0;
        this.tinggi = 0;
        this.sisi1 = 0;
        this.sisi2 = 0;
    }

    Segitiga(double alas, double tinggi, double sisi1, double sisi2) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    void setAlas(double alas) {
        this.alas = alas;
    }

    void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    void setSisi1(double sisi1) {
        this.sisi1 = sisi1;
    }

    void setSisi2(double sisi2) {
        this.sisi2 = sisi2;
    }

    double getAlas() {
        return alas;
    }

    double getTinggi() {
        return tinggi;
    }

    double getSisi1() {
        return sisi1;
    }

    double getSisi2() {
        return sisi2;
    }

    double getLuas () {
        return (alas*tinggi/2);
    }

    double getKeliling() {
        return alas + sisi1 * sisi2;
    }
}
