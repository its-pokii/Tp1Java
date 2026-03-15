public class Personne {
    String CIN;
    String Nom;
    String Prenom;
    String Email;
    int Age;

    void initialiser(String cin, String nom, String prenom, String email, int age) {
        CIN = cin;
        Nom = nom;
        Prenom = prenom;
        Email = email;
        Age = age;
    }

    void afficherPersonne() {
        System.out.println("CIN : " + CIN);
        System.out.println("Nom : " + Nom);
        System.out.println("Prenom : " + Prenom);
        System.out.println("Email : " + Email);
        System.out.println("Age : " + Age);
    }
}
