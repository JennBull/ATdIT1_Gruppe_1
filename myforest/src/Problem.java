
public class Problem {
	private int id; 
	private String description;
	private int area_id;
	private int status_id;
	private String tree; 
	
	public Problem(int id, String description, int area_id, int status_id, String tree) {
		this.id = id;
		this.description = description;
		this.area_id = area_id;
		this.status_id = status_id;
		this.tree = tree;
	}
	
	@Override
	public String toString() {
		return String
				.format("Problem [id=%s, description=%s, area_id=%s, status_id=%s, tree=%s]",
						id, description, area_id, status_id, tree);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getArea_id() {
		return area_id;
	}

	public void setArea_id(int area_id) {
		this.area_id = area_id;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	public String getTree() {
		return tree;
	}

	public void setTree(String tree) {
		this.tree = tree;
	}

}
