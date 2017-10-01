/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busca;

/**
 *
 * @author mário
 */
public class PontoProximo {
    ponto p;
    int indice;

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public ponto getP() {
        return p;
    }

    public void setP(ponto p) {
        this.p = p;
    }

    
    
    public PontoProximo(ponto p, int indice) {
        this.p = p;
        this.indice = indice;
    }
    
    
}
