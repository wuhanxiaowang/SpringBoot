package com.example.demo.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * @ClassName TimeFilter
 * @Description TODO
 * @Author 王炎
 * @Date 2019/8/17 13:26
 * @ModifyDate 2019/8/17 13:26
 * @Version 1.0
 */
//@Component
public class TimeFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("time filter is init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("time filter is start");

        chain.doFilter(request,response);

        System.out.println("time filter is finish");

    }

    @Override
    public void destroy() {
        System.out.println("time filter is destroy");
    }
}
