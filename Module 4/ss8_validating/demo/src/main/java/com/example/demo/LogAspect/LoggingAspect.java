package com.example.demo.LogAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Pointcut("execution (* com.example.demo.service.LoginService.*(..))")
    public void loginService() {
    }

    @Before("loginService()")
    public void writeLogBefore(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("========Before call method: " + methodName);
    }

    /** Đây là annotation để định nghĩa advice và pointcut
     * Phương thức writeLogAround sẽ được thực thi trước và sau khi các phương thức có tên bắt đầu bằng
     * find trong lớp LogginService được gọi.
     * Các ký tự * và ... là các widlcard để khớp với bất kỳ kiểu trả về hoặc tham số nào
     * @param joinPoint
     * @return
     * @throws Throwable
     */

    @Around("execution (* com.example.demo.service.LoginService.find*(..))")
    /*
    Đây là phương thức advice, nó nhận một tham số là joinPoint
    --> joinPoint là đối tượng đại diện cho phương thức được gọi
    Nó trả về một đối tượng Object là kết quả của phương thức được gọi
    Nó cũng có thể ném ra ngoại lệ Throwable nếu có lỗi xảy ra trong quá trình thực thi.
     */
    public Object writeLogAround(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        /*
        * lấy tên cuả phương thức được gọi từ joinPoint
        * Phương thức getSignature trả về một đối tượng Signature chứa các thông tin về phương thức đc gọi
        * VD như: tên , kiểu trả về, tham số ,...
        * Phương thức getName() trả về tên của phương thức dưới dạng một chuỗi
        * */
        logger.info("========Around call method: before " + methodName);
        Object result = joinPoint.proceed();
        /*
        để gọi phương thức được gọi, và lưu kết quả vào một biến result.
        Phương thức proceed() của joinPoint sẽ thực thi phương thức được gọi
        và trả về kết quả dưới dạng một đối tượng Object
        Nếu có lỗi xảy ra --> ném ra một ngoại lệ
        * */
        logger.info("=========Around call method: after " + methodName);
        return result;
        /*
        * kết quả của phương thức được gọi
        * */
    }
}
