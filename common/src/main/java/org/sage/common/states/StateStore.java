package org.sage.common.states;

import java.io.Serializable;

import org.joo.promise4j.Promise;
import org.sage.common.events.SageAck;

public interface StateStore<K extends Serializable, S extends Serializable> {

    public Promise<SageAck<K>, Throwable> storeState(K key, S state);

    public Promise<S, Throwable> loadState(K key);
}
