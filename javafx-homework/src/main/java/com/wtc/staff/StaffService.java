package com.wtc.staff;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StaffService {

    public String addStaff(Staff staff) {
        String sql = "INSERT INTO Staff (id, lastName, firstName, mi, address, city, state, telephone, email) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseUtil.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            setStaffParameters(pstmt, staff);
            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                return staff.getId();
            }
            return null;
        } catch (SQLException e) {
            handleSQLException(e, "添加员工失败");
            return null;
        }
    }

    public boolean modifyStaff(Staff staff) {
        String sql = "UPDATE Staff SET lastName=?, firstName=?, mi=?, address=?, "
                + "city=?, state=?, telephone=?, email=? WHERE id=?";

        try (Connection conn = DatabaseUtil.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            setStaffParameters(pstmt, staff);
            pstmt.setString(9, staff.getId());

            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            handleSQLException(e, "修改员工信息失败");
            return false;
        }
    }

    public Staff getStaffById(String id) {
        String sql = "SELECT * FROM Staff WHERE id = ?";

        try (Connection conn = DatabaseUtil.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return mapResultSetToStaff(rs);
                }
            }
        } catch (SQLException e) {
            handleSQLException(e, "按ID查询员工失败");
        }
        return null;
    }

    private void setStaffParameters(PreparedStatement pstmt, Staff staff) throws SQLException {
        pstmt.setString(1, staff.getId());
        pstmt.setString(2, staff.getLastName());
        pstmt.setString(3, staff.getFirstName());
        pstmt.setString(4, staff.getMi());
        pstmt.setString(5, staff.getAddress());
        pstmt.setString(6, staff.getCity());
        pstmt.setString(7, staff.getState());
        pstmt.setString(8, staff.getTelephone());
        pstmt.setString(9, staff.getEmail());
    }

    private Staff mapResultSetToStaff(ResultSet rs) throws SQLException {
        Staff staff = new Staff();
        staff.setId(rs.getString("id"));
        staff.setLastName(rs.getString("lastName"));
        staff.setFirstName(rs.getString("firstName"));
        staff.setMi(rs.getString("mi"));
        staff.setAddress(rs.getString("address"));
        staff.setCity(rs.getString("city"));
        staff.setState(rs.getString("state"));
        staff.setTelephone(rs.getString("telephone"));
        staff.setEmail(rs.getString("email"));
        return staff;
    }

    private void handleSQLException(SQLException e, String message) {
        System.err.println(message + ": " + e.getMessage());
        e.printStackTrace();
    }
}