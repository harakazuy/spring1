package jp.hara.spring.sample1;

import java.util.Calendar;
import java.util.Date;

public class MyBean implements MyBeanInterface {
	public Date date;
	public String message;
	
	public MyBean(){
		super();
		this.date = Calendar.getInstance().getTime();
	}
	
	public MyBean(String message){
		this();
		this.message = message;
	}
	
	/* (non-Javadoc)
	 * @see jp.hara.spring.sample1.MyBeanInterface#getMessage()
	 */
	@Override
	public Date getDate(){
		return date;
	}
	
	/* (non-Javadoc)
	 * @see jp.hara.spring.sample1.MyBeanInterface#getMessage()
	 */
	@Override
	public String getMessage(){
		return message;
	}
	
	/* (non-Javadoc)
	 * @see jp.hara.spring.sample1.MyBeanInterface#setMessage(java.lang.String)
	 */
	@Override
	public void setMessage(String message){
		this.message = message;
	}
	
	/* (non-Javadoc)
	 * @see jp.hara.spring.sample1.MyBeanInterface#toString()
	 */
	@Override
	public String toString(){
		return "MyBean [message=" + message + ", date=" + date + "]";
	}
	
}
