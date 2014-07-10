/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.nicomaia.loltournamentcode;

/**
 *
 * @author jonimane
 */
public enum TipoEscolha {
    BLIND_PICK(1),
    DRAFT_MODE(2),
    ALL_RANDOM(4),
    TOURNAMENT_DRAFT(6);
    
    private final int value;

    private TipoEscolha( int v ) {
	value = v;
    }
    
    @Override
    public String toString() {
	switch( this ) {
	    case BLIND_PICK:
		return "Modo Escolha Livre";
		
	    case DRAFT_MODE:
		return "Modo Competitivo";
		
	    case ALL_RANDOM:
		return "Modo Tudo Aleatório";
		
	    case TOURNAMENT_DRAFT:
		return "Modo Torneio Competitivo";
		
	    default:
		return "Desconhecido";
	}
    }
    
    public int getValue() {
	return value;
    }
}
