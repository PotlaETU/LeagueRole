package com.potla.firstapp.leagueroleavis;

public class Role {
    private String code;

    private String nom_role;

    public Role(String code, String nom_role){
        this.code=code;
        this.nom_role=nom_role;
    }

    public String getCode() {
        return code;
    }

    public String getNom_role() {
        return nom_role;
    }

    public void setNom_role(String nom_role) {
        this.nom_role = nom_role;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return nom_role;
    }
}
