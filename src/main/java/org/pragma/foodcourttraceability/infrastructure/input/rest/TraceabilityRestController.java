package org.pragma.foodcourttraceability.infrastructure.input.rest;
import lombok.RequiredArgsConstructor;
import org.pragma.foodcourttraceability.application.dto.request.TraceabilityRequest;
import org.pragma.foodcourttraceability.application.handler.TraceabilityHandler;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/traceability")
@RequiredArgsConstructor
public class TraceabilityRestController{

    private final TraceabilityHandler traceabilityHandler;

    @PostMapping("/")
    public ResponseEntity<Void> saveTraceability(@RequestBody TraceabilityRequest traceabilityRequest){
        traceabilityHandler.saveTraceability(traceabilityRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
