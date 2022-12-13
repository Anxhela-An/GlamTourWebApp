package lesson6.inner;

public class PhoneNumber {
	
	private static class Info<T1, T2> {
		
		private T1 member1;
		private T2 member2;

		public Info(T1 member1, T2 member2) {
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
			if (!(obj instanceof Info)) {
				return false;
			}
			Info other = (Info) obj;
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
			return "Info [member1=" + member1 + ", member2=" + member2 + "]";
		}

	}
	
	private Info<String, Integer> operator;
	private Info<Info<String, Integer>, Integer> simNumber;

	public PhoneNumber(String operatorName,
					   int operatorNumber,
					   String actualOperatorName,
					   int actualOperatorNumber,
					   int simNumberValue) {
		operator = new Info<String, Integer>
					(actualOperatorName, actualOperatorNumber);
		simNumber = new Info<Info<String, Integer>, Integer>
							(new Info<String, Integer>
								(operatorName, operatorNumber), 
									simNumberValue); 
	}
	
	public String getSimNumberAsString() {
		return simNumber.getMember1().getMember2() +
				" " + simNumber.getMember2();
	}
	
	public void setOperator(String actualOperatorName,
			   				int actualOperatorNumber) {
		operator.setMember1(actualOperatorName);
		operator.setMember2(actualOperatorNumber);
	}
	
	public String getOperatorName() {
		return operator.getMember1();
	}
	
	public int getOperatorNumber() {
		return operator.getMember2();
	}

	public String getSimNumberOperatorName() {
		return simNumber.getMember1().getMember1();
	}

	public int getSimNumberOperatorNumber() {
		return simNumber.getMember1().getMember2();
	}
	
	public int getSimNumber() {
		return simNumber.getMember2();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((operator == null) ? 0 : operator.hashCode());
		result = prime * result + ((simNumber == null) ? 0 : simNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof PhoneNumber)) {
			return false;
		}
		PhoneNumber other = (PhoneNumber) obj;
		if (operator == null) {
			if (other.operator != null) {
				return false;
			}
		} else if (!operator.equals(other.operator)) {
			return false;
		}
		if (simNumber == null) {
			if (other.simNumber != null) {
				return false;
			}
		} else if (!simNumber.equals(other.simNumber)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "lesson6.inner.PhoneNumber [operator=" + operator + ", simNumber=" + simNumber + "]";
	}
	 
}