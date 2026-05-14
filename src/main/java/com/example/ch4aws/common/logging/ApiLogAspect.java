package com.example.ch4aws.common.logging;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
@RequiredArgsConstructor
public class ApiLogAspect {

    private final HttpServletRequest request;

    @Before("within(@org.springframework.web.bind.annotation.RestController *)")
    public void logApiRequest(JoinPoint joinPoint) {
        log.info("[API - LOG] {} {} -> {}.{}",
                request.getMethod(),
                request.getRequestURI(),
                joinPoint.getSignature().getDeclaringType().getSimpleName(),
                joinPoint.getSignature().getName());
    }
}
