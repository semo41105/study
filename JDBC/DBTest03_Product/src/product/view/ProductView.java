package product.view;

import java.util.Scanner;

import product.controller.ProductController;
import product.model.dto.Product;

public class ProductView {

	Scanner sc = new Scanner(System.in);

	public int getMenu() {
		System.out.println("*************");
		System.out.println("1. 전체출력");
		System.out.println("2. 선택출력");
		System.out.println("3. 추가");
		System.out.println("4. 수정");
		System.out.println("5. 삭제");
		System.out.println("6. 종료");
		System.out.println("*************");
		System.out.print("메뉴 선택: ");
		int select = sc.nextInt();

		return select;
	}

	public ProductView() {
		// 생성자에서 해주려 함.
		int no = 0;
		ProductController pc = new ProductController();
		String command = null;

		while (no != 6) {
			no = getMenu();

			switch (no) {
			case 1:
				command = "selectAll";
				Product allDto = new Product();
				pc.controll(command, allDto);
				break;

			case 2:
				command = "selectOne";
				
				System.out.print("pId 입력");
				String oneId = sc.next();
				Product oneDto = new Product();
				oneDto.setpId(oneId);
				
				pc.controll(command, oneDto);
				break;

			case 3: 
				command = "insert";
				
				System.out.println("***추가할 데이터 입력***");
				System.out.print("id: ");
				String iId = sc.next();
				System.out.print("name: ");
				String iName = sc.next();
				System.out.print("price: ");
				int iPrice = sc.nextInt();
				System.out.print("des: ");
				String iDes = sc.next();
				
				Product inDto = new Product(iId, iName, iPrice, iDes);
								
				pc.controll(command, inDto);
				break;
				
			case 4:
				command = "update";
				
				System.out.println("***수정할 데이터 입력***");
				System.out.print("id: ");
				String uId = sc.next();
				System.out.println("수정할 price: ");
				int uPrice = sc.nextInt();
				
				Product upDto = new Product(uId, uPrice);
				pc.controll(command, upDto);
				break;				
				
			case 5:
				command = "delete";
				
				System.out.print("삭제할 id:");
				String dId = sc.next();
				
				Product delDto = new Product();
				delDto.setpId(dId);
				
				pc.controll(command, delDto);
				break;				
			case 6:
				System.out.println("[프로그램 종료]");
				break;

			}

		}

	}

}
