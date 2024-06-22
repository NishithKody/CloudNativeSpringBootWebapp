package AdvCloud.webapp.dto;

public class ApplicationDTO {
    private String title;
    private String company;
    private String location;
    private String description;

    public void SetTitle(String title){
        this.title = title;
    }

    public void SetCompany(String company){
        this.company = company;
    }

    public void SetLocation(String location){
        this.location = location;
    }

    public void SetDescription(String description){
        this.description = description;
    }

    public String GetTitle(){
        return title;
    }

    public String GetCompany(){
        return company;
    }

    public String GetLocation(){
        return location;
    }

    public String GetDescription(){
        return description;
    }
}
