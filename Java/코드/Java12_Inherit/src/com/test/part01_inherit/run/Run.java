package com.test.part01_inherit.run;

import java.util.Date;

import com.test.part01_inherit.model.dto.Desktop;
import com.test.part01_inherit.model.dto.SmartPhone;
import com.test.part01_inherit.model.dto.Television;

public class Run {

	public static void main(String[] args) {
		Television tv = new Television("samsung","02","t_01234","삼성TV",500000, new Date(), 45);
		
		System.out.println(tv.info());
		
//		Television t2 = new Television();
//		System.out.println(tv2.info());
		
		Desktop d = new Desktop("samsung", "01", "S-1234", "매직스테이션2", 1000000, new Date(),
				"인텔", 500, 16, "window10", false);
		System.out.println(d.info());
		
		SmartPhone s = new SmartPhone("Apple", "02", "i-123", 
				"iPhone12Pro", 1300000, new Date(),
				"A14", 1024,8,"IOS","KT");
		System.out.println(s.info());
	}
}
