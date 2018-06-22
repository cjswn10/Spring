package com.bit.exam07;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/com/bit/exam07/beans07.xml")
public class SpringConfig {
	@Bean(autowire=Autowire.BY_TYPE)
	public SystemMonitor sm() {
		SystemMonitor s = new SystemMonitor();
		s.setPeriodTime(5);
		return s;
	}
}
