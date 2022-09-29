package com.springtest.apidemo.api.to;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder(toBuilder = true)
@ToString
public class RegiaoTO implements Serializable {

    private String sigla;
    private List<String> compra;
    private List<String> geracao;
    private List<String> precoMedio;

}
