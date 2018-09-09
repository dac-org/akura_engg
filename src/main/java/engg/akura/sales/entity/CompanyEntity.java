package engg.akura.sales.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CompanyEntity implements Serializable {
	
	private static final long serialVersionUID = 7623842057259012389L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String companyId;
	
	@Id
	private String companyName;
	
	@OneToOne(fetch=FetchType.LAZY)
	@Embedded
	private CompanyLogoEntity companyLogo;
	
	@ElementCollection
	private Set<AddressEntity> address = new HashSet<AddressEntity>();
	
	@Column
	private String owner;
	
	@ElementCollection(fetch=FetchType.LAZY)
	private Set<AddressEntity> phoneNumbers; 
}
