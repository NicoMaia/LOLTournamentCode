/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.nicomaia.loltournamentcode;

import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author jonimane
 */
public class LOLTournamentCode {
    private GameConfig gameConfig;
    
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
	GameConfig gc = new GameConfig();
	
	gc.setEscolha(TipoEscolha.TOURNAMENT_DRAFT);
	gc.setEspectador(TipoEspectador.FRIENDS);
	gc.setMapa(Mapa.SUMMONERS_RIFT);
	gc.setNome("Game4Glory #123");
	gc.setVagas(5);
	gc.setSenha("123");
	
	LOLTournamentCode ltc = new LOLTournamentCode(gc);
	System.out.println( ltc.generate() );
    }

    public LOLTournamentCode(GameConfig gameConfig) {
	this.gameConfig = gameConfig;
    }

    public GameConfig getGameConfig() {
	return gameConfig;
    }

    public void setGameConfig(GameConfig gameConfig) {
	this.gameConfig = gameConfig;
    }
    
    public String generate() {
	String res = "pvpnet://lol/customgame/joinorcreate/map%d/pick%d/team%d/spec%s/%s";
	
	int map = gameConfig.getMapa().getValue();
	int pick = gameConfig.getEscolha().getValue();
	int team = gameConfig.getVagas();
	String spec = gameConfig.getEspectador().getValue();
	String config = gameConfig.getOpcoes().toJSONString();
	
	byte[] encoded = Base64.encodeBase64( config.getBytes() );
	
	return String.format(res, map, pick, team, spec, new String(encoded));
    }
}
