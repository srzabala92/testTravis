package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Alerta;
import io.swagger.model.AlertaBateria;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-11T18:01:47.620Z[GMT]")

public abstract class AlertaApiService {
    
    public abstract Response addAlertaBateria( AlertaBateria alertaBatería,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response addAlertaCaida( Alerta alertaCaida,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response addAlertaLocalizacion( Alerta alertaLocalizacion,SecurityContext securityContext) throws NotFoundException;
    
}

