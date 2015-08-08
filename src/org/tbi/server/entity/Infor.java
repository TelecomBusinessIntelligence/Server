package org.tbi.server.entity;

public class Infor {
	 private String errorInfo;
	 private Integer statusCode = ErrorCode.NONE;

	  Infor() {
	    
	  }

	  public String getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	Infor (final String errorInfo, final Integer statusCode) {
	      this.errorInfo = errorInfo;
	      this.statusCode = statusCode;
	  }

}
