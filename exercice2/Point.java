public class Point {
    char nom;
    double abscisse;

    void initialiser(char n, double a) {
        nom = n;
        abscisse = a;
    }

    void initialiser(Point p) {
        nom = p.nom;
        abscisse = p.abscisse;
    }

    void affiche() {
        System.out.println("Point " + nom + " : abscisse = " + abscisse);
    }

    void translate(double val) {
        abscisse = abscisse + val;
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.initialiser('A', 3.5);
        p1.affiche();

        p1.translate(2.0);
        p1.affiche();

        Point p2 = new Point();
        p2.initialiser(p1);
        p2.affiche();
    }
}