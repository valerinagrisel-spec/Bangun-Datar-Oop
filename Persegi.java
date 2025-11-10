
public class Persegi {
    int sisi;

    Persegi() {
        this.sisi = 0;
    }

    Persegi(int sisi) {
        this.sisi = sisi;
    }

    void setSisi(int sisi) {
        this.sisi = sisi;
    }

    int getSisi() {
        return sisi;
    }

    int getLuas() {
        return sisi*sisi;
    }

    int getKeliling() {
        return 4*sisi;
    }
}




