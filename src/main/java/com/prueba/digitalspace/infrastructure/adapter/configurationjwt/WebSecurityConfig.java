package com.prueba.digitalspace.infrastructure.adapter.configurationjwt;

import com.prueba.digitalspace.domain.model.constant.Constans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
@Configuration
class WebSecurityConfig{

    @Autowired
    JWTAuthorizationFilter jwtAuthorizationFilter;

    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {

        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests( authz -> authz
                        .requestMatchers(HttpMethod.POST, String.valueOf(HttpMethod.POST), Constans.LOGIN_URL,Constans.CUSTOMER_CREATE,
                                Constans.CREATE_TYPE_PRODUCT,Constans.CREATE_WAREHOUSE,
                                Constans.CREATE_SEAPORTSTRING,Constans.CREATE_TRUCK,
                                Constans.CREATE_MARITIME,Constans.FIND_BY_GUIDE_NUMBER).permitAll()
                        .anyRequest().authenticated())
                .addFilterAfter(jwtAuthorizationFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}