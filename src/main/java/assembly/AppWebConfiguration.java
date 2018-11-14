/*
package assembly;

import com.aishang.asjf.assembly.config.mvc.interceptor.RateLimitingInterceptor;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

*/
/**
 * Created by neeke on 17-9-4.
 * SpringMVC配置类
 *//*

@Configuration
@EnableWebMvc
@ComponentScan(value = {"com.aishang.asjf.web", "com.aishang.asjf.swagger"})
@EnableCaching
@EnableScheduling
public class AppWebConfiguration extends WebMvcConfigurerAdapter {

//    @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }

    //
//    @Override
//    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
//        super.extendMessageConverters(converters);
//    }
//

    */
/**
     * Spring方法参数校验
     *
     * @return
     *//*

    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }


    @Bean
    ViewResolver viewResolver(){
        InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver();
        internalResourceViewResolver.setViewClass(JstlView.class);
        internalResourceViewResolver.setPrefix("/dynpage/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }

    */
/**
     * 允许跨域访问
     *
     * @param registry
     *//*

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*");
    }

    */
/**
     * 允许直接访问的资源
     *
     * @param registry
     *//*

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
        registry.addResourceHandler("/H5/**")
                .addResourceLocations("/H5/");
    }

    //    @Bean
//    public MessageSource messageSource() {
//        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
//        messageSource.setBasename("classpath*:org/springframework/security/messages_zh_CN");
//        messageSource.setDefaultEncoding("UTF-8");
//        return messageSource;
//    }
//
//    @Bean
//    public LocaleResolver localeResolver(){
//        AcceptHeaderLocaleResolver resolver = new AcceptHeaderLocaleResolver();
//        resolver.setDefaultLocale(Locale.CHINESE);
//        return resolver;
//    }
//
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(rateLimitingInterceptor());
    }

    @Bean
    public RateLimitingInterceptor rateLimitingInterceptor() {
        return new RateLimitingInterceptor();
    }
}
*/
