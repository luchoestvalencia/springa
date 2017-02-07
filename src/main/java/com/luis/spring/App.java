package com.luis.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luis.beans.Mundo;
import com.luis.beans.Persona;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instancia del objeto Mundo
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/luis/xml/beans.xml");
		Mundo m = (Mundo) appContext.getBean("mundo");
		System.out.println(m.getSaludo());
		
		//Instancia del objeto persona
		Persona per = (Persona) appContext.getBean("personaBean");
		System.out.println(per.getId() + " "+ per.getNombre()+ " " + per.getApodo ()+ " " + per.getPais().getNombre()+ " "+ per.getPais().getCiudad().getNombre());
		
		//cerrar el app context
		((ConfigurableApplicationContext) appContext).close();
		
		

	}

}
