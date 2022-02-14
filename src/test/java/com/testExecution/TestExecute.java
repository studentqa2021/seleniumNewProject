package com.testExecution;

import com.util.BaseConfig;

public class TestExecute {
	
	public static void main(String[] args) {
		BaseConfig.getConfigValue("Browser");
		BaseConfig.getConfigValue("URL");
		BaseConfig.getConfigValue("FF");
	}

}
