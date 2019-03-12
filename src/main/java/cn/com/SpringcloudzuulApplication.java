package cn.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
//启动zuul代理功能
@EnableZuulProxy
public class SpringcloudzuulApplication {

	
	//http://localhost/wmcuser/user/userinfo      会自动的切换2个user中的userinfo方法；
	public static void main(String[] args) {
		SpringApplication.run(SpringcloudzuulApplication.class, args);
	}

}
