package controller;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class Listener implements  HttpSessionListener
{
	int current = 0;
	int total = 0;
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
	
		current++;
		total++;
	}
}
