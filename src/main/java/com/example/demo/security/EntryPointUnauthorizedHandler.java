package com.example.demo.security;

import com.example.demo.model.AjaxResponseBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IDEA
 * author:hxb
 *
 * @Date: 2019/5/22 16:08
 * @Description: 认证失败
 */
@Component
public class EntryPointUnauthorizedHandler implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        System.out.println("---------------------------------------------------------------------");
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out = response.getWriter();
        AjaxResponseBody respBody = new AjaxResponseBody();
        respBody.setMsg("权限不足，请联系管理员!");
        respBody.setResult(403);
        out.write(new ObjectMapper().writeValueAsString(respBody));
        out.flush();
        out.close();
    }
}
