package org.zstack.monitor.cmd;

import java.util.List;
import java.util.Map;

import org.zstack.header.agent.AgentResponse;
import org.zstack.monitor.params.CreateHostMonitorParams;

public  class UserCmd  {
	 
	
	public static class UserLogintMonitorCmd {
			String jsonrpc="2.0";
			String method="user.login";
			int id;
			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			Map<String,String> params;
			public String getJsonrpc() {
				return jsonrpc;
			}
			 
			public String getMethod() {
				return method;
			}
			 
		 
			 
			public Map<String, String> getParams() {
				return params;
			}

			public void setParams(Map<String, String> params) {
				this.params = params;
			}
			 
		     
		 
    }
	 public static class UserLoginZabbixResoponse extends AgentResponse{
		 String result;
		 String jsonrpc;
		 String id;
		public String getResult() {
			return result;
		}
		public void setResult(String result) {
			this.result = result;
		}
		public String getJsonrpc() {
			return jsonrpc;
		}
		public void setJsonrpc(String jsonrpc) {
			this.jsonrpc = jsonrpc;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
	    }
}