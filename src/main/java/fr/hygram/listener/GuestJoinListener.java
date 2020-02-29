package fr.hygram.listener;

import fr.hygram.application.HygramWindowApplication;
import fr.hygram.user.guest.Guest;

public interface GuestJoinListener extends Listener {

    void guestJoin(Guest guest, HygramWindowApplication windowApplication, String code);

}
