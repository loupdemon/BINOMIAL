public class Binome
{
    // Donnees
    protected double a, b, c, dis;

    // Methodes
    public Binome (double pa, double pb, double pc, double pdis)
    {
        a = pa;
        b = pb;
        c = pc;
        dis = pdis;
    }

    public static Binome creation(double pa, double pb, double pc)
    {
        double delta;
        delta = pb * pb - 4.0 * pa * pc;
        if (delta < 0.0)
        {
            return new BinomeSol0(pa, pb, pc, delta);
        }
        else if (delta == 0.0)
        {
            return new BinomeSol1(pa, pb, pc, delta);
        }
        else
        {
            return new BinomeSol2(pa, pb, pc, delta);
        }
    }

    public void calculer_racine ()
    {
        // Mettre le/les résultat(s) dans des attributs de l'objet
        System.out.println("Erreur si ici !");
    }

    public int nb_racine ()
    {
        // ça va renvoyer 0, 1 ou 2 (à définir dans les 3 classes feuilles)
        System.out.println("Erreur si ici !");
        return 0;
    }

    public double valeur_racine (int i)
    {
        // Renvoi ième racine (déjà calculé par calculer_racine() )
        System.out.println("Erreur si ici !");
        return 0.0;
    }

    public static void main (String[] args)
    {
        Binome b[] = new Binome[4];
        int i, k;
        b[0] = Binome.creation(1.0,0.0,1.0);
        b[1] = Binome.creation(1.0,2.0,1.0);
        b[2] = Binome.creation(1.0,3.0,1.0);
        b[3] = Binome.creation(4.0,5.0,1.0);
        for (i=0; i<4; i++)
        {
          System.out.println("Binome "+i+": ");
          b[i].calculer_racine();
          if (b[i].nb_racine() == 0)
            System.out.println("Pas de solution!");
          else
          {
            for (k=1; k <= b[i].nb_racine(); k++)
              System.out.println("Racine n°" + k + "=" + b[i].valeur_racine(k) + " ");
          }
        }
    }
}
