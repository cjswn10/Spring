package com.bit.exam02;

public class MemberService {
	private UpdateInfo info;

/*
  	public MemberService(UpdateInfo info) {
		super();
		this.info = info;
	}
*/
	public void setInfo(UpdateInfo info) {
		this.info = info;
	}

	public void service() {
		System.out.println("MemberService�� service�Դϴ�.");
		info.update();
	}
}
