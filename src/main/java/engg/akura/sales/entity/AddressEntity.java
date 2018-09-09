package engg.akura.sales.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class AddressEntity implements Serializable{
	
	private static final long serialVersionUID = 1680373216999219009L;

	@Column
	private String address;
	
	@Column
	private String phoneNumber;
	
	public AddressEntity(){
		
	}
	
	public AddressEntity(String address, String phoneNumber){
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AddressEntity [address=");
		builder.append(address);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append("]");
		return builder.toString();
	}
	
}
