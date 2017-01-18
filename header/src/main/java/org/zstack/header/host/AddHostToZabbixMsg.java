package org.zstack.header.host;

import org.zstack.header.message.NeedReplyMessage;

public class AddHostToZabbixMsg extends NeedReplyMessage   {
	HostVO host;

	public HostVO getHost() {
		return host;
	}

	public void setHost(HostVO host) {
		this.host = host;
	}
	 
}
