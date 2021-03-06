/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tatuapu.Model;

/**
 *
 * @author tatuapu
 */
public class AcertoCandidato {
    private final int idAcertos;
    private final int idDesafio;
    private final RespostaSubmetida respostaSubmetida;
    public AcertoCandidato(int idA, int idD, RespostaSubmetida rS){
        idAcertos = idA;
        idDesafio = idD;
        respostaSubmetida = rS;
    }

    /**
     * @return the idAcertos
     */
    public int getIdAcertos() {
        return idAcertos;
    }

    /**
     * @return the idDesafio
     */
    public int getIdDesafio() {
        return idDesafio;
    }

    /**
     * @return the idRespostaSubmetida
     */
    public RespostaSubmetida getRespostaSubmetida() {
        return this.respostaSubmetida;
    }
}
