package org.zstack.compute.vm;
import java.util.List;

public class PubCloud{
	
	private String name;
	private List <InstanceMode> instanceMD;
	private List <String> accountInfo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<InstanceMode> getInstanceMD() {
		return instanceMD;
	}
	public void setInstanceMD(List<InstanceMode> instanceMD) {
		this.instanceMD = instanceMD;
	}
	public List<String> getAccountInfo() {
		return accountInfo;
	}
	public void setAccountInfo(List<String> accountInfo) {
		this.accountInfo = accountInfo;
	}
	
	  
}