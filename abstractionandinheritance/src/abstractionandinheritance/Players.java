package abstractionandinheritance;

public class Players {
	static int idg = 0;
	private int id;
	private String name;
	public Players() {
		super();
	}
	public Players(String name) {   // removed id cause we are not taking it from user.
		super();
	   id = ++idg;
		this.name = name;
	}

public int getId() {
	return id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Players [id=" + id + ", name=" + name + "]";
}
}
