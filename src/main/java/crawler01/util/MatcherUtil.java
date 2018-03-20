package crawler01.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherUtil {
	
	/**
	 * 
	 * @param tagerStr Ҫ���ҵ�����
	 * @param patterStr ������ʽ
	 * @return �ҵ��󷵻أ��Ҳ�������""
	 */
	public static String regexString(String tagerStr,String patterStr){
		//�������ʼ��һ��Pattern����
		Pattern pattern = Pattern.compile(patterStr);
		//ƥ��
		Matcher matcher = pattern.matcher(tagerStr);
		//����ƥ������
		if(matcher.find()){
			return matcher.group();
		}
		return "";
	}
}
