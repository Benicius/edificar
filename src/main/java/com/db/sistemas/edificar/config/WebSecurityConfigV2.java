package com.db.sistemas.edificar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class WebSecurityConfigV2 {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		 return http
						.authorizeHttpRequests((authz) -> authz
										/*.requestMatchers(HttpMethod.GET, "/api/v1/collaborators").permitAll()
										.requestMatchers(HttpMethod.POST, "/api/v1/collaborators").hasAnyRole("ADMIN")
										.requestMatchers(HttpMethod.DELETE, "/api/v1/collaborators").hasRole("ADMIN")*/
										.anyRequest().permitAll())//.authenticated())
						.httpBasic(withDefaults())
				    .csrf(AbstractHttpConfigurer::disable).build();
	}

	@Bean
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
}
