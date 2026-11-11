package service;

import java.util.List;

import model.ServiceRequest;
import repository.ServiceRequestRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceRequestService {

    @Autowired
    private ServiceRequestRepository repository;

    public ServiceRequest addRequest(ServiceRequest request) {
        return repository.save(request);
    }

    public List<ServiceRequest> getAllRequests() {
        return repository.findAll();
    }
}
