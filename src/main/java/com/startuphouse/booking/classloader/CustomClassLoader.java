package com.startuphouse.booking.classloader;

import org.apache.struts2.impl.StrutsObjectFactory;

public class CustomClassLoader extends StrutsObjectFactory {

	@Override
	public Class getClassInstance(String className)
			throws ClassNotFoundException {
		return Thread.currentThread().getClass().getClassLoader().loadClass(className);
	}

}
