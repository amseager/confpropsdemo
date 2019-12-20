package com.example.confpropsdemo.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@Data
@ConfigurationProperties(prefix = "props")
public class ConfigProperties {

	private String testString;
	private Map<String, InnerConfigProperties> testMap;
}
