package com.ktds.mcj.address.book.biz;

import java.util.List;
import java.util.Scanner;

import com.ktds.mcj.address.book.dao.AddressDao;
import com.ktds.mcj.address.book.dao.AddressDaoImpl;
import com.ktds.mcj.address.book.vo.AddressVO;

public class AddressBizImpl implements AddressBiz {

	private AddressDao addressDao;
	
	public AddressBizImpl() {
		addressDao = new AddressDaoImpl();
	}
	
	@Override
	public void queryAllList() {
		List<AddressVO> addressList = addressDao.queryAllList();
		for ( AddressVO address : addressList ) {
			System.out.printf("이름 : %s, 전화번호 : %s, 주소 : %s\n", 
					address.getName(), address.getPhoneNumber(), address.getAddress());
		}
	}

	@Override
	public void findOneAddress() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("주소록의 번호를 입력하세요.");
		int addressNumber = input.nextInt();
		AddressVO addressVO = addressDao.findOneAddress(addressNumber);
		System.out.printf("이름 : %s, 전화번호 : %s, n주소 : %s\n", 
				addressVO.getName(), addressVO.getPhoneNumber(), addressVO.getAddress());
	}

	@Override
	public void removeAddress() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("주소록의 번호를 입력하세요.");
		int addressNumber = input.nextInt();
		addressDao.removeAddress(addressNumber);
	}

	@Override
	public void updateAddress() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("주소록의 번호를 입력하세요.");
		int addressNumber = input.nextInt();
		AddressVO addressVO = addressDao.findOneAddress(addressNumber);
		System.out.printf("이름 : %s, 전화번호 : %s, 주소 : %s\n", 
				addressVO.getName(), addressVO.getPhoneNumber(), addressVO.getAddress());
		
		System.out.println("새로운 주소 정보를 입력하세요.");
		System.out.println("이름을 입력하세요.");
		String nameTemp = input.next();
		System.out.println("전화번호를 입력하세요.");
		String phoneNumberTemp = input.next();
		System.out.println("주소를 입력하세요.");
		String addressTemp = input.next();
		
		addressVO = new AddressVO();
		addressVO.setName(nameTemp);
		addressVO.setPhoneNumber(phoneNumberTemp);
		addressVO.setAddress(addressTemp);
		
		addressDao.updateAddress(addressNumber, addressVO);
	}

	@Override
	public void addAddress() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("새로운 주소 정보를 입력하세요.");
		System.out.println("이름을 입력하세요.");
		String nameTemp = input.next();
		System.out.println("전화번호를 입력하세요.");
		String phoneNumberTemp = input.next();
		System.out.println("주소를 입력하세요.");
		String addressTemp = input.next();
		
		AddressVO addressVO = new AddressVO();
		addressVO.setName(nameTemp);
		addressVO.setPhoneNumber(phoneNumberTemp);
		addressVO.setAddress(addressTemp);
		
		addressDao.addAddress(addressVO);
	}

}
