package com.example.demo.config;

/**
 * @ClassName SpringSecurityConfig
 * @Description TODO
 * @Author 王炎
 * @Date 2019/8/17 11:36
 * @ModifyDate 2019/8/17 11:36
 * @Version 1.0
 */
//@Configuration
//@EnableWebSecurity
/*
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    CustomPasswordEncoder customPasswordEncoder;


    */
/**
       @Description 基于内存验证的方法
    *//*

   */
/* @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin").password("123456").roles("ADMIN")
                .and()
                .withUser("user").password("123456").roles("Employee")
                .and()
                .passwordEncoder(customPasswordEncoder);
    }*//*


    */
/**
       @Description 拦截http请求
    *//*

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.formLogin()
              // .loginPage("/demo/index")
               .and()
               .authorizeRequests()
             //  .antMatchers("/demo/index").permitAll()
               .anyRequest()
               .authenticated();

       http.csrf().disable();
    }

    */
/**
       @Description 忽略一些静态资源
    *//*

    @Override
    public void configure(WebSecurity web) throws Exception {
       web.ignoring().antMatchers("/js/**","/css/**","/images/**");
    }





}
*/
