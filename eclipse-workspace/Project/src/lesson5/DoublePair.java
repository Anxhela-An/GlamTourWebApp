package lesson5;

import java.util.ArrayList;

public class DoublePair {

	private Double member1;
	private Double member2;

	public DoublePair
			(Double member1, 
			 Double member2) {
		super();
		this.member1 = member1;
		this.member2 = member2;
	}

	public Double getMember1() {
		return member1;
	}

	public void setMember1(Double member1) {
		this.member1 = member1;
	}

	public Double getMember2() {
		return member2;
	}

	public void setMember2(Double member2) {
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
		if (!(obj instanceof DoublePair)) {
			return false;
		}
		DoublePair other = (DoublePair) obj;
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
		return "lesson5.DoublePair [member1=" + member1 + ", member2=" + member2 + "]";
	}
	
   

}
