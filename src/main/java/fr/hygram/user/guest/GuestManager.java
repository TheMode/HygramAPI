package fr.hygram.user.guest;

import fr.hygram.application.HygramWindowApplication;
import fr.hygram.user.RenderingClient;

import java.util.Set;

public interface GuestManager {

    Set<RenderingClient> getGuests(HygramWindowApplication windowApplication);

    void createJoinCode(HygramWindowApplication windowApplication, String code);

    void createUniqueJoinCode(HygramWindowApplication windowApplication, String uniqueCode);

    void revokeJoinCode(HygramWindowApplication windowApplication, String code);

}
