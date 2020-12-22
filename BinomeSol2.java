public class BinomeSol2 extends Binome
{
    private double rac1, rac2;

    public BinomeSol2 (double pa, double pb, double pc, double pdis)
    {
        super(pa, pb, pc, pdis);
    }

    public void calculer_racine ()
    {  
      //le calcule des deux racines en cas d'existence de deux solutions
        this.rac1 = (-this.b - Math.sqrt(this.dis)) / (2 * this.a);
        this.rac2 = (-this.b + Math.sqrt(this.dis)) / (2 * this.a);
    }

    public int nb_racine ()
    {
        return 2;
    }

    public double valeur_racine (int i)
    {
        if (i == 1)
          return this.rac1;

        else if (i == 2)
          return this.rac2;

        else
          return 0.0;
    }
}
