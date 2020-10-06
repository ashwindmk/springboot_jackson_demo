package com.ashwin.java.domain.model;

import com.fasterxml.jackson.annotation.*;

// Default order: name, email, response, student_id
// Expected order: response, student_id, and then the rest...
@JsonPropertyOrder({"response", "student_id"})
@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
public class Student {
    @JsonProperty(value = "student_id")
    private Long id;

    private String name;

    private String email;

    /**
     * Major.value using spring.jackson property
     */
    private Major major;

    /**
     * Minor.value using JsonCreator
     */
    private Minor minor;

    /**
     * Request field is only to be accepted from request.
     * This field should not be returned in response.
     * Only deserialize
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String request;

    /**
     * Response is only to be sent in response.
     * This field should not be accepted in request.
     * Only serialize
     *
     * This is a JSON string value
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JsonRawValue
    private String response;

    private String custom;

    /**
     * This extra field should neither be accepted in request nor sent in response.
     */
    @JsonIgnore
    private String extra;

    private Vehicle vehicle;

    private boolean isMarried;

    public Student() {
    }

    public Student(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public Minor getMinor() {
        return minor;
    }

    public void setMinor(Minor minor) {
        this.minor = minor;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @JsonGetter("married")
    public boolean isMarried() {
        return isMarried;
    }

    @JsonSetter("married")
    public void setMarried(boolean married) {
        isMarried = married;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", major=" + major +
                ", minor=" + minor +
                ", request='" + request + '\'' +
                ", response='" + response + '\'' +
                ", custom='" + custom + '\'' +
                ", extra='" + extra + '\'' +
                ", vehicle=" + vehicle +
                ", isMarried=" + isMarried +
                '}';
    }
}
