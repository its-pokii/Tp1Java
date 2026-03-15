package exercice3;

public class Point {
    String nom;
    double abscisse;

    Point(String n, double a) {
        nom = n;
        abscisse = a;
    }

    void affiche() {
        System.out.println("Point " + nom + " abscisse = " + abscisse);
    }

    void translate(double val) {
        abscisse = abscisse + val;
    }

    public static void main(String[] args) {
        Point p = new Point("A", 5.0);
        p.affiche();
        p.translate(3.0);
        p.affiche();
    }
}
