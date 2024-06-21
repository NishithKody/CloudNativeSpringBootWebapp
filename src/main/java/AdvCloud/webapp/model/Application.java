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

    public Long GetId(){
        return this.id;
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

    public LocalDate GetSubmitDate(){
        return submiDate;
    }

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

    public void SetSubmiDate(LocalDate submiDate){
        this.submiDate = submiDate;
    }

}
