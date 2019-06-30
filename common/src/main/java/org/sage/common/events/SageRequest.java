package org.sage.common.events;

import java.io.Serializable;

public interface SageRequest<K extends Serializable, P extends Serializable> extends SageEvent<K> {

    public P getPayload();

    public String getTarget();
}
