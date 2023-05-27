public class Par<K,V>
{
    private K clave;
    private V valor;

    public Par ()
    {

    }
    public Par (K clave, V valor)
    {
        this.clave = clave;
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Par{" +
                "clave=" + clave +
                ", valor=" + valor +
                '}';
    }
}
