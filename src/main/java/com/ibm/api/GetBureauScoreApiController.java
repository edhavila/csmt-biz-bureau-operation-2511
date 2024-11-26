package com.ibm.api;

import com.ibm.model.ConsultaScoreRequest;
import com.ibm.model.ConsultaScoreResponse;
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
import com.ibm.services.GetBureauScoreApiServiceI;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class GetBureauScoreApiController implements GetBureauScoreApi {

	@Autowired
	GetBureauScoreApiServiceI getBureauScoreApiServiceI;


private static final Logger logger = LoggerFactory.getLogger(GetBureauScoreApiController.class);

/**
 * This controller method handles a GET request to apiBizV1CsmtCustomerBureauScorePostPost.
 * Realiza una consulta de score buró de crédito based on following parameters
 * @param consultaScoreRequest.
 * @param xB3TraceId.
 * @param xB3SpanId.
 * @param xB3ParentSpanId.
 * @param xB3Sampled.
 * @return A ResponseEntity containing the ConsultaScoreResponse and HTTP status.
 */
public ResponseEntity<ConsultaScoreResponse> apiBizV1CsmtCustomerBureauScorePostPost(@Parameter(name = "ConsultaScoreRequest", description = "", required = true) @Valid @RequestBody ConsultaScoreRequest consultaScoreRequest,@Parameter(name = "X-B3-TraceId", description = "Identificador único de la traza para correlacionar eventos y logs a lo largo de la traza de una transacción.", in = ParameterIn.HEADER) @RequestHeader(value = "X-B3-TraceId", required = false) String xB3TraceId,@Parameter(name = "X-B3-SpanId", description = "Identificador único para el trabajo que realiza la llamada en el servicio actual.", in = ParameterIn.HEADER) @RequestHeader(value = "X-B3-SpanId", required = false) String xB3SpanId,@Parameter(name = "X-B3-ParentSpanId", description = "ID del Span del llamador, que es el Span ID del servicio o componente que inició la llamada.", in = ParameterIn.HEADER) @RequestHeader(value = "X-B3-ParentSpanId", required = false) String xB3ParentSpanId,@Parameter(name = "X-B3-Sampled", description = "Indica si la traza actual debe ser registrada o no. (1 = sí, 0 = no)", in = ParameterIn.HEADER) @RequestHeader(value = "X-B3-Sampled", required = false) String xB3Sampled){
        logger.debug("Entering method apiBizV1CsmtCustomerBureauScorePostPost with param: ",consultaScoreRequest,xB3TraceId,xB3SpanId,xB3ParentSpanId,xB3Sampled);
        ConsultaScoreResponse res  = getBureauScoreApiServiceI.apiBizV1CsmtCustomerBureauScorePostPost(consultaScoreRequest,xB3TraceId,xB3SpanId,xB3ParentSpanId,xB3Sampled);
        logger.debug("Exiting method apiBizV1CsmtCustomerBureauScorePostPost with response: ", res);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    

}
