package org.sage.common.events;

import java.io.Serializable;

public interface SageCompleteEvent<K extends Serializable> extends SageEvent<K> {
    
    public boolean isSuccessful();
}
