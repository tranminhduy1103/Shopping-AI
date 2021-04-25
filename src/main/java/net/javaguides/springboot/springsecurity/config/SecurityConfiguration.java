package net.javaguides.springboot.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import net.javaguides.springboot.springsecurity.service.UserService;

/**This class is used to configure our website( check role, redirect agter login, some security property,..)**/

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserService userService;

    @Autowired
    private SimpleAuthenticationSuccessHandler successHandler;
    @Autowired
    public BCryptPasswordEncoder passwordEncoder;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable();
//        http.authorizeRequests().antMatchers("/Team-Builder/**").authenticated().and().exceptionHandling().accessDeniedPage("/403");
        http.rememberMe().key("uniqueAndSecret").tokenValiditySeconds(1296000);
        http.authorizeRequests()
                    .antMatchers("/registration**",
                            "/Register/**",
                            "/Menu/**",
                            "/Login_form/**",
                            "/js/**",
                            "/css/**",
                            "/images/**",
                            "/plugins/**",
                            "/styles/**",
                            "/img/**",
                            "/webjars/**").permitAll();
        http.csrf().requireCsrfProtectionMatcher(new AntPathRequestMatcher("**/Login_form")).and().authorizeRequests()
                .antMatchers("/Menu").hasAuthority("ROLE_USER")
                .antMatchers("/adminview").hasAuthority("ROLE_ADMIN")
                // .antMatchers("/supplierview").hasAuthority("ROLE_SUPPLIER")

                .and().formLogin().loginPage("/Login_form").loginProcessingUrl("/Login_form").successHandler(successHandler)


                .and()
                    .logout()
                        .invalidateHttpSession(true)
                        .clearAuthentication(true)
                        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                        .logoutSuccessUrl("/Login_form?logout")
                .permitAll();
        http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");


    }


    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
        auth.setUserDetailsService(userService);
        auth.setPasswordEncoder(passwordEncoder());
        return auth;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
    }
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
        auth.inMemoryAuthentication().withUser("admin").password("password").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("supplier").password("password").roles("SUPPLIER");
    }

}
