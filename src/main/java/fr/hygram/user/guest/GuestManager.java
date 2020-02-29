package fr.hygram.user.guest;

import fr.hygram.application.HygramWindowApplication;

import java.util.Set;

public interface GuestManager {

    Set<Guest> getGuests();

    void createJoinCode(HygramWindowApplication windowApplication, String code);

    void createUniqueJoinCode(HygramWindowApplication windowApplication, String uniqueCode);

    void revokeJoinCode(HygramWindowApplication windowApplication, String code);

}
