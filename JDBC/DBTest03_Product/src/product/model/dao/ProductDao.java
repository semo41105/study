package product.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import product.model.dto.Product;

public class ProductDao {

	public List<Product> selectAll(Connection con) {
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<Product> list = new ArrayList<Product>();
		String sql = " SELECT * FROM PRODUCT ";	
		
		try {
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				Product p = new Product();
				p.setpId(rs.getString(1));
				p.setpName(rs.getString(2));
				p.setPrice(rs.getInt(3));
				p.setDes(rs.getString(4));
				
				list.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstm);
		}
		return list;
	}

	public Product selectOne(Connection con, String id) {
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Product res = null;
		
		String sql = " SELECT * FROM PRODUCT WHERE P_ID=? ";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, id);
			
			rs = pstm.executeQuery();
			
			System.out.println("dao P_ID: "+ id);
			
			if(rs.next()) {
				res = new Product();
				res.setpId(rs.getString(1));
				res.setpName(rs.getString(2));
				res.setPrice(rs.getInt(3));
				res.setDes(rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstm);
		}
		
		return res;
		
	}
	public int insert(Connection con, Product dto) {
		PreparedStatement pstm = null;
		int res = 0;
		
		String sql = " INSERT INTO PRODUCT VALUES(?,?,?,?) ";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, dto.getpId());
			pstm.setString(2, dto.getpName());
			pstm.setInt(3, dto.getPrice());
			pstm.setString(4, dto.getDes());
			
			res = pstm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstm);
		}
		
		return res;
	}
	public int update(Connection con, Product dto) {
		PreparedStatement pstm = null;
		int res = 0;
		
		String sql = " UPDATE PRODUCT SET PRICE=? WHERE P_ID=?";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, dto.getPrice());
			pstm.setString(2, dto.getpId());
		
			res = pstm.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstm);
		}
		return res;
	}
	public int delete(Connection con, String id) {
		PreparedStatement pstm = null;
		int res = 0;
		
		String sql = " DELETE FROM PRODUCT WHERE P_ID=? ";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, id);
			
			res = pstm.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstm);
		}
		
		return res;
	}
	
}
