package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SpringSecurityConfig {
	
	public void configure(HttpSecurity http) throws Exception
	{
		http.csrf().disable();
		http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
	}
	  @Bean
	    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
	        // InMemoryUserDetailsManager setup with two users
	        UserDetails admin = User.withUsername("admin")
	                .password(encoder.encode("admin"))
	                .roles("ADMIN", "USER")
	                .build();

	        UserDetails user = User.withUsername("user")
	                .password(encoder.encode("user"))
	                .roles("USER")
	                .build();

	        return new InMemoryUserDetailsManager(admin, user);
	    }

	
	/*
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((authorize) -> authorize
						.requestMatchers("/contact", "/swagger-ui.html","/h2-console","/save","/welcome").permitAll()
						.anyRequest().authenticated()
			)
				.httpBasic(withDefaults())
				.formLogin(withDefaults());
		return http.build();
	}
	
	
	
	@Bean
	public InMemoryUserDetailsManager inMemoryUsers() {
		
		UserDetails ashokUser = User.withDefaultPasswordEncoder()
									.username("chandu")
									.password("chandu")
									.authorities("ADMIN")
									.build();
		
		
		UserDetails johnUser = User.withDefaultPasswordEncoder()
									.username("ram")
									.password("ram")
									.authorities("USER")
									.build();
		
		return new InMemoryUserDetailsManager(ashokUser, johnUser);
		
	}
	*/
	  // Password Encoding
	    @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
}
