package com.mycompany.interfacetb;

public class pedidoOBJ {
    private String lanche_pedido, bebida_pedido, porcao_pedido, sobremesa_pedido, molho_pedido;

    public String getLanche_pedido() {
        return lanche_pedido;
    }

    public void setLanche_pedido(String lanche_pedido) {
        this.lanche_pedido = lanche_pedido;
    }

    public String getBebida_pedido() {
        return bebida_pedido;
    }

    public void setBebida_pedido(String bebida_pedido) {
        this.bebida_pedido = bebida_pedido;
    }

    public String getPorcao_pedido() {
        return porcao_pedido;
    }

    public void setPorcao_pedido(String porcao_pedido) {
        this.porcao_pedido = porcao_pedido;
    }

    public String getSobremesa_pedido() {
        return sobremesa_pedido;
    }

    public void setSobremesa_pedido(String sobremesa_pedido) {
        this.sobremesa_pedido = sobremesa_pedido;
    }

    public String getMolho_pedido() {
        return molho_pedido;
    }

    public void setMolho_pedido(String molho_pedido) {
        this.molho_pedido = molho_pedido;
    }
    
    
    public String status_pedido(){
        return"-----Seu Pedido!-----"+
                "\nLanche: "+this.lanche_pedido+
                "\nBebida: "+this.bebida_pedido+
                "\nPorção: "+this.porcao_pedido+
                "\nSobremesa: "+this.sobremesa_pedido+
                "\nMolho: "+this.molho_pedido+
                "\n";
    }
}
