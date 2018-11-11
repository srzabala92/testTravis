package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.LocalizacionApiService;
import io.swagger.api.factories.LocalizacionApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Alerta;


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


@Path("/localizacion")


@io.swagger.annotations.Api(description = "the localizacion API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-11T18:01:47.620Z[GMT]")

public class LocalizacionApi  {
   private final LocalizacionApiService delegate;

   public LocalizacionApi(@Context ServletConfig servletContext) {
      LocalizacionApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("LocalizacionApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (LocalizacionApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = LocalizacionApiServiceFactory.getLocalizacionApi();
      }

      this.delegate = delegate;
   }


    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Localización de una persona", notes = "Registra la localización de una persona", response = Void.class, tags={ "Localización", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    public Response addLocalizacion(@ApiParam(value = "Registra la alerta de localizacion de una persona en el servidor.") @QueryParam("Localizacion") Alerta localizacion
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addLocalizacion(localizacion,securityContext);
    }

}

