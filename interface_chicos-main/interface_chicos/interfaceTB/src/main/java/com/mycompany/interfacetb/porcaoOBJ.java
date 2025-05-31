package com.mycompany.interfacetb;

public class porcaoOBJ {
    private String nome_porcao, tempero, base, tipo;

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
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String status_porcao(){
        return"-----Nova Porção-----"+
                "\nNome: "+this.nome_porcao+
                "\nTempero: "+this.tempero+
                "\nBase: "+this.base+
                "\nTipo: "+this.tipo;
    }
    
}
