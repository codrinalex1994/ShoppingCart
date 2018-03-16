
public class Product {
	private int id;
	private String name;
	private String description;
	private double price;
	private String expirationDate;
	private int quantity;



	public Product(int id, String name, String description, double price, String expirationDate, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.expirationDate = expirationDate;
		this.quantity = quantity;

		if(description == "") throw new RuntimeException("invalid description");
		if(name == "") throw new RuntimeException("invalid name");
		if(price<1) throw new RuntimeException("invalid price");
		if(quantity<1) throw new RuntimeException("invalide quantity");
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((expirationDate == null) ? 0 : expirationDate.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Product)) {
			return false;
		}
		Product other = (Product) obj;
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (expirationDate == null) {
			if (other.expirationDate != null) {
				return false;
			}
		} else if (!expirationDate.equals(other.expirationDate)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
			return false;
		}
		if (quantity != other.quantity) {
			return false;
		}
		return true;
	}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public String toString() {
		return String.format("id=%d, name=%s, description=%s, price=%f, expiration date=%s, quantity in shop=%d",
			this.id, this.name, this.description, this.price, this.expirationDate, this.quantity);
	}
}
