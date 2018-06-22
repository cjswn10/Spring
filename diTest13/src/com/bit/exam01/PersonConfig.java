package com.bit.exam01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({BoardConfig.class, MemberConfig.class})
public class PersonConfig {

	@Bean
	public Person p() {
		Person p = new Person("юс©╛аж", 26);
		return p;
	}
}
