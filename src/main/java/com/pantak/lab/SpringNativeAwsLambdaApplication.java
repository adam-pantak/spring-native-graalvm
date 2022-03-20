package com.pantak.lab;

import com.pantak.lab.functions.LambdaFunction;
import com.pantak.lab.model.Request;
import com.pantak.lab.model.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.function.context.FunctionRegistration;
import org.springframework.cloud.function.context.FunctionalSpringApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.nativex.hint.NativeHint;
import org.springframework.nativex.hint.SerializationHint;

@SerializationHint(types = {Request.class, Response.class})
@SpringBootConfiguration
@Slf4j
public class SpringNativeAwsLambdaApplication
    implements ApplicationContextInitializer<GenericApplicationContext> {

  public static void main(final String[] args) {
    FunctionalSpringApplication.run(SpringNativeAwsLambdaApplication.class, args);
    log.info("Started.");
  }

  @Override
  public void initialize(final GenericApplicationContext context) {
    context.registerBean(
        "lambdaFunction",
        FunctionRegistration.class,
        () -> new FunctionRegistration<>(new LambdaFunction()).type(LambdaFunction.class));
  }
}
