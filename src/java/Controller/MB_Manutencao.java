/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.B_Manutencao;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author jean.leal
 */
@ManagedBean (name = "mbMan")
@SessionScoped
public class MB_Manutencao {

    private B_Manutencao man;
    private ArrayList<B_Manutencao> mans;
    public MB_Manutencao() {
        man = new B_Manutencao();
        mans = new ArrayList<B_Manutencao>();
    }
    
    public void cadastraManutencao(){
        B_Manutencao m = new B_Manutencao(man);
        mans.add(m);
        this.limpaCampos();
    }
    
    public void limpaCampos(){
        this.man.setDataDaManutencao(null);
        this.man.setDataDaProximaManutencao(null);
        this.man.setDescricao(null);
        this.man.setNome(null);
        this.man.setQuilometragemDaManutencao(null);
        this.man.setQuilometragemDaProximaManutencao(null);
        this.man.setTipo(null);
        this.man.setValorMaoDeObra(null);
        this.man.setValorPeca(null);
        this.man.setValorTotal(null);
    }

    public ArrayList<B_Manutencao> getMans() {
        return mans;
    }

    public void setMans(ArrayList<B_Manutencao> mans) {
        this.mans = mans;
    }

    public B_Manutencao getMan() {
        return man;
    }

    public void setMan(B_Manutencao man) {
        this.man = man;
    }
}
