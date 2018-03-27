package beans;



public class Hotel {

	private long hotelId;
	private String hotelName;
	private String cityName;
	private String roomType;
	private int numberOfPeople;
	private double cost;

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(long hotelId, String hotelName, String cityName, String roomType, int numberOfPeople, double cost) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.cityName = cityName;
		this.roomType = roomType;
		this.numberOfPeople = numberOfPeople;
		this.cost = cost;
	}

	public long getHotelId() {
		return hotelId;
	}

	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	
	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
 
	
	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}
