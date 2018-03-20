package crawler01.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WebGetContent {
	public static String getContentString(String urlStr){
		//������վ���ݵ���
		BufferedReader in = null;
		//���
		StringBuffer result = new StringBuffer();
		try {
			//��stringתΪURL����
			URL url = new URL(urlStr);
			//��ȡ����
			URLConnection connetion = url.openConnection();
			//��������
			connetion.connect();
			//�������л�ȡ����Ϣ
			in = new BufferedReader(new InputStreamReader(connetion.getInputStream()));
			//�����ж�ȡ����
			String line = null;
			while((line = in.readLine()) != null){
				result.append(line);
			}
			//���ؽ��
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
