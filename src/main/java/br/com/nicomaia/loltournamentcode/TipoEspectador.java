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
public enum TipoEspectador {
    NONE("NONE"),
    ALL("ALL"),
    LOBBYONLY("LOBBYONLY"),
    FRIENDS("DROPINONLY");

    private final String value;
    
    private TipoEspectador( String value ) {
	this.value = value;
    }

    @Override
    public String toString() {
	switch( this )
	{
	    case NONE:
		return "Desabilitado";
		
	    case ALL:
		return "Todos";
		
	    case LOBBYONLY:
		return "Lobby";
		
	    case FRIENDS:
		return "Amigos";
		
	    default:
		return "Desconhecido";
	}
    }
    
    public String getValue() {
	return value;
    }
}
