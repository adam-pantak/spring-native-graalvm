package com.pantak.lab;

import com.pantak.lab.model.Request;
import com.pantak.lab.model.Response;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.nativex.hint.NativeHint;
import org.springframework.nativex.hint.SerializationHint;

@NativeHint
@SerializationHint(types = {Request.class, Response.class})
@SpringBootApplication
public class SpringNativeAwsLambdaApplication {

  public static void main(final String[] args) {
    SpringApplication.run(SpringNativeAwsLambdaApplication.class, args);
  }
}
