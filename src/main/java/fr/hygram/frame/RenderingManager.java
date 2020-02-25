package fr.hygram.frame;

public interface RenderingManager {

    FrameBuffer createFrameBuffer(FrameDataContainer frameDataContainer);

    FrameDataContainer createFrameDataContainer();

}
