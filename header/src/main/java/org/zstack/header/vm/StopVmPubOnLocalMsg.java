package org.zstack.header.vm;

import org.zstack.header.host.HostMessage;
import org.zstack.header.message.NeedReplyMessage;

public class StopVmPubOnLocalMsg extends NeedReplyMessage implements HostMessage {
    private VmInstanceInventory vmInventory;
    private String type;
    private String vMUuid;

    public String getvMUuid() {
		return vMUuid;
	}

	public void setvMUuid(String vMUuid) {
		this.vMUuid = vMUuid;
	}

	public VmInstanceInventory getVmInventory() {
        return vmInventory;
    }

    public void setVmInventory(VmInstanceInventory vmInventory) {
        this.vmInventory = vmInventory;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }
    @Override
    public String getHostUuid() {
        return vmInventory.getHostUuid();
    }
}
