package model;

import jakarta.persistence.*;

@Entity
@Table(name = "service_request")
public class ServiceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;

    private String citizenName;
    private String requestType;
    private String description;
    private String status;

    public ServiceRequest() {
    }

    public ServiceRequest(Long requestId,
                          String citizenName,
                          String requestType,
                          String description,
                          String status) {

        this.requestId = requestId;
        this.citizenName = citizenName;
        this.requestType = requestType;
        this.description = description;
        this.status = status;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public String getCitizenName() {
        return citizenName;
    }

    public void setCitizenName(String citizenName) {
        this.citizenName = citizenName;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
