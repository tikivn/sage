package org.sage.orchestrator.support;

import java.io.Serializable;

import org.sage.common.events.SageResponse;

public interface SageResponseHandler<K extends Serializable, P extends Serializable> {

    public void onEvent(SageResponse<K, P> response);
}
