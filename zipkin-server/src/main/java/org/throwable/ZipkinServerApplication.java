package org.throwable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/12/18 21:57
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerApplication {

	public static void main(String[] args){
		SpringApplication.run(ZipkinServerApplication.class, args);
	}
}
