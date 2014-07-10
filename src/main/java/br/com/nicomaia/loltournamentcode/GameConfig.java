/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.nicomaia.loltournamentcode;

import org.json.simple.JSONObject;

/**
 * Opções do Extra:
 * "game": myowngameid
 * "vendor_id": "27852187"
 * "vendor_scope": "esl_match"
 * "identifier": "esl_match:29383350:3"
 * "region": "na"
 *
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
    
    public void setNome( String nome ) {
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
    
    public String getExtraVendorId() {
	return (String) getExtra().get("vendor_id");
    }
    
    public void setExtraVendorId( String v ) {
	getExtra().put("vendor_id", v);
    }
    
    public String getExtraVendorScope() {
	return (String) getExtra().get("vendor_scope");
    }
    
    public void setExtraVendorScope( String v ) {
	getExtra().put("vendor_scope", v);
    }
    
    public String getExtraIdentifier() {
	return (String) getExtra().get("identifier");
    }
    
    public void setExtraIdentifier( String v ) {
	getExtra().put("identifier", v);
    }
    
    public String getExtraRegion() {
	return (String) getExtra().get("region");
    }
    
    public void setExtraRegion( String v ) {
	getExtra().put("region", v);
    }
}
