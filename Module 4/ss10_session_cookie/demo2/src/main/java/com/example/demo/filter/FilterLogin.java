//package com.example.demo.filter;
//
//
//import com.example.demo.codegym.vn.entity.User;
//import jakarta.servlet.*;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//
//
//@Component
//@Order(1)
//public class FilterLogin implements Filter {
//    private static final String ADMIN = "ADMIN";
//    private static final String USER = "USER";
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        HttpServletRequest req = (HttpServletRequest) request;
//        HttpServletResponse res = (HttpServletResponse) response;
//        HttpSession session = req.getSession();
//        User user = (User) session.getAttribute("user");
//        if (user == null && !req.getServletPath().contains("login")) {
//            res.sendRedirect("/login");
//            return;
//        } else if (user == null) {
//            chain.doFilter(req, res);
//        }
//        if (USER.equals(user.getRole())
//                &&!req.getServletPath().equals(("/authorize"))
//                && !req.getServletPath().equals("/login")){
//            if(!req.getServletPath().equals("/product/list")){
//                res.sendRedirect("/authorize");
//                return;
//            }
//        }
//        chain.doFilter(req,res);
//    }
//}
