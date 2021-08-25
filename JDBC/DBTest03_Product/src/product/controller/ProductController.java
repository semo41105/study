package product.controller;

import java.util.List;

import product.model.biz.ProductBiz;
import product.model.dto.Product;

public class ProductController {
	ProductBiz biz = new ProductBiz();

	public void controll(String command, Product dto) {

		System.out.println("[command: " + command + "]");

		if (command.equals("selectAll")) {
			List<Product> allRes = biz.selectAll();

			for (Product p : allRes) {
				System.out.println(p);
			}
		} else if (command.equals("selectOne")) {
			Product oneRes = biz.selectOne(dto.getpId()); // 디티오의 getpid를 넘겨받아 비즈의 셀렉트원을 호출해서 담기
			System.out.println(oneRes);

		} else if (command.equals("insert")) {
			int inRes = biz.insert(dto);
			if (inRes > 0) {
				System.out.println("insert 성공");
			} else {
				System.out.println("insert 실패");
			}

		} else if (command.equals("update")) {
			int upRes = biz.update(dto);
			if (upRes > 0) {
				System.out.println("update 성공");
			} else {
				System.out.println("update 실패");
			}

		} else if (command.equals("delete")) {
			int deRes = biz.delete(dto.getpId());
			if (deRes > 0) {
				System.out.println("delete 성공");
			} else {
				System.out.println("delete 실패");
			}

		}

	}
}
