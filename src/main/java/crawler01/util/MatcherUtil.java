package crawler01.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherUtil {
	
	/**
	 * 
	 * @param tagerStr 要查找的内容
	 * @param patterStr 正则表达式
	 * @return 找到后返回，找不到返回""
	 */
	public static String regexString(String tagerStr,String patterStr){
		//将规则初始化一个Pattern对象
		Pattern pattern = Pattern.compile(patterStr);
		//匹配
		Matcher matcher = pattern.matcher(tagerStr);
		//查找匹配数据
		if(matcher.find()){
			return matcher.group();
		}
		return "";
	}
}
