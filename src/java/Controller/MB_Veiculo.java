/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.B_Veiculo;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author jean.leal
 */
@ManagedBean (name = "mbVeic")
@SessionScoped
public class MB_Veiculo {

    private B_Veiculo veic;
    private ArrayList<B_Veiculo> veics;
    
    public MB_Veiculo() {
        veic = new B_Veiculo();
        veics = new ArrayList<B_Veiculo>();
    }
    
    public void cadastraVeiculo(){
        veics.add(this.veic);
    }

    public B_Veiculo getVeic() {
        return veic;
    }

    public void setVeic(B_Veiculo veic) {
        this.veic = veic;
    }

    public ArrayList<B_Veiculo> getVeics() {
        return veics;
    }

    public void setVeics(ArrayList<B_Veiculo> veics) {
        this.veics = veics;
    }

}
