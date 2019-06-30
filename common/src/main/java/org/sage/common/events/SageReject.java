package org.sage.common.events;

import java.io.Serializable;

public interface SageReject<K extends Serializable, C extends Serializable> extends SageEvent<K> {

    public C getCause();
}
