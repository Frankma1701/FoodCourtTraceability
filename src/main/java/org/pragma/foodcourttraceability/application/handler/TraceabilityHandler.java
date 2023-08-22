package org.pragma.foodcourttraceability.application.handler;

import lombok.RequiredArgsConstructor;
import org.pragma.foodcourttraceability.application.dto.request.TraceabilityRequest;
import org.pragma.foodcourttraceability.application.dto.response.TraceabilityResponse;
import org.pragma.foodcourttraceability.application.exception.NoDataFoundException;
import org.pragma.foodcourttraceability.application.mapper.request.TraceabilityRequestMapper;
import org.pragma.foodcourttraceability.application.mapper.response.TraceabilityResponseMapper;
import org.pragma.foodcourttraceability.domain.api.ITraceabilityServicePort;
import org.pragma.foodcourttraceability.domain.model.Traceability;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TraceabilityHandler implements ITraceabilityHandler{

    private final ITraceabilityServicePort iTraceabilityServicePort;
    private final TraceabilityRequestMapper traceabilityRequestMapper;
    private final TraceabilityResponseMapper traceabilityResponseMapper;

    @Override
    public Traceability saveTraceability (TraceabilityRequest traceabilityRequest){
        return iTraceabilityServicePort.saveTraceability(traceabilityRequestMapper.toTraceability(traceabilityRequest));
    }

    @Override
    public List<TraceabilityResponse> getAllTraceabilityByCustomerId (Long customerId){
        List<Traceability> traceabilityList =  iTraceabilityServicePort.getAllTraceabilityByCustomerId(customerId);
        if(!traceabilityList.isEmpty()) {
            return traceabilityResponseMapper.toResponseList(traceabilityList);
        }else{
            throw new NoDataFoundException();
        }
    }

    @Override
    public List<TraceabilityResponse> getAllTraceability (){
        List<Traceability> traceabilityList = iTraceabilityServicePort.getAllTraceability();
        if(!traceabilityList.isEmpty()) {
            return traceabilityResponseMapper.toResponseList(traceabilityList);
        }else{
            throw new NoDataFoundException();
        }
    }
}
