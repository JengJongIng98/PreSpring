package com.itwillbs.spring;

public class MsgBeanKr implements MsgBeanI {

	@Override
	public void sayHello(String name) {
		System.out.println("MsgBeanKr_sayHello() 실행");
		
		System.out.println(name+" 안녕하세요! ");
	}
	
}
