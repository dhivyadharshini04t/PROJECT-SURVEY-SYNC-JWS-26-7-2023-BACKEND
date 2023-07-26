package com.example.demo.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "Responsmodel")
public class UserModel {
   

    @Id
    private Long questionid;
    private String selectedoption;
    @ManyToOne
    @JoinColumn(name = "questionid", insertable = false, updatable = false)
    private RadioModel radioModel;
    
	public Long getquestionid() {
		return questionid;
	}
	public void setquestionid(Long questionid) {
		this.questionid = questionid;
	}


	public String getselectedoption() {
		return selectedoption;
	}


	public void setselectedoption(String selectedoption) {
		this.selectedoption = selectedoption;
	}
	 
    public UserModel(Long questionid, String selectedoption) {
		super();
		this.questionid = questionid;
		this.selectedoption = selectedoption;
	}
	public UserModel()
	{
		
	}

}
