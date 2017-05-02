package com.testng;

import java.util.HashMap;

public class scenario_data {
	
	public static final HashMap<String, Boolean> Scenario_Testcase= new HashMap<String, Boolean>();
	
	public static final  HashMap<String, Boolean> data(){
		Scenario_Testcase.put("Testcase1", Boolean.valueOf("true"));
		Scenario_Testcase.put("Testcase2", Boolean.valueOf("true"));
		
		return Scenario_Testcase;
	}
	
	public static void main(String[] args) {
		System.out.println(scenario_data.data().get("Testcase1"));
	}

}
