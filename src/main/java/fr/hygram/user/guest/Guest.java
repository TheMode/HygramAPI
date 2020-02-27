package fr.hygram.user.guest;

import fr.hygram.user.User;

public interface Guest extends User {

    default boolean isLocal() {
        return false;
    }

}
