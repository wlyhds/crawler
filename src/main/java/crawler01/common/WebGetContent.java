package crawler01.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WebGetContent {
	public static String getContentString(String urlStr){
		//接收网站内容的流
		BufferedReader in = null;
		//结果
		StringBuffer result = new StringBuffer();
		try {
			//将string转为URL对象
			URL url = new URL(urlStr);
			//获取连接
			URLConnection connetion = url.openConnection();
			//真正连接
			connetion.connect();
			//从连接中获取流信息
			in = new BufferedReader(new InputStreamReader(connetion.getInputStream()));
			//从流中读取内容
			String line = null;
			while((line = in.readLine()) != null){
				result.append(line);
			}
			//返回结果
			return result.toString();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return "";
	}
}
