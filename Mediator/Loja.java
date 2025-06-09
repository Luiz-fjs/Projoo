class Loja extends Vendedor{
    private String nome;
    
    public Loja(Marketplace marketplace, String nome){
        super(marketplace);
        this.nome = nome;
        marketplace.registrarVendedor(this);
    }

    public String getName(){
        return nome;
    }

    public void receberPedido(String pedido, String cliente){
        System.out.println("Pedido: " + pedido + " feito por " + cliente);
    }

    public void informarPedido(String pedido, String msg, Cliente cliente){
        marketplace.informarSobrePedido(pedido, msg, this, cliente);
    }
}