package lesson5;

public class Pair<T1, T2> {   //cift i kombinuar, nuk e dime se cfare tipesh jane
 
	private T1 member1;
	private T2 member2;
	 
	public Pair(T1 member1, T2 member2) {
		super();
		this.member1 = member1;
		this.member2 = member2;
	}

	public T1 getMember1() {
		return member1;
	}

	public void setMember1(T1 member1) {
		this.member1 = member1;
	}

	public T2 getMember2() {
		return member2;
	}

	public void setMember2(T2 member2) {
		this.member2 = member2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((member1 == null) ? 0 : member1.hashCode());
		result = prime * result + ((member2 == null) ? 0 : member2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Pair)) {
			return false;
		}
		Pair other = (Pair) obj;
		if (member1 == null) {
			if (other.member1 != null) {
				return false;
			}
		} else if (!member1.equals(other.member1)) {
			return false;
		}
		if (member2 == null) {
			if (other.member2 != null) {
				return false;
			}
		} else if (!member2.equals(other.member2)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "lesson5.Pair [member1=" + member1 + ", member2=" + member2 + "]";
	}

}