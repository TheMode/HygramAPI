package fr.hygram.listener;

import fr.hygram.user.guest.Guest;

public interface GuestJoinListener extends Listener {

    void guestJoin(Guest guest, String code);

}
