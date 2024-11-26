package com.ibm.services;

import com.ibm.model.ConsultaDetalleRequest;
import com.ibm.model.ConsultaDetalleResponse;

/**
 * Service interface for handling operations related to GetBureauDetailApiService.
 */
public interface GetBureauDetailApiServiceI {

	/**
     * This method includes details about the apiBizV1CsmtCustomerBureauDetailPostPost.
     * @param consultaDetalleRequest.
     * @param xB3TraceId.
     * @param xB3SpanId.
     * @param xB3ParentSpanId.
     * @param xB3Sampled.
     * @return The response containing details of the apiBizV1CsmtCustomerBureauDetailPostPost.
     */
    ConsultaDetalleResponse apiBizV1CsmtCustomerBureauDetailPostPost(ConsultaDetalleRequest consultaDetalleRequest,String xB3TraceId,String xB3SpanId,String xB3ParentSpanId,String xB3Sampled);


}
