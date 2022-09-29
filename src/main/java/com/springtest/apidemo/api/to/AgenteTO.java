package com.springtest.apidemo.api.to;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder(toBuilder = true)
@ToString
public class AgenteTO implements Serializable {

    private String codigo;

    private String data;

    private RegiaoTO regiao;

}
