package com.mycompany.interfacetb;

public class sobremesaOBJ {
    private String nome_sobremesa, sabor_sobremesa, tipo_sobremesa, categoria_sobremesa;

    public String getNome_sobremesa() {
        return nome_sobremesa;
    }

    public void setNome_sobremesa(String nome_sobremesa) {
        this.nome_sobremesa = nome_sobremesa;
    }

    public String getSabor_sobremesa() {
        return sabor_sobremesa;
    }

    public void setSabor_sobremesa(String sabor_sobremsa) {
        this.sabor_sobremesa = sabor_sobremsa;
    }

    public String getTipo_sobremesa() {
        return tipo_sobremesa;
    }

    public void setTipo_sobremesa(String tipo_sobremesa) {
        this.tipo_sobremesa = tipo_sobremesa;
    }

    public String getCategoria_sobremesa() {
        return categoria_sobremesa;
    }

    public void setCategoria_sobremesa(String categoria_sobremesa) {
        this.categoria_sobremesa = categoria_sobremesa;
    }
    
    
    public String status_sobremesa(){
        return"-----Nova Sobremesa!-----"+
                "\nNome da Sobremesa: "+this.nome_sobremesa+
                "\nSabor: "+this.sabor_sobremesa+
                "\nTipo: "+this.tipo_sobremesa+
                "\nCategoria: "+this.categoria_sobremesa+
                "\n";
    }
}
