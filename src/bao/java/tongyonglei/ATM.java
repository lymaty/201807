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
		System.out.println("请输入用户名:");
		for(int j=0;0<=j&&j<2;j++){
			String uname=input.next();	
			if(uname.equals(user.getUsername())){
				System.out.println("请输入密码:");
				for(int i=0;0<=i&&i<2;i++){
					int pword=input.nextInt();
					if(pword==user.getPassword()){
						showMenu();break;
					}else{
						System.out.println("密码错误，请重新输入密码:");
						i++;
						System.out.println("剩余密码输入次数"+(2-i));
					}
				}
			}else{
				System.out.println("未找到用户信息，请检查后重新输入");
				j++;
				System.out.println("剩余用户名输入次数"+(2-j));
			}		
		}
	}

	public void showMenu(){
		
	}
	

}
