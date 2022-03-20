package com.pantak.lab.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response implements Serializable {

  @NotBlank
  @JsonProperty(access = Access.READ_ONLY)
  private String name;

  @NotNull
  @JsonProperty(access = Access.READ_ONLY)
  private boolean saved;
}
