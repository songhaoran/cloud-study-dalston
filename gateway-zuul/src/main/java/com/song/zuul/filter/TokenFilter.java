package com.song.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Song on 2020/06/28.
 */
@Component
@Slf4j
public class TokenFilter extends ZuulFilter {

    @Override
    public String filterType() {
        // 返回一个字符串代表过滤器的类型
        // pre：在路由请求之前调用
        // routing：在路由请求时候调用
        // post：在routing和error过滤器之后被调用
        // error：处理请求发生错误时被调用
        return "pre";
    }

    @Override
    public int filterOrder() {
        // 通过int值来定义过滤器的执行顺序
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        // 判断该过滤器是否要执行，所以通过此函数可实现过滤器的开关
        return true;
    }


    /**
     * 过滤器的具体逻辑
     *
     * @return
     */
    @Override
    public Object run() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
//        String token = request.getHeader("token");
        String token = request.getParameter("token");
        String uri = request.getRequestURI();
        log.info("[run]uri->{},token->{}", uri, token);
        if (token == null) {
            // false: zuul过滤该请求，不对其进行路由
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(401);
            return null;
        }
        return null;
    }
}
