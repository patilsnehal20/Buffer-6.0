package com.academic.examapp.model;
public class AdminUser {
   private int adminId;
   private String username;
   private String password;
   // Constructors, getters, and setters
   public AdminUser(int adminId, String username, String password) {
       this.adminId = adminId;
       this.username = username;
       this.password = password;
   }
   public int getAdminId() {
       return adminId;
   }
   public String getUsername() {
       return username;
   }
   public String getPassword() {
       return password;
   }
}
