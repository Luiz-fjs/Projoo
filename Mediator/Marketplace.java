interface Marketplace {
    void fazerPedido(String item, Cliente origem, Vendedor destino);
    void informarSobrePedido(String item, String msg, Vendedor origem, Cliente destino);
    void registrarCliente(Cliente cliente);
    void registrarVendedor(Vendedor Vendedor);
}