package com.yxgy.weixin.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

//    @Autowired
//    private LoginTicketInterceptor loginTicketInterceptor;

    @Value("${resourcePath}")
    private String resourcePath;

    /*@Autowired
    private LoginRequiredInterceptor loginRequiredInterceptor;*/



//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        //所有请求都要拦截，拦截器的顺序和注册顺序有关，所以检查登陆的拦截器不会hostholder还没设置就触发
//        registry.addInterceptor(loginTicketInterceptor)
//                .excludePathPatterns("/login")
//                .excludePathPatterns("/**/*.css", "/**/*.js", "/**/*.png", "/**/*.jpg", "/**/*.jpeg");
//
////        registry.addInterceptor(loginRequiredInterceptor)
////                .excludePathPatterns("/**/*.css", "/**/*.js", "/**/*.png", "/**/*.jpg", "/**/*.jpeg");
//
//    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/META-INF/resources/")
                .addResourceLocations("file:" + resourcePath);	//配置静态资源访问
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
                .maxAge(3600)
                .allowCredentials(true);
    }

}
