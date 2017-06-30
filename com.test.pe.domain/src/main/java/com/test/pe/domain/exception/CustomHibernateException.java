package com.test.pe.domain.exception;

public class CustomHibernateException extends Exception{

	public CustomHibernateException(String message){
		super(message);
	}
	
	public CustomHibernateException(String message, Throwable throwable){
		super(message,throwable);
	}
	
	public CustomHibernateException(Throwable throwable){
		super(throwable);
	}
}
