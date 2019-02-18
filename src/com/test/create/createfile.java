package com.test.create;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class createfile {
	public static void main(String[] args) {
		InputStream is;
		String name = "F:\\trytest\\test-1\\";
		for (int i = 1; i < 100; i++) {
			String fileName = "F:\\trytest\\test-";
			fileName += (i+1); 
			fileName += "\\"; 
			for (int j = 0; j < 10; j++) {
				
				try {
					String finalName = name+"kzkzzz"+j+".log";
					is = new FileInputStream(finalName);
					OutputStream os = new FileOutputStream(fileName+"kzkzzz"+j+".log");
					byte[] buffer = new byte[1024];
					int len = 0;
					while ((len = is.read(buffer)) != -1) {
						os.write(buffer, 0, len);
					}
					os.close();
					is.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("第"+i+"次成功");
		}
		  
	}
	
	
	
	
	
	
}
