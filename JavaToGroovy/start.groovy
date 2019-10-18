import java.util.Date;

public class User{
	private String first;
	private String last;
	private Date date;
	
	public User(){
	}
	
	public User(String first, String last){
		this.first = first;
		this.last = last;
	}

	public String getFirst(){
		return first;
	}

	public void setFirst(String first){
		this.first = first;
	}

	public String getLast(){
		return last;
	}
	
	public void setLast(String last){
		this.last = last;
	}
	
	public Date getDate(){
		return date;
	}
	
	public void setDate(Date date){
		this.date = date;
	}
	
	public void printFullName(){
		System.out.println(" FullName: " + fist + " " + last);
	}
	
	@Override
	public String toString(){
		"User[first=" + first + " " + last + "]";
	}
	
}