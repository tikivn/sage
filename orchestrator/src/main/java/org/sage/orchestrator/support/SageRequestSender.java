package org.sage.orchestrator.support;

import java.io.Serializable;

import org.joo.promise4j.Promise;
import org.sage.common.events.SageRequest;
import org.sage.common.events.SageAck;

public interface SageRequestSender<K extends Serializable, P extends Serializable> {

    public Promise<SageAck<K>, Throwable> send(SageRequest<K, P> request);
}
