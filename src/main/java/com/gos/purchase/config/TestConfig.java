package com.gos.purchase.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Test settings.
 * Annotation with name 'test' in profile
 * for spring to identify and implement in the test runtime.
 */
@Configuration
@Profile("test")
public class TestConfig {
  
}
