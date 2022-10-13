package org.digit.health.sync.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DeliverySyncStep implements SyncStep {
    private final ApplicationContext applicationContext;

    @Autowired
    public DeliverySyncStep(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void nextSyncStep(SyncContext syncContext) {
        // TODO: Implementation
    }

    @Override
    public void handle(Object payload) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}