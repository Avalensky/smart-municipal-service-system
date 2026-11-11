package controller;

import java.util.List;

import model.ServiceRequest;
import service.ServiceRequestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/requests")
public class ServiceRequestController {

    @Autowired
    private ServiceRequestService service;

    @PostMapping
    public ServiceRequest addRequest(@RequestBody ServiceRequest request) {
        return service.addRequest(request);
    }

    @GetMapping
    public List<ServiceRequest> getRequests() {
        return service.getAllRequests();
    }
}

