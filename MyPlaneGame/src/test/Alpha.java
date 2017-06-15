package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class Alpha {
		@Test	
		public void testBreak1() { 
	        System.out.println("--------测试break1-------"); 
	        for (int i = 1; i <= 5; i++) { 
	            if (i == 3) 
	            continue; 
	            System.out.println("i=" + i); 
	        } 
	    } 

	}

