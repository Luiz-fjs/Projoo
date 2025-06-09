import java.util.List;
import java.util.ArrayList;

class MarketplaceConcreto implements Marketplace {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Vendedor> vendedores = new ArrayList<>();

    public void registrarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void registrarVendedor(Vendedor vendedor){
        vendedores.add(vendedor);
    }

    public void fazerPedido(String pedido, Cliente origem, Vendedor destino){
        if (vendedores.contains(destino)){
            destino.receberPedido(pedido, origem.getName());
        }
        
    }

    public void informarSobrePedido(String pedido, String msg, Vendedor origem, Cliente destino){
        if (clientes.contains(destino)){
            destino.receberNotificacao(pedido, msg, origem.getName());
        }
    }
}