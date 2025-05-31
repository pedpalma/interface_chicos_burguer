package com.mycompany.interfacetb;

public class funcionariosOBJ {
    private String nome_func, sexo_func, cpf, cargo, uniforme, vt;

    public String getNome_func() {
        return nome_func;
    }

    public void setNome_func(String nome_func) {
        this.nome_func = nome_func;
    }

    public String getSexo_func() {
        return sexo_func;
    }

    public void setSexo_func(String sexo_func) {
        this.sexo_func = sexo_func;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUniforme() {
        return uniforme;
    }

    public void setUniforme(String uniforme) {
        this.uniforme = uniforme;
    }

    public String getVt() {
        return vt;
    }

    public void setVt(String vt) {
        this.vt = vt;
    }
    
    public String status_func(){
        return"-----Novo Funcionário!-----"+
                "\nNome: "+this.nome_func+
                "\nSexo: "+this.sexo_func+
                "\nCPF: "+this.cpf+
                "\nCargo: "+this.cargo+
                "\nDeseja receber o Uniforme? "+this.uniforme+
                "\nDeseja receber o Vale Transporte? "+this.vt+
                "\n";
    }
}
