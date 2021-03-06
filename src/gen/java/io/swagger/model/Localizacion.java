/*
 * Alerta API
 * Esta API provee diferentes servicios para guardar información sobre las distintas alertas y la localización del dispositivo.
 *
 * OpenAPI spec version: 1.0
 * Contact: asistex@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;


import java.util.Objects;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



import javax.validation.constraints.*;




/**
 * Localizacion
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-11T18:01:47.620Z[GMT]")
public class Localizacion   {
  
    
      
  
  @JsonProperty("latitud")
  
  
  
  
  private Float latitud = null;
  

  
    
      
  
  @JsonProperty("longitud")
  
  
  
  
  private Float longitud = null;
  

  
  
  
  public Localizacion latitud(Float latitud) {
    this.latitud = latitud;
    return this;
  }
  
  

  
  /**
  
  
   * Get latitud
  
  
  
   * @return latitud
   **/
 
  
  @JsonProperty("latitud")
  
  @ApiModelProperty(example = "38.5146304", value = "")

  public Float getLatitud() {
    return latitud;
  }
  

  public void setLatitud(Float latitud) {
    this.latitud = latitud;
  }
  

  
  
  public Localizacion longitud(Float longitud) {
    this.longitud = longitud;
    return this;
  }
  
  

  
  /**
  
  
   * Get longitud
  
  
  
   * @return longitud
   **/
 
  
  @JsonProperty("longitud")
  
  @ApiModelProperty(value = "")

  public Float getLongitud() {
    return longitud;
  }
  

  public void setLongitud(Float longitud) {
    this.longitud = longitud;
  }
  

  


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Localizacion localizacion = (Localizacion) o;
    return Objects.equals(this.latitud, localizacion.latitud) &&
        Objects.equals(this.longitud, localizacion.longitud);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitud, longitud);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Localizacion {\n");
    
    sb.append("    latitud: ").append(toIndentedString(latitud)).append("\n");
    sb.append("    longitud: ").append(toIndentedString(longitud)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}



