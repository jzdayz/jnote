package org.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.lang.annotation.*;

@Aspect
public class TestModeOnlyAspect {
	@Pointcut("@annotation(A)")
	public void testModeOnlyMethods() {
	}

	@Before("@annotation(A)")
	public void testModeOnly(JoinPoint joinPoint) {
		if (!Boolean.getBoolean("test.mode.enabled")) {
			throw new RuntimeException(joinPoint.toString());
		}
	}

	@Target({ElementType.TYPE,ElementType.METHOD})
	@Retention(RetentionPolicy.RUNTIME)
	@Documented
	@interface A{

	}

	@A
	public void show(){
		System.out.println("sss");
	}

	public static void main(String[] args) {

		new TestModeOnlyAspect().show();
	}
}