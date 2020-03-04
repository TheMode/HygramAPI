package fr.hygram.frame;

import fr.hygram.user.Client;
import fr.hygram.user.RenderingClient;

public interface RenderingManager {

    FrameContainer createFrameDataContainer();

    RenderingClient toRenderingClient(Client client);

}
