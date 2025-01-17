/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.ibm.api;

import com.ibm.model.ConsultaScoreRequest;
import com.ibm.model.ConsultaScoreResponse;
import com.ibm.model.ErrorResponse;
import io.swagger.annotations.*;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
@Validated
@Api(value = "GetBureauScore", description = "the GetBureauScore API")
public interface GetBureauScoreApi {
    
/**
 * Realiza una consulta de score buró de crédito
 * @param consultaScoreRequest.
 * @param xB3TraceId.
 * @param xB3SpanId.
 * @param xB3ParentSpanId.
 * @param xB3Sampled.
 * @return A ResponseEntity containing the ConsultaScoreResponse object.
 */

  @ApiOperation(value = "Realiza una consulta de score buró de crédito", nickname = "apiBizV1CsmtCustomerBureauScorePostPost", notes = "Endpoint para realizar consultas de buró de crédito usando estructuras de datos complejas.", response = ConsultaScoreResponse.class , tags = { "get-bureau-score" }  )
    @ApiResponses({ @ApiResponse(code = 200, message = "Éxito en la consulta del buró de crédito", response = ConsultaScoreResponse.class),@ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),@ApiResponse(code = 401, message = "Unauthorized", response = ErrorResponse.class),@ApiResponse(code = 403, message = "Forbidden", response = ErrorResponse.class),@ApiResponse(code = 422, message = "Unprocessable content", response = ErrorResponse.class),@ApiResponse(code = 500, message = "Internal Server Error", response = ErrorResponse.class) })
     @RequestMapping(method = RequestMethod.POST,
            value = "/api/biz/v1/csmt/customer/bureau/score/post",
            produces = { "application/json" },
            consumes = { "application/json" })
    ResponseEntity<ConsultaScoreResponse> apiBizV1CsmtCustomerBureauScorePostPost(@Parameter(name = "ConsultaScoreRequest", description = "", required = true) @Valid @RequestBody ConsultaScoreRequest consultaScoreRequest,@Parameter(name = "X-B3-TraceId", description = "Identificador único de la traza para correlacionar eventos y logs a lo largo de la traza de una transacción.", in = ParameterIn.HEADER) @RequestHeader(value = "X-B3-TraceId", required = false) String xB3TraceId,@Parameter(name = "X-B3-SpanId", description = "Identificador único para el trabajo que realiza la llamada en el servicio actual.", in = ParameterIn.HEADER) @RequestHeader(value = "X-B3-SpanId", required = false) String xB3SpanId,@Parameter(name = "X-B3-ParentSpanId", description = "ID del Span del llamador, que es el Span ID del servicio o componente que inició la llamada.", in = ParameterIn.HEADER) @RequestHeader(value = "X-B3-ParentSpanId", required = false) String xB3ParentSpanId,@Parameter(name = "X-B3-Sampled", description = "Indica si la traza actual debe ser registrada o no. (1 = sí, 0 = no)", in = ParameterIn.HEADER) @RequestHeader(value = "X-B3-Sampled", required = false) String xB3Sampled);
      
}
