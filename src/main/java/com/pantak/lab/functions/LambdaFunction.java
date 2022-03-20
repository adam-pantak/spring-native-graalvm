package com.pantak.lab.functions;

import com.pantak.lab.model.Request;
import com.pantak.lab.model.Response;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Function;

@Slf4j
public class LambdaFunction implements Function<Request, Response> {

  @Override
  public Response apply(final Request request) {
    log.info("Converting request into a response...");

    final Response response = Response.builder().name(request.getName()).saved(true).build();

    log.info("Converted request into a response.");
    return response;
  }
}
