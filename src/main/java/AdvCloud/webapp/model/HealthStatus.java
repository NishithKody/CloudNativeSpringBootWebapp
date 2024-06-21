package AdvCloud.webapp.model;

public class HealthStatus{
    private int status;
    private String message;

    public int getStatus(){
        return status;
    }

    public String getMessage(){
        return message;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public void setMessage(String message){
        this.message = message;
    }
}