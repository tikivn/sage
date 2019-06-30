package org.sage.orchestrator.config;

import java.io.Serializable;

import org.sage.orchestrator.support.SageRequestSender;

public interface SagePodRegistration<K extends Serializable, P extends Serializable> {

    public String getId();
    
    public SageRequestSender<K, P> getSender();
}
