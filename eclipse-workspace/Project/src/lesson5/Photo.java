package lesson5;

public class Photo implements Compare<Photo>{

	private int width, height; 
	 
	public Photo(int width, int height) { 
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public int getArea() {
		return width * height;
	}

	@Override
	public boolean isBiggerThan(Photo o) {
		if(o == null) {
			return true;
		}
		return getArea() > o.getArea();
	}

	@Override
	public boolean isSmallerThan(Photo o) {
		if(o == null) {
			return false;
		}
		return getArea() < o.getArea();
	}

	@Override
	public boolean isEqual(Photo o) {
		if(o == null) {
			return false;
		}
		return getArea() == o.getArea();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Photo)) {
			return false;
		}
		Photo other = (Photo) obj;
		if (height != other.height) {
			return false;
		}
		if (width != other.width) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Lesson5.Photo [width=" + width + ", height=" + height + "]";
	}
	
	

}