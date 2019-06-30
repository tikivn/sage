package org.sage.orchestrator.support.transport;

import java.io.Serializable;

import org.joo.promise4j.Promise;
import org.sage.common.events.SageAck;
import org.sage.common.events.SageCompleteEvent;

public interface SageCompleteEventSender<K extends Serializable> {

    public Promise<SageAck<K>, Throwable> send(SageCompleteEvent<K> request);
}
