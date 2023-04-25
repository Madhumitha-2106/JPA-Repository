package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="IPL")
public class Iplmodel {
    @Id
	private int Pid;
	private String Pname;
	private String Pcountry;
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getPcountry() {
		return Pcountry;
	}
	public void setPcountry(String pcountry) {
		Pcountry = pcountry;
	}
}
