//package com.godgoddess.base.util;
//
// public class TokenInterceptor extends HandlerInterceptor  {
//     @Autowired
//     private Memory memory;
// 
//     private List<String> allowList; // 放行的URL列表
// 
//     private static final PathMatcher PATH_MATCHER = new AntPathMatcher();
// 
//     @Override
//     public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//         // 判断请求的URI是否运行放行，如果不允许则校验请求的token信息
//         if (!checkAllowaccess(request.getRequestURI())) {
//             // 检查请求的token值是否为空
//             String token = getTokenFromRequest(request);
//             response.setContentType(MediaType.application_JSON_VALUE);
//             response.setCharacterEncoding("UTF-8");
//             response.setHeader("Cache-Control", "no-cache, must-revalidate");
//             if (StringUtils.isEmpty(token)) {
//                 response.getWriter().write("Token不能为空");
//                 response.getWriter().close();
//                 return false;
//             }
//             if (!memory.checkLoginInfo(token)) {
//                 response.getWriter().write("Session已过期，请重新登录");
//                 response.getWriter().close();
//                 return false;
//             }
//             ThreadTokenHolder.setToken(token); // 保存当前token，用于Controller层获取登录用户信息
//         }
//         return super.preHandle(request, response, handler);
//     }
// 
//     /**
//      * 检查URI是否放行
//      * 
//      * @param URI
//      * @return 返回检查结果
//      */
//     private boolean checkAllowAccess(String URI) {
//         if (!URI.startsWith("/")) {
//             URI = "/" + URI;
//         }
//         for (String allow : allowList) {
//             if (PATH_MATCHER.match(allow, URI)) {
//                 return true;
//             }
//         }
//         return false;
//     }
// 
//     /**
//      * 从请求信息中获取token值
//      * 
//      * @param request
//      * @return token值
//      */
//     private String getTokenFromRequest(HttpServletRequest request) {
//         // 默认从header里获取token值
//         String token = request.getHeader(Constants.TOKEN);
//         if (StringUtils.isEmpty(token)) {
//             // 从请求信息中获取token值
//             token = request.getParameter(Constants.TOKEN);
//         }
//         return token;
//     }
// 
//     public List<String> getAllowList() {
//         return allowList;
//     }
// 
//     public void setAllowList(List<String> allowList) {
//         this.allowList = allowList;
//     }
// }
