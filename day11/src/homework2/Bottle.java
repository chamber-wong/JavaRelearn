package homework2;

public class Bottle {
	private String texture;
	private String shape;
	private String size;

	public Bottle(String texture, String shape, String size) {
		super();
		this.texture = texture;
		this.shape = shape;
		this.size = size;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public boolean equals(Object object) {
		if (!(object instanceof Bottle)) {
			return false;
		}
		Bottle bottle = (Bottle)object;
		if (bottle.getShape().equals(this.shape) &&
				bottle.getSize().equals(this.size) &&
				bottle.getTexture().equals(this.texture)) {
			return true;
		}
		return false;
	}
	

}
