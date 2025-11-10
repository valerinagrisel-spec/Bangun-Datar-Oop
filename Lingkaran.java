public class Lingkaran {
    double r;

    Lingkaran() {
        this.r = 0;
    }

    Lingkaran(double r) {
        this.r = r;
    }

    void setR(double r) {
        this.r = r;
    }

    double getR() {
        return r;
    }
    
    double getLuas() {
        return Math.PI *r*r;
    }

    double getKeliling() {
        return 2*Math.PI*r;
    }
}
