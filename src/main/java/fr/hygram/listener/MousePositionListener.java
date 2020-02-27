package fr.hygram.listener;

import fr.hygram.user.User;

public interface MousePositionListener extends Listener {

    void mouseMove(User user, int newX, int newY);

}
