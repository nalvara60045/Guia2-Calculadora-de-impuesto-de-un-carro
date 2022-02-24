package universidadean.impuestoscarro.mundo;

public class RangoImpuesto
{

    //Declaración de atributos
    private double inicio;
    private double fin;
    private double porcentaje;
    //constructor
    public RangoImpuesto(double start,double end,double percentage)
    {
        inicio = start;
        fin = end;
        porcentaje = percentage;
    }
    //Métodos
    public double darPorcentaje()
    {
        return 0.00;
    }
    public boolean contieneA()
        {
            boolean a= false;
            return a;
        }


}
