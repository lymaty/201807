package bao.java.tongyonglei;

import java.util.Scanner;

public class ATM {
	private AtmUser user=new AtmUser("0001",123);
	private Scanner input=new Scanner(System.in); 	
	public ATM(){}
	public ATM(AtmUser user, double atmcount, Scanner input) {
		super();
		this.input = input;
	}
	/**
	 * @return the input
	 */
	public Scanner getInput() {
		return input;
	}
	/**
	 * @param input the input to set
	 */
	public void setInput(Scanner input) {
		this.input = input;
	}
	
	public void login(){
		System.out.println("�������û���:");
		for(int j=0;0<=j&&j<2;j++){
			String uname=input.next();	
			if(uname.equals(user.getUsername())){
				System.out.println("����������:");
				for(int i=0;0<=i&&i<2;i++){
					int pword=input.nextInt();
					if(pword==user.getPassword()){
						showMenu();break;
					}else{
						System.out.println("���������������������:");
						i++;
						System.out.println("ʣ�������������"+(2-i));
					}
				}
			}else{
				System.out.println("δ�ҵ��û���Ϣ���������������");
				j++;
				System.out.println("ʣ���û����������"+(2-j));
			}		
		}
	}

	public void showMenu(){
		
	}
	

}
