public class Etagere {
    Livre[] livres;
    int nbLivres;

    Etagere(int capacite) {
        livres = new Livre[capacite];
        nbLivres = 0;
    }

    public int getCapacite() {
        return livres.length;
    }

    public int getNbLivres() {
        return nbLivres;
    }

    public void ajouter(Livre l) {
        if (nbLivres == livres.length) {
            System.out.println("Etagere pleine !");
        } else {
            livres[nbLivres] = l;
            nbLivres++;
        }
    }

    public Livre getLivre(int position) {
        return livres[position - 1];
    }

    public int chercher(String titre, String auteur) {
        for (int i = 0; i < nbLivres; i++) {
            if (livres[i].getTitre().equals(titre) && livres[i].getAuteur().equals(auteur)) {
                return i + 1;
            }
        }
        return 0;
    }

    public void supprimer(int position) {
        for (int i = position - 1; i < nbLivres - 1; i++) {
            livres[i] = livres[i + 1];
        }
        livres[nbLivres - 1] = null;
        nbLivres--;
    }

    public static void main(String[] args) {
        Livre l1 = new Livre("Java pour les nuls", "Barry Burd", 300);
        Livre l2 = new Livre("Clean Code", "Robert Martin", 464, 150.0);
        Livre l3 = new Livre("Design Patterns", "Gang of Four", 395, 200.0);

        Etagere e = new Etagere(5);
        e.ajouter(l1);
        e.ajouter(l2);
        e.ajouter(l3);

        System.out.println(e.getLivre(1));
        System.out.println("Position de Clean Code : " + e.chercher("Clean Code", "Robert Martin"));
        System.out.println("Comparaison : " + l1.compare(l2));

        l1.setPrix(99.0);
        l1.setPrix(120.0); // doit afficher erreur

        System.out.println(l1);
    }
}