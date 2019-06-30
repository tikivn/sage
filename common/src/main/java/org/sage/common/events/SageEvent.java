package org.sage.common.events;

import java.io.Serializable;

public interface SageEvent<K extends Serializable> extends Serializable {
    
    public String getName();

    public K getKey();
}
