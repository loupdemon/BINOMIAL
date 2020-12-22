public class BinomeSol0 extends Binome
{
    public BinomeSol0 (double pa, double pb, double pc, double pdis)
    {
        super(pa, pb, pc, pdis);
    }

    public void calculer_racine ()
    {
        System.out.println("Pas de racine");
    }

    public int nb_racine ()
    {
        return 0;
    }

    public double valeur_racine (int i)
    {
        return 0.0;
    }
}
