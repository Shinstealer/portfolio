package controller;

import java.util.Date;

public class PortfolioDTO {
	private int rno;
	private String gname;
	private String email;
	private String message;
	private Date regdate;

	public PortfolioDTO() {
		super();
	}

	public PortfolioDTO(int rno, String gname, String email, String message, Date regdate) {
		super();
		this.rno = rno;
		this.gname = gname;
		this.email = email;
		this.message = message;
		this.regdate = regdate;
	}

	public PortfolioDTO(String gname, String email, String message) {
		super();
		this.gname = gname;
		this.email = email;
		this.message = message;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

}
