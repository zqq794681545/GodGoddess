package com.godgoddess.base.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.godgoddess.base.entity.TBaseMenuEntity;


public class UrlService {

	public static void main(String[] args) {
//		Set<String> set = findJspAndJs("D:/gsgl/WebContent/","../htcr/xmxx_list.jsp");
//		for(String each:set)
//		List<TBaseMenuEntity> list = findAction("D:\\eclipse-jee-kepler-R-win32\\apache-tomcat-7.0.42\\webapps\\demo\\","../console/base_menu.jsp");
//		List<TBaseMenuEntity> list = findAction("D:/gsgl/WebContent/","../htcr/xmxx_list.jsp");

			
	}

	
	private static String formatUrl(String childUrl,String parentUrl){
		String result = parentUrl.substring(0,parentUrl.lastIndexOf("/"));
		String[] a = childUrl.split("/");
		for(String each:a){
			if("..".equals(each)){
				int index = result.lastIndexOf("/");
				if(index >0)
					result = result.substring(0,index);
				else
					result = "";
			}else{
				result += "/"+ each;
			}
		}
		while (result.startsWith("/")) {
			result = result.substring(1);
		}
		return result;
	}
	
	private static Set<String> findJsp(Set<String> set,String rootUrl,String url){
		String res = getString(rootUrl, url);
		if(res == null || "".equals(res))
			return set;
		int jsp_end_index = res.indexOf(".jsp");
		while(jsp_end_index > 0){
			int startIndex = jsp_end_index - 100;
			if(startIndex < 0)
				startIndex = 0;
			String urlStr = res.substring(startIndex,jsp_end_index+4);
			int index2 = urlStr.lastIndexOf("\"");
			int index3 = urlStr.lastIndexOf("'");
			if(index2 <0 && index3<0){
				
			}else{
				int index = Math.max(index2,index3);
				String jsp_url = urlStr.substring(index+1);
				String url2 = formatUrl(jsp_url,url);
				if(!url2.startsWith("js/")){
					while(set.add(url2)){
						findJsp(set,rootUrl,url2);
						findJs(set,rootUrl,url2);
					}
				}
				jsp_end_index = res.indexOf(".jsp", jsp_end_index+4);
			}
		}
		return set;
	}
	
	private static Set<String> findJs(Set<String> set,String rootUrl,String url){
		String res = getString(rootUrl, url);
		if(res == null || "".equals(res))
			return set;
		int js_end_index = res.indexOf(".js");
		while(js_end_index > 0){
			int startIndex = js_end_index - 100;
			if(startIndex < 0)
				startIndex = 0;
			String urlStr = res.substring(startIndex,js_end_index+3);
			int index2 = urlStr.lastIndexOf("\"");
			int index3 = urlStr.lastIndexOf("'");
			if(index2 <0 && index3<0){
				
			}else{
				int index = Math.max(index2,index3);
				String js_url = urlStr.substring(index+1);
				String url2 = formatUrl(js_url,url);
				if(!url2.startsWith("js/")){
					while(set.add(url2)){
						findJsp(set,rootUrl,url2);
						findJs(set,rootUrl,url2);
					}
				}
				js_end_index = res.indexOf(".js", js_end_index+3);
			}
		}
		return set;
	}
	
	private static Set<String> findJspAndJs(String rootUrl,String url){
		Set<String> set = new HashSet<>();
		url = url.replace("../", "");
		set.add(url);
		findJsp(set,rootUrl,url);
		findJs(set,rootUrl,url);
		return set;
	}	
		
	public static List<TBaseMenuEntity> findAction(String rootUrl,String url){
		List<TBaseMenuEntity> resut = new ArrayList<TBaseMenuEntity>();
		Set<String> set2 = new HashSet<String>();
		Set<String> set = findJspAndJs(rootUrl,url);
		for(String each:set){
			findAction(resut,set2,rootUrl,each);
		}
		return resut;
	}	
	//获取action
	private static List<TBaseMenuEntity> findAction(List<TBaseMenuEntity> list,Set<String> set,String rootUrl,String url) {
		String res = getString(rootUrl, url);
		if(res == null || "".equals(res))
			return list;
		int endIndex = res.indexOf(".action");
		while(endIndex > 0){
			int startIndex = endIndex - 150;
			if(startIndex < 0)
				startIndex = 0;
			String urlStr = res.substring(startIndex,endIndex+7);
			int index2 = urlStr.lastIndexOf("\"");
			int index3 = urlStr.lastIndexOf("'");
			if(index2 <0 && index3<0){
				
			}else{
				int index = Math.max(index2,index3);
				String action_url = urlStr.substring(index+1);
				if(set.add(action_url)){
					TBaseMenuEntity e = new TBaseMenuEntity();
					e.setUrl(action_url);
					int x = res.indexOf("/**", endIndex);
					int y = res.indexOf("**/", endIndex);
					int z = res.indexOf(".action", endIndex+7);
					int flag = 0;
					if(x>0 && y> 0 && y > x){
						if(z > 0){
							if( z > x && z > y){
								flag = 1;
							}else{
								flag = 0;
							}
						}else{
							flag = 1;
						}
					}
					if(flag == 1){
						e.setName(res.substring(x+3, y).trim());
					}
					list.add(e);
				}
				endIndex = res.indexOf(".action", endIndex+7);
			}
		}
		return list; 
	}	
		
	private static String getString(String rootUrl,String url){
		InputStream is = null;
		String res = "";
		try {
			is = new FileInputStream(rootUrl+url);
			BufferedReader reader = new BufferedReader(new InputStreamReader(is,"utf-8"));
			String line;  
			while((line = reader.readLine()) != null){  
				res += line;  
			}  
			reader.close();  
			is.close();
		} catch (FileNotFoundException e) {
			res = "";
		}catch(IOException e1){
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return res;
	}
	

}
