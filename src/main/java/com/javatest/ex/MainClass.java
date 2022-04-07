package com.javatest.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		// �����̳� ��ü�� ApplicationConfig Ŭ������ �����Ͽ� ����
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		
		Student student1 = ctx.getBean("student1",Student.class);
		Student student2 = ctx.getBean("student2",Student.class);
		Student student3 = ctx.getBean("student3",Student.class);
		
		System.out.println(student1.getName()); // ȫ�浿
		System.out.println(student2.getName()); // �̼���
		System.out.println(student3.getName()); // ������ 

		ctx.close();
	}

}