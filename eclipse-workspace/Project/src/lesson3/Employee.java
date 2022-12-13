package lesson3;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import lesson1.Util;
import lesson2.Address;
import lesson2.Person;

public class Employee extends Person {
	
	private GregorianCalendar employmentDate;
	private double wage;
	private ArrayList<EmployeeEvaluation> evaluations;
	private ArrayList<Responsibility> responsibilities;
	private Employee manager;
	private Address officeAddress;
	  
	public Employee(GregorianCalendar birthdate) {
		this(null, null, birthdate, OTHER_GENDER,
				null, birthdate, 0, 
				new ArrayList<EmployeeEvaluation>(), 
				new ArrayList<Responsibility>(),
				null, null);
	}

	public Employee(String surname, 
			        GregorianCalendar birthdate) {
		this(null, surname, birthdate, OTHER_GENDER,
				null, birthdate, 0, 
				new ArrayList<EmployeeEvaluation>(), 
				new ArrayList<Responsibility>(),
				null, null);
	}

	public Employee(String surname, 
			        GregorianCalendar birthdate, 
			        int gender) {
		this(null, surname, birthdate, gender,
				null, birthdate, 0, 
				new ArrayList<EmployeeEvaluation>(), 
				new ArrayList<Responsibility>(),
				null, null);
	}

	public Employee(String name,
					String surname, 
					GregorianCalendar birthdate, 
					int gender) {
		this(name, surname, birthdate, gender,
				null, birthdate, 0, 
				new ArrayList<EmployeeEvaluation>(), 
				new ArrayList<Responsibility>(),
				null, null);
	}

	public Employee(String name, 
					String surname,
					GregorianCalendar birthdate, 
					int gender, 
					Address address) {
		this(name, surname, birthdate, gender,
				address, birthdate, 0, 
				new ArrayList<EmployeeEvaluation>(), 
				new ArrayList<Responsibility>(),
				null, null);
	} 

	public Employee(String name, 
					String surname,
					GregorianCalendar birthdate, 
					int gender, 
					Address address, 
					double wage, 
					Employee manager,
					Address officeAddress) {
		this(name, surname, birthdate, gender,
				address, birthdate, wage, 
				new ArrayList<EmployeeEvaluation>(), 
				new ArrayList<Responsibility>(),
				manager, officeAddress);
	} 

	public Employee(String name, 
					String surname,
					GregorianCalendar birthdate, 
					int gender, 
					Address address,
					GregorianCalendar employmentDate,
					double wage,
					ArrayList<EmployeeEvaluation> evaluations,
					ArrayList<Responsibility> responsibilities, 
					Employee manager,
					Address officeAddress) {
		super(name, surname, birthdate, gender, address);
		if(employmentDate == null) {
			employmentDate = new GregorianCalendar();
		}
		if(evaluations == null) {
			evaluations = new ArrayList<EmployeeEvaluation>();
		}
		if(responsibilities == null) {
			responsibilities = new ArrayList<Responsibility>();
		}
		if(wage < 0) {
			wage = 0;
		}
		this.employmentDate = new GregorianCalendar();
		this.employmentDate.setTimeInMillis(employmentDate.getTimeInMillis());
		this.wage = wage;
		this.manager = manager;
		this.officeAddress = officeAddress;
		this.evaluations = new ArrayList<EmployeeEvaluation>();
		for(EmployeeEvaluation ee : evaluations) {
			this.evaluations.add(ee);
		}
		this.responsibilities = new ArrayList<Responsibility>();
		for(Responsibility r : responsibilities) {
			this.responsibilities.add(r);
		}
	} 

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	
	public long getEmploymentDateInMillis() {
		return employmentDate.getTimeInMillis();
	}
	
	public int getResponsibilitiesSize() {
		return evaluations.size();
	}
	
	public void addResponsibility(Responsibility r) {
		responsibilities.add(r);
	}
	
	public Responsibility getResponsibility(int index) {
		if(index < 0 || index > getResponsibilitiesSize() - 1) {
			return null;
		}
		return responsibilities.get(index);
	}

	public int getEvaluationsSize() {
		return evaluations.size();
	}
	
	public void addEvaluation(EmployeeEvaluation ee) {
		evaluations.add(ee);
	}
	
	public EmployeeEvaluation getEmployeeEvaluation(int index) {
		if(index < 0 || index > getEvaluationsSize() - 1) {
			return null;
		}
		return evaluations.get(index);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((employmentDate == null) ? 0 : employmentDate.hashCode());
		result = prime * result + ((evaluations == null) ? 0 : evaluations.hashCode());
		result = prime * result + ((manager == null) ? 0 : manager.hashCode());
		result = prime * result + ((officeAddress == null) ? 0 : officeAddress.hashCode());
		result = prime * result + ((responsibilities == null) ? 0 : responsibilities.hashCode());
		long temp;
		temp = Double.doubleToLongBits(wage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		if (employmentDate == null) {
			if (other.employmentDate != null) {
				return false;
			}
		} else if (!employmentDate.equals(other.employmentDate)) {
			return false;
		}
		if (evaluations == null) {
			if (other.evaluations != null) {
				return false;
			}
		} else if (!evaluations.equals(other.evaluations)) {
			return false;
		}
		if (manager == null) {
			if (other.manager != null) {
				return false;
			}
		} else if (!manager.equals(other.manager)) {
			return false;
		}
		if (officeAddress == null) {
			if (other.officeAddress != null) {
				return false;
			}
		} else if (!officeAddress.equals(other.officeAddress)) {
			return false;
		}
		if (responsibilities == null) {
			if (other.responsibilities != null) {
				return false;
			}
		} else if (!responsibilities.equals(other.responsibilities)) {
			return false;
		}
		if (Double.doubleToLongBits(wage) != Double.doubleToLongBits(other.wage)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "lesson3.Employee ["
				+ "employmentDate=" + Util.getGregorianCalendarAsDateAndTimeString(employmentDate) 
				+ ", wage=" + wage 
				+ ", evaluations=" + evaluations
				+ ", responsibilities=" + responsibilities 
				+ ", manager=" + manager 
				+ ", officeAddress=" + officeAddress
				+ ", toString()=" + super.toString() + "]";
	}
	
	/*** 
	 * 	daten e punesimit					GregorianCalendar 		e pandryshueshme
	 * 	pagesen per ore						double
	 * 	vleresimet/kritikat qe ka marre 	
	 * 	punonjesi ne pune
	 * 									jo nje String
	 * 		cdo vleresim do kete id
	 * 							 date dhe ore
	 * 							 titull
	 * 							 pershkrim
	 * 						     				info e gjitha e pandryshueshme
	 * 
	 * 	
	 * 	pergjegjesite
	 * 									jo nje String
	 * 
	 * 		cdo pergjegjesi do kete titull		nuk mund te ndryshoje
	 * 								pershkrim	 
	 * 								date fillimi
	 * 								date mbarimi
	 * 								orari
	 * 		
	 * 
	 * 	menaxher							Employee
	 * 	adrese zyre							Address
	 * 
	 * 
	 * */
	 
}