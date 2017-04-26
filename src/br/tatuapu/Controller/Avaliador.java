/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tatuapu.Controller;

import br.tatuapu.Model.AcertoCandidato;
import br.tatuapu.Model.Desafio;
import br.tatuapu.Model.RespostaSubmetida;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tatuapu
 */
public class Avaliador {
    private List<Desafio> desafios;
    private List<RespostaSubmetida> respostas;
    
    public Avaliador(List d, List r){
        this.desafios = (List <Desafio>) d;
        this.respostas = (List <RespostaSubmetida>) r;
    }
    
    public AcertoCandidato avalia(){
        for(RespostaSubmetida rs: respostas){
            if (checaSeExisteRespostaNosDesafios(rs))
                return new AcertoCandidato(0, rs.getIdDesafio(), rs);
        }
        return null;
    }
    
    private boolean checaSeExisteRespostaNosDesafios(RespostaSubmetida r){
        for(Desafio ds: desafios){
            if(ds.getRespDesafio().equalsIgnoreCase(r.getRespostaSubmetida()))
                return true;
        }
        return false;
    }
    
}
