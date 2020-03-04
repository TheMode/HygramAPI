package fr.hygram.listener;

import fr.hygram.application.HygramWindowApplication;
import fr.hygram.user.Client;

public interface GuestJoinListener extends Listener {

    void guestJoin(Client guest, HygramWindowApplication windowApplication, String code);

}
