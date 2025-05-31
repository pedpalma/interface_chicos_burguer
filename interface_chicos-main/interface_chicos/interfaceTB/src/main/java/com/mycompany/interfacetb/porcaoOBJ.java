package com.mycompany.interfacetb;

public class porcaoOBJ {
    private String nome_porcao, tempero, base_porcao, tipo_porcao;

    public String getNome_porcao() {
        return nome_porcao;
    }

    public void setNome_porcao(String nome_porcao) {
        this.nome_porcao = nome_porcao;
    }

    public String getTempero() {
        return tempero;
    }

    public void setTempero(String tempero) {
        this.tempero = tempero;
    }

    public String getBase() {
        return base_porcao;
    }

    public void setBase(String base) {
        this.base_porcao = base;
    }

    public String getTipo() {
        return tipo_porcao;
    }

    public void setTipo(String tipo) {
        this.tipo_porcao = tipo;
    }
    
    public String status_porcao(){
        return"-----Nova Porção-----"+
                "\nNome: "+this.nome_porcao+
                "\nTempero: "+this.tempero+
                "\nBase: "+this.base_porcao+
                "\nTipo: "+this.tipo_porcao;
    }
    
}
