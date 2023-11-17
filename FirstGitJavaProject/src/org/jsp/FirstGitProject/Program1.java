package org.jsp.FirstGitProject;

import java.util.Date;

public class Program1 {
	public Date getSysDate() {
		return new Date();
	}
	public static void main(String[] args) {
		Program1 p=new Program1();
		System.out.println(p.getSysDate());
	}

}
