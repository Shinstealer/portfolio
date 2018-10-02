package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dbconnection.DBManager;

public class PortfolioDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	ArrayList<PortfolioDTO> list = new ArrayList<>();
	int result = 0;
	
	public int conInsert(PortfolioDTO pDto) {
		try {
			conn = DBManager.getConnection();
			String sql = "INSERT INTO contactlist(rno,gname,email,message) "
					+ "VALUES(seq_rno.nextval,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,pDto.getGname());
			pstmt.setString(2,pDto.getEmail());
			pstmt.setString(3,pDto.getMessage());
			
			result = pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return result;
	}
	
}
