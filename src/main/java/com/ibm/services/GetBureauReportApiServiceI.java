package com.ibm.services;

import com.ibm.model.ConsultaResumenRequest;
import java.util.List;
import com.ibm.model.ConsultaResumenResponseInner;

/**
 * Service interface for handling operations related to GetBureauReportApiService.
 */
public interface GetBureauReportApiServiceI {

	/**
     * This method includes details about the apiBizV1CsmtCustomerBureauReportPostPost.
     * @param consultaResumenRequest.
     * @param xB3TraceId.
     * @param xB3SpanId.
     * @param xB3ParentSpanId.
     * @param xB3Sampled.
     * @return The response containing details of the apiBizV1CsmtCustomerBureauReportPostPost.
     */
    List<ConsultaResumenResponseInner> apiBizV1CsmtCustomerBureauReportPostPost(ConsultaResumenRequest consultaResumenRequest,String xB3TraceId,String xB3SpanId,String xB3ParentSpanId,String xB3Sampled);


}
