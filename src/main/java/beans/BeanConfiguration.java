package beans;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public HotelDao hotelDao() {
		HotelDaoInMemoryImpl bean = new HotelDaoInMemoryImpl();
		return bean;
		
	}
	
	@Bean
	public HotelService hotelService() {
		HotelServiceImpl bean = new HotelServiceImpl(hotelDao());
		bean.setHotelDao(hotelDao());
		return bean;
	}
	
//	@Bean
//	public HotelDao HotelDaoJpa() {
//		HotelDaoJpaImpl bean = new HotelDaoJpaImpl();
//		return bean;
//		
//	}
	
//	@Bean(autowire=Autowire.BY_NAME)
//	public HotelService hotelService() {
//		HotelServiceImpl bean = new HotelServiceImpl(hotelDao());
//		//bean.setAccountDao(accountDao());
//		return bean;
//	}
}
