package net.jimthescientist.dmxkeyboard.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class DMXKeyboardClient {

    public static final Logger LOGGER = LogManager.getLogger(DMXKeyboardClient.class);
    /**
     * DMXKeyboardClient entry by main()
     * Required Arguments:
     * <ul>
     *     <li>artnet=
     *          <p>
     *              - true requires ip= <br>
     *              - false won't work yet.
     *          </p>
     *     </li>
     *     <li>ip=
     *      <p>
     *          - the ip address
     *      </p>
     * </li>
     * </ul>
     **/
    public static void main(String[] args) {
        LOGGER.info("Starting the DMX Keyboard Client");
        // Load Args
        LOGGER.info("Loading program arguments...");
        Map<String, String> loadedArgs = loadArgs(args);

        if (loadedArgs.containsKey("artnet") && loadedArgs.get("artnet").equals("true")) {
            LOGGER.info("Initializing Artnet on IP " + loadedArgs.get("ip"));

        }


        // TODO create DMX stack loop
        // TODO create keyboard listener loop
    }

    private static Map<String, String> loadArgs(String[] args) {
        Map<String, String> argumentMap = new HashMap<>();
        for (String arg: args) {
            argumentMap.put(arg.split("=")[0], arg.split("=")[1]);
        }
        return argumentMap;
    }
}
