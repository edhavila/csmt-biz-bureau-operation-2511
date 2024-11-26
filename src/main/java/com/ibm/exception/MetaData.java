package com.ibm.exception;

import java.util.HashMap;
import java.util.Map;

import com.ibm.model.*;
public class MetaData {

	public static final Map<String,Map<ErrorStatusCode, ApiExceptionResponse>> apiExceptions;

        private static String BAD_REQUEST= "Bad Request";
        private static String UNAUTHORIZED= "Unauthorized";
        private static String FORBIDDEN= "Forbidden";
        private static String UNPROCESSABLE_CONTENT= "Unprocessable content";
        private static String INTERNAL_SERVER_ERROR= "Internal Server Error";

	private MetaData() {
        throw new AssertionError();
    }
	
	static {		
		apiExceptions = new HashMap<String,Map<ErrorStatusCode, ApiExceptionResponse>>();

		Map<ErrorStatusCode, ApiExceptionResponse> responses; 
		try {
		
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,ErrorResponse.class, BAD_REQUEST ));
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,ErrorResponse.class, UNAUTHORIZED ));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,ErrorResponse.class, FORBIDDEN ));
		 responses.put(ErrorStatusCode.getStatusCode(422),ApiExceptionResponse.getInstance(422,ErrorResponse.class, UNPROCESSABLE_CONTENT ));
		 responses.put(ErrorStatusCode.getStatusCode(500),ApiExceptionResponse.getInstance(500,ErrorResponse.class, INTERNAL_SERVER_ERROR ));
		 
		 apiExceptions.put("apiBizV1CsmtCustomerBureauScorePostPost",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,ErrorResponse.class, BAD_REQUEST ));
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,ErrorResponse.class, UNAUTHORIZED ));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,ErrorResponse.class, FORBIDDEN ));
		 responses.put(ErrorStatusCode.getStatusCode(422),ApiExceptionResponse.getInstance(422,ErrorResponse.class, UNPROCESSABLE_CONTENT ));
		 responses.put(ErrorStatusCode.getStatusCode(500),ApiExceptionResponse.getInstance(500,ErrorResponse.class, INTERNAL_SERVER_ERROR ));
		 
		 apiExceptions.put("apiBizV1CsmtCustomerBureauDetailPostPost",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,ErrorResponse.class, BAD_REQUEST ));
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,ErrorResponse.class, UNAUTHORIZED ));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,ErrorResponse.class, FORBIDDEN ));
		 responses.put(ErrorStatusCode.getStatusCode(422),ApiExceptionResponse.getInstance(422,ErrorResponse.class, UNPROCESSABLE_CONTENT ));
		 responses.put(ErrorStatusCode.getStatusCode(500),ApiExceptionResponse.getInstance(500,ErrorResponse.class, INTERNAL_SERVER_ERROR ));
		 
		 apiExceptions.put("apiBizV1CsmtCustomerBureauReportPostPost",responses);
		 
		
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}
