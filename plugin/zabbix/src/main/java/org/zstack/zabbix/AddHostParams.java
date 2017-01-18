package org.zstack.zabbix;

import java.util.List;
import java.util.Map;

public class AddHostParams {

	String host;
	List<HostInterface> interfaces;
	List<HostGroup> groups;
	List<HostTemplate> templates;
	Map<String, String> inventory;
	String inventory_mode;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public List<HostInterface> getInterfaces() {
		return interfaces;
	}

	public void setInterfaces(List<HostInterface> interfaces) {
		this.interfaces = interfaces;
	}

	public List<HostGroup> getGroups() {
		return groups;
	}

	public void setGroups(List<HostGroup> groups) {
		this.groups = groups;
	}

	public List<HostTemplate> getTemplates() {
		return templates;
	}

	public void setTemplates(List<HostTemplate> templates) {
		this.templates = templates;
	}

	public Map<String, String> getInventory() {
		return inventory;
	}

	public void setInventory(Map<String, String> inventory) {
		this.inventory = inventory;
	}

	public String getInventory_mode() {
		return inventory_mode;
	}

	public void setInventory_mode(String inventory_mode) {
		this.inventory_mode = inventory_mode;
	}

}
