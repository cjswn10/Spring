package com.bit.exam02;


import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(UpdateConfig.class)
public class MemberConfig {

	//initMethod�� �س����� �⺻���� �����
	@Bean(autowire=Autowire.BY_TYPE, initMethod="service")
	public MemberService member() {
		return new MemberService();
	}
	
}
