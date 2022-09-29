package com.springtest.apidemo.api.resource;

import com.springtest.apidemo.api.to.AgenteTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/file-upload")
public class FileUploadController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AgenteTO create(@RequestBody(required = true) AgenteTO agenteTO) {

        log.info("Salvando dados do XML {}", agenteTO);


        return agenteTO;
    }


}
