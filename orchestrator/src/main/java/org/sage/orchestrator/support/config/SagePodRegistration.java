package org.sage.orchestrator.support.config;

import java.io.Serializable;

import org.sage.orchestrator.support.transport.SageRequestSender;

public interface SagePodRegistration<K extends Serializable, P extends Serializable> {

    public String getId();
    
    public SageRequestSender<K, P> getSender();
}
