package AdvCloud.webapp.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Application 
{
    @Id
    @GeneratedValue Long id;
    private String title;
    private String company;
    private String location;
    private String description;
    private LocalDate submiDate;

    public Long getId(){
        return this.id;
    }

    public String getTitle(){
        return title;
    }

    public String getCompany(){
        return company;
    }

    public String getLocation(){
        return location;
    }

    public String getDescription(){
        return description;
    }

    public LocalDate getSubmitDate(){
        return submiDate;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setSubmiDate(LocalDate submiDate){
        this.submiDate = submiDate;
    }

}
