package org.zstack.monitor.cmd;

import java.util.List;
import java.util.Map;

import org.zstack.monitor.params.CreateHostMonitorParams;

public  class MonitorHostCmd  {
	 
	
	public static class AddMonitorHostCmd {
			String jsonrpc="2.0";
			String method;
			String auth;
			int id;
			CreateHostMonitorParams params;
			public String getJsonrpc() {
				return jsonrpc;
			}
			 
			public String getMethod() {
				return method;
			}
			public void setMethod(String method) {
				this.method = method;
			}
			public String getAuth() {
				return auth;
			}
			public void setAuth(String auth) {
				this.auth = auth;
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public CreateHostMonitorParams getParams() {
				return params;
			}
			public void setParams(CreateHostMonitorParams params) {
				this.params = params;
			}
		     
		 
    }
	 public static class AddMonitorHostResoponse {
	    }
}