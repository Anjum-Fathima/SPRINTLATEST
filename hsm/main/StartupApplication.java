package com.cg.hsm.main;

import com.cg.hsm.exception.InsufficientExperienceException;
import com.cg.hsm.exception.InsufficientHoursOfAvailabilityException;
import com.cg.hsm.util.MenuUtil;

public class StartupApplication {

	public static void main(String args[]) throws InsufficientExperienceException, InsufficientHoursOfAvailabilityException
	{
		MenuUtil menuutil=new MenuUtil();
		menuutil.start();
	}

}
