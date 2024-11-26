package com.ibm.services;

import com.ibm.model.ConsultaScoreRequest;
import com.ibm.model.ConsultaScoreResponse;

/**
 * Service interface for handling operations related to GetBureauScoreApiService.
 */
public interface GetBureauScoreApiServiceI {

	/**
     * This method includes details about the apiBizV1CsmtCustomerBureauScorePostPost.
     * @param consultaScoreRequest.
     * @param xB3TraceId.
     * @param xB3SpanId.
     * @param xB3ParentSpanId.
     * @param xB3Sampled.
     * @return The response containing details of the apiBizV1CsmtCustomerBureauScorePostPost.
     */
    ConsultaScoreResponse apiBizV1CsmtCustomerBureauScorePostPost(ConsultaScoreRequest consultaScoreRequest,String xB3TraceId,String xB3SpanId,String xB3ParentSpanId,String xB3Sampled);


}
