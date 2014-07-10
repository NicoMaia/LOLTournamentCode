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
public enum Mapa {
    SUMMONERS_RIFT(1),
    CRYSTAL_SCAR(8),
    TWISTED_TREELINE(10),
    HOWLING_ABYSS(12);
    
    private final int value;

    private Mapa( int v ) {
	value = v;
    }

    @Override
    public String toString() {
	switch( this ) {
	    case SUMMONERS_RIFT:
		return "Summoners Rift";
	
	    case CRYSTAL_SCAR:
		return "Crystal Scar";
	
	    case TWISTED_TREELINE:
		return "Twisted Treeline";
	
	    case HOWLING_ABYSS:
		return "Howling Abyss";
	
	    default:
		return "Desconhecido";
	}
    }
    
    public int getValue() {
	return value;
    }
}
