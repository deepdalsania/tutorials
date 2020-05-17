package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userinfo")
public class UserInfoModel {

		@Id
		long id;
		
		@Column
		String uname;
		
		public UserInfoModel() {
			
			// TODO Auto-generated constructor stub
		}
		public UserInfoModel(long id, String uname, String password) {
			
			this.id = id;
			this.uname = uname;
			this.password = password;
		}
		@Column
		String password;
		
		public long getId() {
			return id;
		}
		public void setId(int id) {
			
			
			
			
			
			
			this.id = id;
		}
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
}