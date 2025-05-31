package com.mycompany.interfacetb;

public class bebidaOBJ {
    private String nome_bebida, base_bebida, tipo_bebida, sabor_bebida;

    public String getNome_bebida() {
        return nome_bebida;
    }

    public void setNome_bebida(String nome_bebida) {
        this.nome_bebida = nome_bebida;
    }

    public String getBase_bebida() {
        return base_bebida;
    }

    public void setBase_bebida(String base_bebida) {
        this.base_bebida = base_bebida;
    }

    public String getTipo_bebida() {
        return tipo_bebida;
    }

    public void setTipo_bebida(String tipo_bebida) {
        this.tipo_bebida = tipo_bebida;
    }

    public String getSabor_bebida() {
        return sabor_bebida;
    }

    public void setSabor_bebida(String sabor_bebida) {
        this.sabor_bebida = sabor_bebida;
    }
    
    
    public String status_bebida(){
        return"-----Nova Bebida!-----"+
                "\nNome da Bebida: "+this.nome_bebida+
               "\nBase: "+this.base_bebida+
                "\nTipo: "+this.tipo_bebida+
                "\nSabor: "+this.sabor_bebida+
                "\n";
    }
}
