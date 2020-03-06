package fr.hygram.listener;

import fr.hygram.user.Client;

public interface MousePositionListener extends Listener {

    void mouseMove(Client client, float newX, float newY);

}
