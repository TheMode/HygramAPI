package fr.hygram.listener;

import fr.hygram.screen.ClientDevice;
import fr.hygram.user.Client;

public interface ClientDeviceChangeListener extends Listener {

    void deviceChange(Client client, ClientDevice newDevice);

}
