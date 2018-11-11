package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AlertaApiService;
import io.swagger.api.factories.AlertaApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Alerta;
import io.swagger.model.AlertaBateria;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

import javax.validation.constraints.*;


@Path("/alerta")


@io.swagger.annotations.Api(description = "the alerta API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-11T18:01:47.620Z[GMT]")

public class AlertaApi  {
   private final AlertaApiService delegate;

   public AlertaApi(@Context ServletConfig servletContext) {
      AlertaApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AlertaApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AlertaApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = AlertaApiServiceFactory.getAlertaApi();
      }

      this.delegate = delegate;
   }


    @POST
    @Path("/bateria")
    
    
    @io.swagger.annotations.ApiOperation(value = "Alerta del nivel bajo de bateria del dispositivo.", notes = "Registra alerta sobre el nivel bajo de bateria del dispositivo.", response = Void.class, tags={ "Alertas", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    public Response addAlertaBateria(@ApiParam(value = "Registra la alerta sobre el nivel bajo de bateria del dispositivo.") @QueryParam("Alerta Batería") AlertaBateria alertaBatería
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addAlertaBateria(alertaBatería,securityContext);
    }

    @POST
    @Path("/caida")
    
    
    @io.swagger.annotations.ApiOperation(value = "Alerta de tipo caida", notes = "Guarda alerta de tipo caida en el servidor.", response = Void.class, tags={ "Alertas", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    public Response addAlertaCaida(@ApiParam(value = "Registra la alerta de una caída en el servidor.") @QueryParam("Alerta Caida") Alerta alertaCaida
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addAlertaCaida(alertaCaida,securityContext);
    }

    @POST
    @Path("/localizacion")
    
    
    @io.swagger.annotations.ApiOperation(value = "Alerta de tipo localizacion no permitida", notes = "Guarda alerta de tipo localizacion no permitida en el servidor.", response = Void.class, tags={ "Alertas", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    public Response addAlertaLocalizacion(@ApiParam(value = "Registra la alerta de localizacion no permitida en el servidor.") @QueryParam("Alerta Localizacion") Alerta alertaLocalizacion
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addAlertaLocalizacion(alertaLocalizacion,securityContext);
    }

}

