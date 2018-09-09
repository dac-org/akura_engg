package engg.akura.sales.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Lob;

@Embeddable
public class CompanyLogoEntity implements Serializable {

	private static final long serialVersionUID = 3766491230806478653L;

	@Column
	private String fileName;
	
	@Column
	private long fileSize;
	
	@Column
	@Lob
	private byte[] blobData;
	
	public CompanyLogoEntity(String fileName, long fileSize, byte[] blobData) {
		this.fileName = fileName;
		this.fileSize = fileSize;
		this.blobData = blobData;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public byte[] getBlobData() {
		return blobData;
	}

	public void setBlobData(byte[] blobData) {
		this.blobData = blobData;
	}
}
