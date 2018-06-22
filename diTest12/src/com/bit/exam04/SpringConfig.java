package com.bit.exam04;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean()
	public SmsSender sender() {
		SmsSender sd = new SmsSender();
		sd.setFrom("¿¬µà");
		sd.setTo("°Ç¿ì");
		return sd;
	}
	
	@Bean(autowire=Autowire.BY_NAME)
	public SystemMonitor sm() {
		SystemMonitor sm = new SystemMonitor();
		sm.setPeriodTime(7);

		return sm;
	}

}
