package com.mycompany.interfacetb;

public class lanches {
    private String nome_lanche, tipo_queijo, tipo_carne, tipo_pao, molho;

    public String getNome_lanche() {
        return nome_lanche;
    }

    public void setNome_lanche(String nome_lanche) {
        this.nome_lanche = nome_lanche;
    }

    public String getTipo_queijo() {
        return tipo_queijo;
    }

    public void setTipo_queijo(String tipo_queijo) {
        this.tipo_queijo = tipo_queijo;
    }

    public String getTipo_carne() {
        return tipo_carne;
    }

    public void setTipo_carne(String tipo_carne) {
        this.tipo_carne = tipo_carne;
    }

    public String getTipo_pao() {
        return tipo_pao;
    }

    public void setTipo_pao(String tipo_pao) {
        this.tipo_pao = tipo_pao;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }
    
    public String status_lanche(){
        return"-----Novo Lanche-----"+
                "\nNome do Lanche: "+ this.nome_lanche+
                "\nTipo do queijo: "+ this.tipo_queijo+
                "\nTipo da carne: "+ this.tipo_carne+
                "\nTipo do pão: "+ this.tipo_pao+
                "\nMolho: "+this.molho+
                "\n";
    }
}
