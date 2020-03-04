package fr.hygram.user;

import fr.hygram.frame.FrameContainer;

public interface RenderingClient extends Client {

    FrameContainer getAttachedFrameDataContainer();

    void attachFrameDataContainer(FrameContainer frameContainer);

}
