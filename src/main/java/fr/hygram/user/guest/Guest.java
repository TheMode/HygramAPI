package fr.hygram.user.guest;

import fr.hygram.user.Client;

public interface Guest extends Client {

    default boolean isLocal() {
        return false;
    }

}
