package org.dummy.insecure.framework;

import java.io.Serializable;
import java.time.LocalDateTime;

public class VulnerableTaskHolder implements Serializable {
    private static final long serialVersionUID = 2;
    private String taskName;
    private String taskAction;
    private LocalDateTime requestedExecutionTime;

    public VulnerableTaskHolder(String taskName, String taskAction) {
        this.taskName = taskName;
        this.taskAction = taskAction;
        requestedExecutionTime = LocalDateTime.now().minusHours(8);
    }
}

