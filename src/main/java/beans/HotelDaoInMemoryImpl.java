package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelDaoInMemoryImpl implements HotelDao {

	private Map<Long,Hotel>hotelsMap = new HashMap<Long,Hotel>();
	{
		Hotel hotel1 = new Hotel(1,"Marriot","Des Moines" ,"Double",6 , 125);
		Hotel hotel2 = new Hotel(2,"Super 8","West Des Moines", "King", 4 ,  78);
		Hotel hotel3 = new Hotel(3,"Holiday Inn","Des Moines", "Suite", 3 ,  450);
		
		
		
		hotelsMap.put(hotel1.getHotelId(), hotel1);
		hotelsMap.put(hotel2.getHotelId(), hotel2);
		hotelsMap.put(hotel3.getHotelId(), hotel3);
		
	}
	
	public void insert(Hotel hotel) {
		hotelsMap.put(hotel.getHotelId(), hotel);
	}
	
	public void update(Hotel hotel) {
		hotelsMap.put(hotel.getHotelId(), hotel);
	}
	
	public void update(List<Hotel> hotels) {
		for(Hotel hotel:hotels) {
			update(hotel);
		}
	}
	
	public void delete(long hotelId) {
		hotelsMap.remove(hotelId);
	}
	public Hotel find(long hotelId) {
		return hotelsMap.get(hotelId);
	}
	public List<Hotel>find(List<Long>hotelIds){
		List<Hotel>hotels=new ArrayList<Hotel>();
		for(Long id:hotelIds) {
			hotels.add(hotelsMap.get(id));
		}
		return hotels;
	}
	public List<Hotel>find(String hotelName){
			List<Hotel>hotels=new ArrayList<Hotel>();
			for(Hotel hotel:hotelsMap.values()) {
				if(hotelName.equals(hotel.getHotelName())) {
					hotels.add(hotel);
				}
			}
			return hotels;
	}
	
//	public List<Hotel>find(String cityName){
//		List<Hotel>hotels=new ArrayList<Hotel>();
//		for(Hotel hotel:hotelsMap.values()) {
//			if(cityName.equals(hotel.getCityName())) {
//				hotels.add(hotel);
//			}
//		}
//		return hotels;
//}

	
	
}
