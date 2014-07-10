/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.nicomaia.loltournamentcode;

import org.json.simple.JSONObject;

/**
 * @author jonimane
 */
public class GameConfig {
    private int vagas;
    private Mapa mapa;
    private TipoEscolha escolha;
    private TipoEspectador espectador;
    private JSONObject opcoes;

    {
	opcoes = new JSONObject();
	opcoes.put("extra", new JSONObject());
    }
    
    public int getVagas() {
	return vagas;
    }

    public void setVagas(int vagas) {
	this.vagas = vagas;
    }

    public Mapa getMapa() {
	return mapa;
    }

    public void setMapa(Mapa mapa) {
	this.mapa = mapa;
    }

    public TipoEscolha getEscolha() {
	return escolha;
    }

    public void setEscolha(TipoEscolha escolha) {
	this.escolha = escolha;
    }

    public TipoEspectador getEspectador() {
	return espectador;
    }

    public void setEspectador(TipoEspectador espectador) {
	this.espectador = espectador;
    }

    public JSONObject getOpcoes() {
	return opcoes;
    }

    public void setOpcoes(JSONObject opcoes) {
	this.opcoes = opcoes;
    }
    
    public String getNome() {
	return (String) opcoes.get("name");
    }
    
    public void setNome( String nome ) throws Exception {
	if( nome.length() > 30 ) {
	    throw new Exception("Nome não deve ser maior que 30 carecteres!");
	}
	
	opcoes.put("name", nome);
    }
    
    public String getSenha() {
	return (String) opcoes.get("password");
    }
    
    public void setSenha( String senha ) {
	opcoes.put("password", senha);
    }
    
    public String getURL() {
	return (String) opcoes.get("report");
    }
    
    public void setURL( String url ) {
	opcoes.put("report", url);
    }
    
    public JSONObject getExtra() {
	return (JSONObject) opcoes.get("extra");
    }
    
    public void setExtra( JSONObject json ) {
	opcoes.put("extra", json);
    }
    
    public String getExtraGame() {
	return (String) getExtra().get("game");
    }
    
    public void setExtraGame( String v ) {
	getExtra().put("game", v);
    }
}
