package com.hipstertech.service.entities;

import java.io.Serializable;

public class ResponseLoginSAP implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String SessionId;
	private String Version;
	
	
	public String getSessionId() {
		return SessionId;
	}
	public void setSessionId(String sessionId) {
		SessionId = sessionId;
	}
	public String getVersion() {
		return Version;
	}
	public void setVersion(String version) {
		Version = version;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((SessionId == null) ? 0 : SessionId.hashCode());
		result = prime * result + ((Version == null) ? 0 : Version.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponseLoginSAP other = (ResponseLoginSAP) obj;
		if (SessionId == null) {
			if (other.SessionId != null)
				return false;
		} else if (!SessionId.equals(other.SessionId))
			return false;
		if (Version == null) {
			if (other.Version != null)
				return false;
		} else if (!Version.equals(other.Version))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "ResponseLoginSAP [SessionId=" + SessionId + ", Version=" + Version + "]";
	}
	
	

}
