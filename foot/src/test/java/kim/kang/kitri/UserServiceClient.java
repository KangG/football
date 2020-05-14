package kim.kang.kitri;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {

	public static void main(String[] args) {
		
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		
		UserService userService = (UserService) container.getBean("userService");
		
		UserVO vo = new UserVO();
		vo.setID("jiin");
		vo.setPASSWORD("jiin");
		
		UserVO user = userService.getUser(vo);
		
		
		if(user!=null) {
			System.out.println(user.getNAME()+"�� �α��� �մϴ�");
		}
		else
		{
			System.out.println("�α��� ���� ");
		}
		
		container.close();
		
		
	}

}
