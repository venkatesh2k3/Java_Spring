package com.intern.jdbc;

public class FileUpload {
		private long id;
		private String f_name;
		private String f_type;
		private byte[] data;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getF_name() {
			return f_name;
		}
		public void setF_name(String f_name) {
			this.f_name = f_name;
		}
		public String getF_type() {
			return f_type;
		}
		public void setF_type(String f_type) {
			this.f_type = f_type;
		}
		public byte[] getData() {
			return data;
		}
		public void setData(byte[] data) {
			this.data = data;
		}
}
