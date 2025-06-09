public class SimulacaoCompra{
    public static void main(String[] args) {
        Marketplace amazon = new MarketplaceConcreto();

        ClienteReal cliente = new ClienteReal(amazon, "Maria");
        Loja loja = new Loja(amazon, "Lolja");

        cliente.fazerPedido("Camiseta Como Treinar Seu Dragao", loja);

        loja.informarPedido("Camiseta Como Treinar Seu Dragao", "Saiu para entrega", cliente);
    }
}