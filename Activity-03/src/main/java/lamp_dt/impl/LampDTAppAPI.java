package lamp_dt.impl;

import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

/**
 * Toy Lamp Digital Twin Java API for the Application Layer
 *   
 * @author aricci
 *
 */
public interface LampDTAppAPI {
	
	
	/**
	 * 
	 * Get the current state of the Lamp
	 * 
	 */
	Future<JsonObject> getState();

	/**
	 * 
	 * Get the event history
	 * 
	 */
	Future<JsonArray> getHistory();
	

	/**
	 * Subscribe to events generated by the lamp digital twin
	 * 
	 * @param handler
	 * @return
	 */
	Future<Void> subscribe(Handler<JsonObject> handler);
}
