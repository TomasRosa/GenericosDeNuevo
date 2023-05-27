                            ///Solo permite tipos de datos subclase de ClasePadreGenerica
                            ///Herencia normal, extiende de ClasePadreGenerica<T>
public class ClaseHijaGenerica<T extends ClasePadreGenerica> extends ClasePadreGenerica<T>
{
    public ClaseHijaGenerica()
    {

    }
    public ClaseHijaGenerica(int valor)
    {
        super(valor);
    }
    public <T> boolean compararIdentidad (T elemento1, T elemento2)
    {
        return elemento1 == elemento2;
    }
    public <T> boolean compararIgualdad (T elemento1, T elemento2)
    {
        return elemento1.equals(elemento2);
    }

}
