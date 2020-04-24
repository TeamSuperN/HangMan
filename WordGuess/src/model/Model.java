package model;

/* Holds model information for testing purposes. Temporary class until model
 * is implemented in server app and GUI can communicate with server app.
 */
public class Model {
	
	public Game game;
	
	public Model(String userName) {
		game = new Game();
		game.pList.add(new Player(userName));
	}
	
}
