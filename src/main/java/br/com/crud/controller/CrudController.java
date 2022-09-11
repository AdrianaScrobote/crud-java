package br.com.crud.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Validated
@RestController
@Api(value = "CrudController", description = "Crud Controller", tags = "Crud Controller")
@RequestMapping("/")
public class CrudController {

    @ApiOperation("testando")
    @GetMapping(value = "/test")
    public @ResponseBody String test() {
        return ("ok");
    }

}
