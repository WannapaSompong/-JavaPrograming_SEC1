import java.time.Year;

public class Book {
	
	private String title;
	private float price;
	private int pulishyear;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	public float getPrice() {
		return this.price;
	}

	public void setPulishyear(int pulishyear) {
		this.pulishyear = pulishyear;
	}
	public int getPulishyear() {
		return this.pulishyear;
	}
	
	public int getTotalYear() {
		return Year.now().getValue()-pulishyear;
	}
	public String toString() {
		return	"Title : "+getTitle()+" pulished for "
	+getTotalYear()+" year ("+getPrice()+"baht).";
	}
	
}
