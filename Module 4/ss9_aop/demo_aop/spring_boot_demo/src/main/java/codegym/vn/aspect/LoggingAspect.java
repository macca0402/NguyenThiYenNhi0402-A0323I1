package codegym.vn.aspect;

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
    @Pointcut("execution (* codegym.vn.service.ProductService.*(..))")
    public void productService(){};
    @Before("productService()")
    public void writeLogBefore(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("======== Before call method: " + methodName);
    }
    @Around("execution (* codegym.vn.service.ProductService.find*(..))")
    public Object writeLogAround(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        logger.info("======== Around call method: before " + methodName);
        Object result = joinPoint.proceed();
        logger.info("======== Around call method: after " + methodName);
        return result;
    }
}
