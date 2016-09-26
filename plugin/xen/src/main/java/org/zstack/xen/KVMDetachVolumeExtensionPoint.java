package org.zstack.xen;

import org.zstack.header.errorcode.ErrorCode;
import org.zstack.header.vm.VmInstanceInventory;
import org.zstack.header.volume.VolumeInventory;
import org.zstack.xen.KVMAgentCommands.AttachDataVolumeCmd;
import org.zstack.xen.KVMAgentCommands.DetachDataVolumeCmd;

/**
 * Created by frank on 4/24/2015.
 */
public interface KVMDetachVolumeExtensionPoint {
    void beforeDetachVolume(KVMHostInventory host, VmInstanceInventory vm, VolumeInventory volume, DetachDataVolumeCmd cmd);

    void afterDetachVolume(KVMHostInventory host, VmInstanceInventory vm, VolumeInventory volume, DetachDataVolumeCmd cmd);

    void detachVolumeFailed(KVMHostInventory host, VmInstanceInventory vm, VolumeInventory volume, DetachDataVolumeCmd cmd, ErrorCode err);
}
