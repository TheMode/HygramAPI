package fr.hygram.listener;

import fr.hygram.user.Client;

public interface MouseClickListener extends Listener {

    void mouseClick(Client client, int button, int action);

}
