package org.zstack.ecs;

import org.zstack.header.core.Completion;

/**
 * Created by xing5 on 2016/8/6.
 */
public interface KVMPingAgentExtensionPoint {
    void kvmPingAgent(KVMHostInventory host, Completion completion);
}