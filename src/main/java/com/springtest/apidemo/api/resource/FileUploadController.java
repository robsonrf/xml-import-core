package com.springtest.apidemo.api.resource;

import com.springtest.apidemo.api.to.AgenteTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Api(tags = "FileUpload")
@Slf4j
@RestController
@RequestMapping("/api/file-upload")
public class FileUploadController {

    @ApiOperation(value = "Salva os dados dos Agentes informados")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Integer create(@RequestBody(required = true) List<AgenteTO> agentes) {

        log.info("Importação de XML de Agentes {}", agentes);

        List<String> codigos = agentes.stream()
                .map(agenteTO -> agenteTO.getCodigo())
                .collect(Collectors.toList());

        log.info( "Recebendo dados do XML. Códigos dos Agentes {}", codigos );

        return agentes.size(); // retornando apenas o size da listagem
    }

}
