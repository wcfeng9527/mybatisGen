package org.mybatis.generator.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import junit.framework.TestCase;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MybatisGeneratorTest extends TestCase {
	private static final Logger logger = Logger.getLogger("MybatisGeneratorTest");
	
	@Test
	public static void testGenerate() {
		logger.log(Level.INFO, "Starting generate the mybatis src/res files... ...");
		
		List<String> warnings = new ArrayList<>();
		boolean overwrite = true;
		
		String genCfg = "/generatorConfig.xml";
		
		File configFile = new File(MybatisGeneratorTest.class.getResource(genCfg).getFile());
		
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = null;
		
		try {
			config = cp.parseConfiguration(configFile);
		} catch(IOException e) {
			e.printStackTrace();
		} catch (XMLParserException e) {
			e.printStackTrace();
		}
		
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = null;
		
		try {
			myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		} catch(InvalidConfigurationException e) {
			e.printStackTrace();
		}
		
		try {
			myBatisGenerator.generate(null);
			
			logger.log(Level.INFO, "Congratulations! Mybatis src/res files has been Generated.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
