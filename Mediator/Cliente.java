abstract class Cliente{
    protected Marketplace marketplace;

    public Cliente(Marketplace marketplace){
        this.marketplace = marketplace;
    }

    public abstract void fazerPedido(String pedido, Vendedor vendedor);
    public abstract void receberNotificacao(String pedido, String msg, String vendedor);
    public abstract String getName();
}