
public class Status {
	private int id;
	private String description;
	
	public Status(int id, String description) {
		this.id = id; 
		this.description = description;
	}
	
	@Override
	public String toString() {
		return String
				.format("Status [id=%s, description=%s]",
						id, description);
	}

}
