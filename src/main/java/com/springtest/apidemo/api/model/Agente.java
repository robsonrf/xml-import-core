package com.springtest.apidemo.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder(toBuilder = true)
@ToString
public class Agente implements Serializable {

    private Long id;

    // TODO não foi solicitado para salvar os valores em BD, portanto suprimi a persistência

}
