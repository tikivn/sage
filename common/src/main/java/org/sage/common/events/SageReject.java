package org.sage.common.events;

import java.io.Serializable;

public interface SageReject<K extends Serializable, C extends Serializable> extends SageCompleteEvent<K> {
    
    public default boolean isSuccessful() {
        return false;
    }
    
    public String getFailureSource();

    public C getCause();
}
