package model;

import java.util.List;

public class Question {

	int qid;
	String qname;
	List<Answer> ans;

	public void display()
	{
		System.out.println(qname);
		System.out.println("****Answer****");
	
		
	}
	
	

	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}



	


	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	
	
}
