package model;

import java.util.List;

public class Answer {

	int aid;
   List<String> aname;	
   
	public void display()
	{
		System.out.println(aname);
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}

	public List<String> getAname() {
		return aname;
	}

	public void setAname(List<String> aname) {
		this.aname = aname;
	}

	
	
	
}
