package javaTest.generic;

/**
 * 泛型
 * 联系方式类
 * @author w-liuqi
 *
 */
public class Contact implements Info{
	private String address;
	private String telphone;
	private String zipcode;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Contact(String address, String telphone, String zipcode) {
		super();
		this.address = address;
		this.telphone = telphone;
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Contact [address=" + address + ", telphone=" + telphone + ", zipcode=" + zipcode + "]";
	}
}
