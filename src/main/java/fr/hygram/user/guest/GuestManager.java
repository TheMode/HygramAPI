package fr.hygram.user.guest;

import java.util.Set;

public interface GuestManager {

    Set<Guest> getGuests();

    void createJoinCode(String code);

    void createUniqueJoinCode(String uniqueCode);

    void revokeJoinCode(String code);

}
