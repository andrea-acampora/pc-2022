package light_sensor_thing.consumer;

import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

/**
 * Light Sensor Thing API 
 *   
 * @author aricci
 *
 */
public interface LightSensorThingAPI {
	
	Future<JsonObject> getTD();
	
	/* properties */

	Future<Double> getLightLevel();
	
	/**
	 * Subscribe to events generated by the light device
	 * 
	 * @param handler
	 * @return
	 */
	Future<Void> subscribe(Handler<JsonObject> handler);
}
