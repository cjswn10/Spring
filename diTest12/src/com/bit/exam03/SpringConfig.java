package com.bit.exam03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public SmsSender sender() {
		SmsSender sd = new SmsSender();
		sd.setFrom("ø¨µ‡");
		sd.setTo("º∫¿Œ");
		return sd;
	}
	
	@Bean
	public SystemMonitor sm() {
		SystemMonitor sm = new SystemMonitor();
		sm.setPeriodTime(3);
		sm.setSender(sender());

		return sm;
	}

}
