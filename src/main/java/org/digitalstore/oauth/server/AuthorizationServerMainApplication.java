package org.digitalstore.oauth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication(scanBasePackages = { "org.digitalstore" })
@EntityScan(basePackages = { "org.digitalstore" })
@ComponentScan({ "org.digitalstore" })
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@PropertySources({ @PropertySource("classpath:application.properties") })
@EnableZuulProxy
@EnableDiscoveryClient
public class AuthorizationServerMainApplication extends SpringBootServletInitializer
{

	public static void main(String[] args) throws Exception
	{
		SpringApplication app = new SpringApplicationBuilder(AuthorizationServerMainApplication.class).sources(AuthorizationServerMainApplication.class).build();
		app.setWebApplicationType(WebApplicationType.SERVLET);
		app.run(args);
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
		return application.sources(AuthorizationServerMainApplication.class);
	}
}