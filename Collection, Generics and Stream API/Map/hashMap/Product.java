/**
 * Dummy class 2 for Program02.java
 */
package hashMap;

/**
 * @author Bellatrix
 *
 */
public class Product implements Comparable<Product>{

	/**
	 * @param args
	 */
	private int pno;
	private String name;
	private double price;
	public Product(int pno, String name, double price) {
		super();
		this.pno = pno;
		this.name = name;
		this.price = price;
	}
	public Product() {
	
		// TODO Auto-generated constructor stub
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pno=" + pno + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pno;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Product other = (Product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pno != other.pno)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	@Override
	public int compareTo(Product o) {
		int res = this.pno - o.getPno();
		if(res==0)
		{
			res = this.name.compareTo(o.getName());
			if(res==0)
			{
				res = (int) (this.price - o.getPrice());	
			}
		}
		
		
		return res;
		
	}
	
	
	
	
	

}
