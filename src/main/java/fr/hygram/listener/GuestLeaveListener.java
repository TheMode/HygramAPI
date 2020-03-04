package fr.hygram.listener;

import fr.hygram.application.HygramWindowApplication;
import fr.hygram.user.Client;

public interface GuestLeaveListener extends Listener {

    void guestLeave(Client guest, HygramWindowApplication windowApplication);

}
