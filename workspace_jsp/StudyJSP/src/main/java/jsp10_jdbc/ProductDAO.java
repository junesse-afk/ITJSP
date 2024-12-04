package jsp10_jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

	public ProductDTO select(int product_id) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		con = JdbcUtil.getConnection();
		
		ProductDTO prod = null;
		
		try {
			String sql = "SELECT * FROM PRODUCT WHERE PRODUCT_ID = ?";
		 	pstmt = con.prepareStatement(sql);
		 	pstmt.setInt(1, product_id);
		 	rs = pstmt.executeQuery();
		 	
		 	if(rs.next()) {
		 		prod = new ProductDTO();
				prod.setProduct_id(rs.getInt("product_id"));
				prod.setProduct_name(rs.getString("product_name"));
				prod.setProduct_price(rs.getInt("product_price"));
				prod.setProduct_qty(rs.getInt("product_qty"));
				prod.setProduct_img(rs.getString("product_img"));
		 	}
		 	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
		
		return prod;
	}
	
	public List<ProductDTO> selectList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		con = JdbcUtil.getConnection();
		
		List<ProductDTO> prodList = new ArrayList<ProductDTO>();
		
		try {
			
			String sql = "SELECT * FROM PRODUCT";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				ProductDTO prod = new ProductDTO();
				prod.setProduct_id(rs.getInt("product_id"));
				prod.setProduct_name(rs.getString("product_name"));
				prod.setProduct_price(rs.getInt("product_price"));
				prod.setProduct_qty(rs.getInt("product_qty"));
				prod.setProduct_img(rs.getString("product_img"));
				
				prodList.add(prod);
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
		} finally {
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
		
		return prodList;
	}
	
	public int insert(ProductDTO prod) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int insertCnt = 0;
		
		con = JdbcUtil.getConnection();
		
		try {
			String sql = "INSERT INTO PRODUCT VALUE (?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, prod.getProduct_id());
			pstmt.setString(2, prod.getProduct_name());
			pstmt.setInt(3, prod.getProduct_price());
			pstmt.setInt(4, prod.getProduct_qty());
			pstmt.setString(5, prod.getProduct_img());
			
			System.out.println(pstmt);
			
			insertCnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
		}
		
		return insertCnt;
		
	}
	
	public int delete(int product_id) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		int deleteCnt = 0;
		
		con = JdbcUtil.getConnection();
		
		try {
			String sql = "DELETE FROM PRODUCT WHERE PRODUCT_ID = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, product_id);
			System.out.println(pstmt);
			
			deleteCnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
		}
		
		return deleteCnt;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
