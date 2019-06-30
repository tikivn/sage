package org.sage.common.events;

import java.io.Serializable;

public interface SageResponse<K extends Serializable, P extends Serializable> extends SageEvent<K> {

    public P getPayload();
    
    public boolean isSuccessful();

    public String getSource();
}
