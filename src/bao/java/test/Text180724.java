package bao.java.test;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import bao.java.tongyonglei.*;

public class Text180724 {
	public static void main(String[] args) {
		//（Map）利用Map，完成下面的功能： 
		//从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。如果该 年没有举办世界杯，则输出：没有举办世界杯。 
		//附：世界杯冠军以及对应的夺冠年份，请参考本章附录。 附录 1)截止到2009 年为止，历届世界杯冠军;
		//2)2008 北京奥运会男足参赛国家： 科特迪瓦，阿根廷，澳大利亚，塞尔维亚，荷兰，尼日利亚、日本，美国，中国，新西 兰，巴西，比利时，韩国，喀麦隆，洪都拉斯，意大利   
		/*Scanner input=new Scanner(System.in);
		int i=1;
		System.out.println("请输入1954到2006之间的年份：");
		while(i<14){
			String key=input.nextLine();
			football(key);//查看1954到2006年间世界杯冠军
			i++;
		}*/
		//（Map）已知某学校的教学课程内容安排如下：
		//1） 使用一个Map，以老师的名字作为键，以老师教授的课程名作为值，表示上述 课程安排。 
		//4） 遍历Map，输出所有的老师及老师教授的课程(Set<Map.Entry<String,String>>、Set<String> get(key)) 
		//5） *利用Map，输出所有教JSP 的老师。  
		/*Map<String,String> map=new HashMap<String,String>();
		map.put("Tom","CoreJava");
		map.put("John", "Oracle");
		map.put("Susan", "Oracle");
		map.put("Jerry", "JDBC");
		map.put("Jim", "Unix");
		map.put("kevin", "JSP");
		map.put("Lucy", "JSP");
		////2） 增加了一位新老师Allen 教JDBC
		map.put("Allen", "JDBC");
		// 3） Lucy 改为教CoreJava
		//map.put("Lucy", "CoreJava");
		// 遍历Map，输出所有的老师及老师教授的课程
		Set<Entry<String, String>> entry=map.entrySet();//创建set列放map值
		Iterator<Entry<String, String>> iterator = entry.iterator();//迭代器
		while(iterator.hasNext()){
			Entry<String, String> n=iterator.next();
			System.out.println(n.getKey()+"老师教授:"+n.getValue());//重复获取迭代器，容易报错iterator.next()
			if(n.getValue()=="JSP"){
				System.out.println("教授JSP的老师有"+n.getKey());
			}
		}*/
		//3（Set）有如下两个类（只写了类的属性，请自行添加相应的构造方法和get/set 方法）
		//要求，完善Worker和Address类使得Worker对象能够正确放入HashSet中：即将 Worker放入HashSet中时不会出现重复元素。并编写相应测试 代码。
		/*Worker w1,w2,w3,w4;
		w1=new Worker("张三五",18,3000,new Address("北京","1245"));
		w2=new Worker("李四七",25,3500,new Address("tianj","1235"));
		w3=new Worker("王武",22,3200,new Address("langf","1225"));
		w4=new Worker("王武",22,3200,new Address("sjz","1243"));
		Address wd1,wd2,wd3,wd4;
		wd1=new Address("北京","1245");
		w1.setAddress(wd1);
		wd2=new Address("天津","1243");
		w2.setAddress(wd2);
		wd3=new Address("河北","1242");
		w3.setAddress(wd3);
		wd4=new Address("东京","1240");
		w4.setAddress(wd4);
		Set<Worker> set=new HashSet<>();
		//set.add(new Worker("张三五",18,3000,new Address("北京","1245")));
		set.add(w1);
		set.add(w2);
		set.add(w3);
		set.add(w4);//对象即元素，不重复
		Iterator it=set.iterator();//迭代器：将set值按原有顺序放入迭代器。
		String[] n=new String[set.size()];
		while(it.hasNext()){//set1.iterator().hasNext();--每次循环获取一次set1.iterator;
			System.out.println(it.next());
		}*/
		//19. *（Map）设计Account对象如下：要求完善设计，使得该Account 对象能够自动分配id。 
		//给定一个List 如下： 
		/*List list = new ArrayList(); 
		list.add(new Account(10.00, "1234"));
		list.add(new Account(15.00, "5678"));
		list.add(new Account(0, "1010")); 
		//要求把List 中的内容放到一个Map中，该Map的键为id，值为相应的Account对象。 最后遍历这个Map，打印所有Account对象的id和余额。
		Map<Long,Account> map1=new HashMap<>();//包装类
		//利用for循环使ID自动增长
		for(long i=1;i<=list.size();i++){
			//定义account对象放置list中下标为I-1的值。
			Account account=(Account) list.get((int)(i-1));
			account.setId(i);//将i赋值给ID，实现自动增长
			map1.put(i, account);//将i和account放入map
		}
		//将map放入set，遍历输出map的值。
		Set<Long> set2=map1.keySet();
		for (Long long1 : set2) {
			System.out.println(long1);
			System.out.println(map1.get(long1));
		}*/
		//利用io流实现将一个文件夹下的文件复制到里一个文件夹下 并以原来文件的名称命名。
		//思路：用字符流读取和写出。1）创建目标文件对象，获取文件名，读文件内容放置到char[]数组中，将char[]写入指定位置文件。
		File filefrom=new File("D:\\javacode\\java45.java");
		File fileto=new File("D:\\javacode\\study0725\\"+filefrom.getName());
		try {
			//读取文件
			Reader read=new FileReader(filefrom);
			char[] cbuf=new char[(int)filefrom.length()];
			read.read(cbuf);//读取文件内容进数组cbuf
			for (char c : cbuf) {
				System.out.print(c);
			}
			Writer write=new FileWriter(fileto);
			write.write(cbuf);//讲数组写入文件fileto
			write.close();
			read.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void football(String key){
		//向map<>中添加数据。
		Map<String,String> map= new HashMap<String,String>();
		map.put("2006","意大利");
		map.put("2002", "巴西");
		map.put("1998", "法国");
		map.put("1994", "巴西");
		map.put("1990", "德国");
		map.put("1986", "阿根廷");
		map.put("1982", "意大利");
		map.put("1978", "阿根廷");
		map.put("1974", "德国");
		map.put("1970", "巴西");
		map.put("1966", "英格兰");
		map.put("1962", "巴西");
		map.put("1958", "巴西");
		map.put("1954", "德国");
		//判断年份和冠军
		
		
		//方法3：
		/*String  chamption=map.get(key);
		if(chamption!=null){
			System.out.println(chamption);
		}else{System.out.println("null");}*/
		
		//方法2：map.containkey()方法
		/*if(map.containsKey(key)==true){
			System.out.println(map.get(key));//输出值
		}else{System.out.println("none");}*/

		//方法1：switch-case
		/*switch (key) {
		case "1954":
			System.out.println("德国");
			break;
		default:
			System.out.println("该年份没有举办世界杯");
			break;
		}*/
	}

}
