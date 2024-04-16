package com.das.multipart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan (basePackages="com.das.multipart.controller, com.das.multipart.service, com.das.multipart.error")
public class FileUploadDownloadApplication {

	//private int maxUploadSizeInMb = 10 * 1024 * 1024; // 10 MB

	public static void main(String[] args) {
		SpringApplication.run(FileUploadDownloadApplication.class, args);
	}

	/*@Bean
	public TomcatEmbeddedServletContainerFactory tomcatEmbedded() {

		TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();

		tomcat.addConnectorCustomizers((TomcatConnectorCustomizer) connector -> {
			if ((connector.getProtocolHandler() instanceof AbstractHttp11Protocol<?>)) {
				//-1 means unlimited
				((AbstractHttp11Protocol<?>) connector.getProtocolHandler()).setMaxSwallowSize(-1);
			}
		});

		return tomcat;

	}*/
}
