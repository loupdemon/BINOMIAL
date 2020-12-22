public class BinomeSol1 extends Binome
{
    private double rac1;

    public BinomeSol1 (double pa, double pb, double pc, double pdis)
    {
        super(pa, pb, pc, pdis);
    }

    public void calculer_racine ()
    {
        this.rac1 = (-this.b) / (2 * this.a);
    }

    public int nb_racine ()
    {
        return 1;
    }

    public double valeur_racine (int i)
    {
        if (i == 1)
          return this.rac1;

        else
          return 0.0;
    }
}
