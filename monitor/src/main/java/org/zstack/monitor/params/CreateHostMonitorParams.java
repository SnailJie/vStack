package org.zstack.monitor.params;

import java.util.List;
import java.util.Map;

public class CreateHostMonitorParams{
		String host;
		List<Map<String,String>> interfaces;   //required
		List<Map<String,String>> groups;   //required
		List<Map<String,String>> templates;    
		int inventory_mode;
		Map<String,String> inventory;
		
		public String getHost() {
			return host;
		}
		public void setHost(String host) {
			this.host = host;
		}
		 
		public List<Map<String, String>> getInterfaces() {
			return interfaces;
		}
		public void setInterfaces(List<Map<String, String>> interfaces) {
			this.interfaces = interfaces;
		}
		public List<Map<String, String>> getGroups() {
			return groups;
		}
		public void setGroups(List<Map<String, String>> groups) {
			this.groups = groups;
		}
		public List<Map<String, String>> getTemplates() {
			return templates;
		}
		public void setTemplates(List<Map<String, String>> templates) {
			this.templates = templates;
		}
		public int getInventory_mode() {
			return inventory_mode;
		}
		public void setInventory_mode(int inventory_mode) {
			this.inventory_mode = inventory_mode;
		}
		public Map<String, String> getInventory() {
			return inventory;
		}
		public void setInventory(Map<String, String> inventory) {
			this.inventory = inventory;
		}
		
	       
	}