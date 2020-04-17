package com.restconsuming.model;

public class Response {

	private String status;

	public Response() {
	}

	public Response(String status) {
		super();
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Response [status=" + status + "]";
	}

}
