package beans;

public class HotelServiceImpl implements HotelService {
private HotelDao hotelDao;
	
	
	
	public HotelServiceImpl(HotelDao hotelDao) {
		this.hotelDao = hotelDao;
		// TODO Auto-generated constructor stub
	}

	
	
	public HotelServiceImpl() {
		super();
		this.hotelDao = hotelDao;
		// TODO Auto-generated constructor stub
	}



	public HotelDao getHotelDao() {
		return hotelDao;
	}
	
	public void setHotelDao(HotelDao hotelDao) {
		this.hotelDao = hotelDao;
	}
	
	
	
	public Hotel getHotelId(long hotelId){
		return hotelDao.find(hotelId);
	}




	public void changeRoomType(long hotelId) {
		// TODO Auto-generated method stub

		Hotel hotel = hotelDao.find(hotelId);
		String oldRoomType = hotel.getRoomType();
		String newRoomType;
		int numberOfPeople = hotel.getNumberOfPeople();
		if (numberOfPeople > 4) {
			newRoomType = "Suite";
		}else if (numberOfPeople > 2) {
			newRoomType = "2 Double Beds";
		}else {
		newRoomType = oldRoomType;
		}
		hotel.setRoomType(newRoomType);
		hotelDao.update(hotel);
	} 

}
