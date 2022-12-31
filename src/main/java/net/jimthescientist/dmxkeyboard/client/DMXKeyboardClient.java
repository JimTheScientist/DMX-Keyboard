package net.jimthescientist.dmxkeyboard.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
        // TODO create DMX stack loop
        // TODO create keyboard listener loop
    }
}
