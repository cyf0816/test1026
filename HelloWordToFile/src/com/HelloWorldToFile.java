package com;

import java.io.*;

public class HelloWorldToFile {
	public String readString(File file){
		if(!file.exists()){
			return "文件不存在！";
		}
		StringBuffer buffer=new StringBuffer();
		try {
			InputStream in=new FileInputStream(file);
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			String str=null;
			while((str=br.readLine())!=null){
				buffer.append(str+"\n");
			}
			br.close();
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return buffer.toString();
	}

	public void wirterString(File file, String str){
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			OutputStream out=new FileOutputStream(file);
			byte[] strByte=str.replace("\n","\r\n").getBytes();
			out.write(strByte);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args){
		File file=new File("E:/aaa.txt");
		HelloWorldToFile helloWorldToFile =new HelloWorldToFile();
		String str= helloWorldToFile.readString(file);
		System.out.println(str);
		helloWorldToFile.wirterString(new File("E:/bbb.txt"),str);
	}
}
