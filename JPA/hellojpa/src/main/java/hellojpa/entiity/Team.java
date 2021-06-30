package hellojpa.entiity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Team {
	
	@Id @GeneratedValue
	private Long id;
	private String name;

}
