package com.godgoddess.base.util;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;
import com.godgoddess.base.action.Memory;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

@SuppressWarnings("serial")
public class myInterceptor extends AbstractInterceptor{
	
	@Autowired
	 private Memory memory;
	 private List<String> allowList; // 放行的URL列表
	 private static final PathMatcher PATH_MATCHER = new AntPathMatcher();
	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		String token = request.getParameter("token");
		response.setContentType(MediaType.APPLICATION_JSON_VALUE);
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Cache-Control", "no-cache, must-revalidate");
		if("".equals(token)==true || token == null){
			response.getWriter().write("Token不能为空");
			response.getWriter().close();
		}
		else{
			if (!memory.checkLoginInfo(token)) {
                response.getWriter().write("Session已过期，请重新登录");
                response.getWriter().close();
			}
			else{
				return actionInvocation.invoke();
			}
		}
        return "success";  
	}
//	
	private boolean checkAllowAccess(String URI) {
         if (!URI.startsWith("/")) {
             URI = "/" + URI;
         }
         for (String allow : allowList) {
             if (PATH_MATCHER.match(allow, URI)) {
                 return true;
             }
         }
         return false;
     }
//	private String getTokenFromRequest(HttpServletRequest request) {
//         // 默认从header里获取token值
//		
////         String token = request.getHeader();
////         if (StringUtils.isEmpty(token)) {
////             // 从请求信息中获取token值
//            String token = request.getParameter("token");
//            
////         }
//         return token;
//     }
//	
//	 public List<String> getAllowList() {
//         return allowList;
//     }
// 
//    public void setAllowList(List<String> allowList) {
//         this.allowList = allowList;
//    }

}
