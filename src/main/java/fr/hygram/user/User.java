package fr.hygram.user;

public interface User extends Client {

    default boolean isLocal() {
        return true;
    }

}
