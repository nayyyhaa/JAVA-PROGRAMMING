//dummy class 1 for hashMap/Program02.java

package hashMap;

public class Person implements Comparable<Person>{

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((secondName == null) ? 0 : secondName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (secondName == null) {
			if (other.secondName != null)
				return false;
		} else if (!secondName.equals(other.secondName))
			return false;
		return true;
	}

	private String firstname;
	private String secondName;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String firstname, String secondName) {
		super();
		this.firstname = firstname;
		this.secondName = secondName;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	@Override
	public int compareTo(Person o) {
		int ret = this.getFirstname().compareTo(o.getFirstname());
		if(ret==0)
		{
			ret = this.getSecondName().compareTo(o.getSecondName());
		}
		return(ret);
	}

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", secondName=" + secondName + "]";
	}
	
	

}
