package com.test.corejava;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class testStringValueDilimitor {
	
	
	public static void main(String[] args) {
		
		String referralNote="RL2TORL1ACTION02||#$%^&*#$%^#qwertyuioasdfghjklzxcvbnmqwertyuiasdfghjkzxcvbnmqwertyuiopasdfghjklMEGHA";
		String referralEvent="EXREFCLOSE";
		String reffalPerformedBy="";
		String reffralHitType ="XRP";
		
		referralNote = referralNote.replace("-", "<br/>");
		String referralHitAdditionaNotes="";
		boolean isreferralhitAdditionNotesadded=StringUtils.isEmpty(referralNote.substring(referralNote.indexOf("||")+2,referralNote.length()-1));
		
		if (referralNote.contains("||"))
		{
			if ("XRP".equals(reffralHitType)|| "EXREFCLOSE".equals(referralEvent))
			{
				Map<String, String> RL1Response= new HashMap<>();
				RL1Response.put("RL1TORL2ACTION02","Response from Rl1 to RL2");
				
				Map<String, String> RL2Response=new HashMap<>();
				RL1Response.put("RL2TORL1ACTION02","Response from Rl1 to RL2");
				
				referralHitAdditionaNotes +="Decision:"+RL1Response.get(referralNote.substring(0, referralNote.indexOf("||")).trim());
				referralHitAdditionaNotes += RL2Response.get(referralNote.substring(0, referralNote.indexOf("||")).trim())+"\n";
				
				if (isreferralhitAdditionNotesadded)
	    		{
	    			referralHitAdditionaNotes += "Notes:-"+"\n";
	    		}
				else
				{
	    			referralHitAdditionaNotes += "Notes:";
	    			referralHitAdditionaNotes += referralNote.substring(referralNote.indexOf("||")+2, referralNote.lastIndexOf("#$%^&*#$%^#"))+"\n";
	    			if(referralNote.contains("#$%^&*#$%^#") && (referralNote.contains("RL2TORL1ACTION02") || referralNote.contains("RL1TORL2ACTION02")))
	    			{
	    				referralHitAdditionaNotes += "More Additional Notes:"+referralNote.substring(referralNote.lastIndexOf("#$%^&*#$%^#")+"#$%^&*#$%^#".length(),referralNote.length());
	    			}
				}
				
			}
	  }
		System.out.println(referralHitAdditionaNotes);
	}
}
	
	