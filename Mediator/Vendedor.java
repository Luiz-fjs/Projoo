abstract class Vendedor{
    protected Marketplace marketplace;

    public Vendedor(Marketplace marketplace){
        this.marketplace = marketplace;
    }

    public abstract void receberPedido(String pedido, String cliente);
    public abstract void informarPedido(String pedido, String msg, Cliente cliente);
    public abstract String getName();
}