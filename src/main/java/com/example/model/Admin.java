package com.example.model;
import jakarta.persistence.*;

@Entity
@Table(name="admin_details")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private String ptitle;
    private String pprice;
    private String plocation;
    private String pdetails;

	public Admin() {
		super();
	}


	public Admin(int id, String ptitle, String pprice, String plocation, String pdetails) {
		this.id=id;
		this.ptitle = ptitle;
		this.pprice = pprice;
		this.plocation = plocation;
		this.pdetails = pdetails;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPtitle() {
		return ptitle;
	}


	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}


	public String getPprice() {
		return pprice;
	}


	public void setPprice(String pprice) {
		this.pprice = pprice;
	}


	public String getPlocation() {
		return plocation;
	}


	public void setPlocation(String plocation) {
		this.plocation = plocation;
	}


	public String getPdetails() {
		return pdetails;
	}


	public void setPdetails(String pdetails) {
		this.pdetails = pdetails;
	}
	
    
}
