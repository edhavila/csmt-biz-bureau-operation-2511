package com.ibm.api;

import com.ibm.model.ConsultaDetalleRequest;
import com.ibm.model.ConsultaDetalleResponse;
import io.swagger.annotations.*;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import com.ibm.services.GetBureauDetailApiServiceI;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class GetBureauDetailApiController implements GetBureauDetailApi {

	@Autowired
	GetBureauDetailApiServiceI getBureauDetailApiServiceI;


private static final Logger logger = LoggerFactory.getLogger(GetBureauDetailApiController.class);

/**
 * This controller method handles a GET request to apiBizV1CsmtCustomerBureauDetailPostPost.
 * Realiza una consulta de detalle buró de crédito based on following parameters
 * @param consultaDetalleRequest.
 * @param xB3TraceId.
 * @param xB3SpanId.
 * @param xB3ParentSpanId.
 * @param xB3Sampled.
 * @return A ResponseEntity containing the ConsultaDetalleResponse and HTTP status.
 */
public ResponseEntity<ConsultaDetalleResponse> apiBizV1CsmtCustomerBureauDetailPostPost(@Parameter(name = "ConsultaDetalleRequest", description = "", required = true) @Valid @RequestBody ConsultaDetalleRequest consultaDetalleRequest,@Parameter(name = "X-B3-TraceId", description = "Identificador único de la traza para correlacionar eventos y logs a lo largo de la traza de una transacción.", in = ParameterIn.HEADER) @RequestHeader(value = "X-B3-TraceId", required = false) String xB3TraceId,@Parameter(name = "X-B3-SpanId", description = "Identificador único para el trabajo que realiza la llamada en el servicio actual.", in = ParameterIn.HEADER) @RequestHeader(value = "X-B3-SpanId", required = false) String xB3SpanId,@Parameter(name = "X-B3-ParentSpanId", description = "ID del Span del llamador, que es el Span ID del servicio o componente que inició la llamada.", in = ParameterIn.HEADER) @RequestHeader(value = "X-B3-ParentSpanId", required = false) String xB3ParentSpanId,@Parameter(name = "X-B3-Sampled", description = "Indica si la traza actual debe ser registrada o no. (1 = sí, 0 = no)", in = ParameterIn.HEADER) @RequestHeader(value = "X-B3-Sampled", required = false) String xB3Sampled){
        logger.debug("Entering method apiBizV1CsmtCustomerBureauDetailPostPost with param: ",consultaDetalleRequest,xB3TraceId,xB3SpanId,xB3ParentSpanId,xB3Sampled);
        ConsultaDetalleResponse res  = getBureauDetailApiServiceI.apiBizV1CsmtCustomerBureauDetailPostPost(consultaDetalleRequest,xB3TraceId,xB3SpanId,xB3ParentSpanId,xB3Sampled);
        logger.debug("Exiting method apiBizV1CsmtCustomerBureauDetailPostPost with response: ", res);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    

}
