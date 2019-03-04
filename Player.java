import java.util.ArrayList;

public class Player {
	private String name;
	private String target;
	ArrayList<String> targetWords = new ArrayList();

	Player(String name) {
		this.name = name;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
