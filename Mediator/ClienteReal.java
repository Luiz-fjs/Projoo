class ClienteReal extends Cliente{
    private String nome;

    public ClienteReal(Marketplace marketplace, String nome){
        super(marketplace);
        this.nome = nome;
        marketplace.registrarCliente(this);
    }

    public String getName(){
        return nome;
    }

    public void fazerPedido(String pedido, Vendedor vendedor){
        marketplace.fazerPedido(pedido, this, vendedor);
    }

    public void receberNotificacao(String pedido, String msg, String vendedor){
        System.out.println("O status do seu produto " +pedido+ " é " +msg);
    };
}