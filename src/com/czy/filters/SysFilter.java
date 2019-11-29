package com.czy.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author czy
 * @version 1.0.1
 * @company 东方标准
 * @date 2019/11/29 16:47
 * @description 过滤任何请求，设置编码
 */
@WebFilter("/*")
public class SysFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        filterChain.doFilter(request, response);

    }
}
