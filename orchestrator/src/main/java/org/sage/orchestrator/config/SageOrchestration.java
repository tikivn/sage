package org.sage.orchestrator.config;

import java.io.Serializable;

import org.sage.orchestrator.support.SageCompleteEventSender;
import org.sage.orchestrator.support.SageResponseHandler;

public interface SageOrchestration<K extends Serializable, P extends Serializable> {

    public String getName();

    public SagePodRegistration<K, P> getPodRegistration();

    public SageResponseHandler<K, P> getResponseHandler();

    public SageCompleteEventSender<K> getAckSender();
}
