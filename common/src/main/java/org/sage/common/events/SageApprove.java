package org.sage.common.events;

import java.io.Serializable;

public interface SageApprove<K extends Serializable> extends SageCompleteEvent<K> {

    public default boolean isSuccessful() {
        return true;
    }
}
