package crawler01;

import crawler01.common.WebGetContent;
import crawler01.util.MatcherUtil;

/**
 * 
 * @author haodesheng
 *
 */
public class Main {

	public static void main(String[] args) {
		//爬虫网站已百度为例
		String urlStr = "https://www.baidu.com";
		//获取图片url的正则表达式
		String  imgPatter = "src=[^ >]* ";
		//获取图片url
		String imgUrl = MatcherUtil.regexString(WebGetContent.getContentString(urlStr), imgPatter).replace("src=", "https:");
		
		System.out.println(imgUrl);
	}

}
