package fr.hygram.listener;

import fr.hygram.user.User;

public interface MouseClickListener extends Listener {

    void mouseClick(User user, int button, int action);

}
