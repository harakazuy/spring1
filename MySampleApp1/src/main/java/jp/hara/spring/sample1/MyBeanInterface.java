package jp.hara.spring.sample1;

import java.util.Date;

public interface MyBeanInterface {
	
	public abstract  Date getDate();

	public abstract String getMessage();

	public abstract void setMessage(String message);

}