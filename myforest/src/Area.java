
public class Area {
	private int id;
	private String description;
	
	public Area(int id, String description) {
		this.id = id; 
		this.description = description;
	}
	
	@Override
	public String toString() {
		return String
				.format("Area [id=%s, description=%s]",
						id, description);
	}
}
