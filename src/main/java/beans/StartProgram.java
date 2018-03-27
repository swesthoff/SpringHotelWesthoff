package beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/beans.xml");
		HotelService hotelService = applicationContext.getBean("hotelService", HotelService.class);

		System.out.println("Before Change Room Type");
		System.out.println("Room 1 Room Type: " + hotelService.getHotelId(1).getRoomType());
		
		System.out.println("Room 2 Room Type: " + hotelService.getHotelId(2).getRoomType());
		System.out.println("Room 3 Room Type: " + hotelService.getHotelId(3).getRoomType());

		hotelService.changeRoomType(1);
		hotelService.changeRoomType(2);
		hotelService.changeRoomType(3);
		
		System.out.println("After Room Type Change:");
		System.out.println("Room 1: " + hotelService.getHotelId(1).getRoomType());
		System.out.println("Room 2: " + hotelService.getHotelId(2).getRoomType());
		System.out.println("Room 3: " + hotelService.getHotelId(3).getRoomType());

	
		
	}

}
