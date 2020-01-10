package org.apache.log4j.spi;

import org.apache.log4j.p001or.ObjectRenderer;
import org.apache.log4j.p001or.RendererMap;

public interface RendererSupport {
    RendererMap getRendererMap();

    void setRenderer(Class cls, ObjectRenderer objectRenderer);
}
