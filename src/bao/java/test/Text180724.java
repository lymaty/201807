package bao.java.test;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import bao.java.tongyonglei.*;

public class Text180724 {
	public static void main(String[] args) {
		//��Map������Map���������Ĺ��ܣ� 
		//�������ж���һ���ַ�������ʾһ����ݣ������������籭�ھ�����֧��ӡ������ ��û�оٰ����籭���������û�оٰ����籭�� 
		//�������籭�ھ��Լ���Ӧ�Ķ����ݣ���ο����¸�¼�� ��¼ 1)��ֹ��2009 ��Ϊֹ���������籭�ھ�;
		//2)2008 �������˻�����������ң� ���ص��ߣ�����͢���Ĵ����ǣ�����ά�ǣ��������������ǡ��ձ����������й������� ��������������ʱ������������¡���鶼��˹�������   
		/*Scanner input=new Scanner(System.in);
		int i=1;
		System.out.println("������1954��2006֮�����ݣ�");
		while(i<14){
			String key=input.nextLine();
			football(key);//�鿴1954��2006������籭�ھ�
			i++;
		}*/
		//��Map����֪ĳѧУ�Ľ�ѧ�γ����ݰ������£�
		//1�� ʹ��һ��Map������ʦ��������Ϊ��������ʦ���ڵĿγ�����Ϊֵ����ʾ���� �γ̰��š� 
		//4�� ����Map��������е���ʦ����ʦ���ڵĿγ�(Set<Map.Entry<String,String>>��Set<String> get(key)) 
		//5�� *����Map��������н�JSP ����ʦ��  
		/*Map<String,String> map=new HashMap<String,String>();
		map.put("Tom","CoreJava");
		map.put("John", "Oracle");
		map.put("Susan", "Oracle");
		map.put("Jerry", "JDBC");
		map.put("Jim", "Unix");
		map.put("kevin", "JSP");
		map.put("Lucy", "JSP");
		////2�� ������һλ����ʦAllen ��JDBC
		map.put("Allen", "JDBC");
		// 3�� Lucy ��Ϊ��CoreJava
		//map.put("Lucy", "CoreJava");
		// ����Map��������е���ʦ����ʦ���ڵĿγ�
		Set<Entry<String, String>> entry=map.entrySet();//����set�з�mapֵ
		Iterator<Entry<String, String>> iterator = entry.iterator();//������
		while(iterator.hasNext()){
			Entry<String, String> n=iterator.next();
			System.out.println(n.getKey()+"��ʦ����:"+n.getValue());//�ظ���ȡ�����������ױ���iterator.next()
			if(n.getValue()=="JSP"){
				System.out.println("����JSP����ʦ��"+n.getKey());
			}
		}*/
		//3��Set�������������ֻࣨд��������ԣ������������Ӧ�Ĺ��췽����get/set ������
		//Ҫ������Worker��Address��ʹ��Worker�����ܹ���ȷ����HashSet�У����� Worker����HashSet��ʱ��������ظ�Ԫ�ء�����д��Ӧ���� ���롣
		/*Worker w1,w2,w3,w4;
		w1=new Worker("������",18,3000,new Address("����","1245"));
		w2=new Worker("������",25,3500,new Address("tianj","1235"));
		w3=new Worker("����",22,3200,new Address("langf","1225"));
		w4=new Worker("����",22,3200,new Address("sjz","1243"));
		Address wd1,wd2,wd3,wd4;
		wd1=new Address("����","1245");
		w1.setAddress(wd1);
		wd2=new Address("���","1243");
		w2.setAddress(wd2);
		wd3=new Address("�ӱ�","1242");
		w3.setAddress(wd3);
		wd4=new Address("����","1240");
		w4.setAddress(wd4);
		Set<Worker> set=new HashSet<>();
		//set.add(new Worker("������",18,3000,new Address("����","1245")));
		set.add(w1);
		set.add(w2);
		set.add(w3);
		set.add(w4);//����Ԫ�أ����ظ�
		Iterator it=set.iterator();//����������setֵ��ԭ��˳������������
		String[] n=new String[set.size()];
		while(it.hasNext()){//set1.iterator().hasNext();--ÿ��ѭ����ȡһ��set1.iterator;
			System.out.println(it.next());
		}*/
		//19. *��Map�����Account�������£�Ҫ��������ƣ�ʹ�ø�Account �����ܹ��Զ�����id�� 
		//����һ��List ���£� 
		/*List list = new ArrayList(); 
		list.add(new Account(10.00, "1234"));
		list.add(new Account(15.00, "5678"));
		list.add(new Account(0, "1010")); 
		//Ҫ���List �е����ݷŵ�һ��Map�У���Map�ļ�Ϊid��ֵΪ��Ӧ��Account���� ���������Map����ӡ����Account�����id����
		Map<Long,Account> map1=new HashMap<>();//��װ��
		//����forѭ��ʹID�Զ�����
		for(long i=1;i<=list.size();i++){
			//����account�������list���±�ΪI-1��ֵ��
			Account account=(Account) list.get((int)(i-1));
			account.setId(i);//��i��ֵ��ID��ʵ���Զ�����
			map1.put(i, account);//��i��account����map
		}
		//��map����set���������map��ֵ��
		Set<Long> set2=map1.keySet();
		for (Long long1 : set2) {
			System.out.println(long1);
			System.out.println(map1.get(long1));
		}*/
		//����io��ʵ�ֽ�һ���ļ����µ��ļ����Ƶ���һ���ļ����� ����ԭ���ļ�������������
		//˼·�����ַ�����ȡ��д����1������Ŀ���ļ����󣬻�ȡ�ļ��������ļ����ݷ��õ�char[]�����У���char[]д��ָ��λ���ļ���
		File filefrom=new File("D:\\javacode\\java45.java");
		File fileto=new File("D:\\javacode\\study0725\\"+filefrom.getName());
		try {
			//��ȡ�ļ�
			Reader read=new FileReader(filefrom);
			char[] cbuf=new char[(int)filefrom.length()];
			read.read(cbuf);//��ȡ�ļ����ݽ�����cbuf
			for (char c : cbuf) {
				System.out.print(c);
			}
			Writer write=new FileWriter(fileto);
			write.write(cbuf);//������д���ļ�fileto
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
		//��map<>��������ݡ�
		Map<String,String> map= new HashMap<String,String>();
		map.put("2006","�����");
		map.put("2002", "����");
		map.put("1998", "����");
		map.put("1994", "����");
		map.put("1990", "�¹�");
		map.put("1986", "����͢");
		map.put("1982", "�����");
		map.put("1978", "����͢");
		map.put("1974", "�¹�");
		map.put("1970", "����");
		map.put("1966", "Ӣ����");
		map.put("1962", "����");
		map.put("1958", "����");
		map.put("1954", "�¹�");
		//�ж���ݺ͹ھ�
		
		
		//����3��
		/*String  chamption=map.get(key);
		if(chamption!=null){
			System.out.println(chamption);
		}else{System.out.println("null");}*/
		
		//����2��map.containkey()����
		/*if(map.containsKey(key)==true){
			System.out.println(map.get(key));//���ֵ
		}else{System.out.println("none");}*/

		//����1��switch-case
		/*switch (key) {
		case "1954":
			System.out.println("�¹�");
			break;
		default:
			System.out.println("�����û�оٰ����籭");
			break;
		}*/
	}

}
