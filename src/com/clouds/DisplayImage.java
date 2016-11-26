package com.clouds;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayImage extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		for(int i=10;i>=0;i--){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	response.setContentType("image/jpeg");
	ServletOutputStream out;
	out = response.getOutputStream();
	FileInputStream fin = new FileInputStream("C:/Users/NirmalKumar/Desktop/Cloudspace.jpg");
	BufferedInputStream bin = new BufferedInputStream(fin);
	BufferedOutputStream bout = new BufferedOutputStream(out);
	int ch =0; ;
	while((ch=bin.read())!=-1)
	{
	bout.write(ch);
	}
	
	bin.close();
	fin.close();
	bout.close();
	out.close();
	}
	}
