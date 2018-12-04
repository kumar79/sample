package com.apps.classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.access.BeanFactoryLocator;
import org.springframework.beans.factory.access.BeanFactoryReference;
import org.springframework.context.ApplicationContext;
import org.springframework.context.access.ContextSingletonBeanFactoryLocator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
	/*	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeansHolder.xml");
		Building building = (Building) applicationContext.getBean("hh");
		System.out.println(building);
		Building building2 = (Building) applicationContext.getBean("hho");
		System.out.println(building2);
		System.out.println(building==building2); 
		((ClassPathXmlApplicationContext) applicationContext).close();*/
		BeanFactoryLocator locator = ContextSingletonBeanFactoryLocator.getInstance("BeansHolder.xml");
		BeanFactoryReference reference = locator.useBeanFactory("org.setup.combination");
		BeanFactory beanFactory = reference.getFactory();
		System.out.println((Books) beanFactory.getBean("books")); 
		System.out.println((Building) beanFactory.getBean("buildings")); 
		System.out.println((Companies) beanFactory.getBean("companies")); 
		Books  books = Books.class.newInstance();
		books.setAuthor("Katju");
		System.out.println(books.getAuthor());
		System.out.println(books.getBookName()); 
		System.out.println(books.getClass());
		Class cc = books.getClass();
		System.out.println(cc.getName());
		System.out.println(cc.getSuperclass());
		System.out.println(cc.getSimpleName());
		System.out.println();
		Method[] mm = cc.getMethods();
		System.out.println("method names");
		for(Method method : mm) {
			System.out.println(method.getName());
		}
		Constructor cons = cc.getConstructor(); 
		System.out.println(cons.getName());
		Method privates = cc.getDeclaredMethod("privatization");
		privates.setAccessible(true);
		privates.invoke(books);
		System.out.println("Using forname method");
		Class ff = Class.forName("com.apps.classes.Books");
		System.out.println(ff.getName());
		Method tttt = ff.getDeclaredMethod("privatization");
		tttt.setAccessible(true);
		tttt.invoke(ff.newInstance());
		System.out.println(ff.isInterface());
		System.out.println(((Books)ff.newInstance()).getAuthor());
	}
}
