package codegym.vn.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class Config extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailsService userDetailsService;
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Đăng ký những trang không cần đăng nhập cũng vào được
        http.authorizeHttpRequests().antMatchers("/login", "/product/list").permitAll();
        // Đăng ký những trang cho phép user sử dụng
        http.authorizeHttpRequests().antMatchers("/product/create","/user/**").hasRole("USER");
        http.authorizeHttpRequests().antMatchers("/admin/**", "/product/**").hasRole("ADMIN");
        // Trả về trang lỗi khi principal truy cập không đúng quyền
        http.authorizeHttpRequests().and().exceptionHandling().accessDeniedPage("/accessdenied");
        // Cấu hình login
        http.authorizeHttpRequests().and().formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/doLogin")
                .defaultSuccessUrl("/product/list")
                .failureUrl("/login?error=true")
                .usernameParameter("username")
                .passwordParameter("password")
                .and().logout().logoutUrl("/logout").permitAll();
    }
}
