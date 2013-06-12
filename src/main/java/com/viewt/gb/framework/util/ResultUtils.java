package com.viewt.gb.framework.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.viewt.gb.proj.po.InsUesrPO;

public class ResultUtils<T> {

	public static void main(String[] args) {

		SimpleDateFormat sdf1 = new SimpleDateFormat("MM");
		String currDay = sdf1.format(new Date());
		System.out.println(currDay);
//		try {
//			new ScanMzoneFor10YTask().doTask(Long.parseLong("1000264284"));
//		} catch (NumberFormatException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		try {
			Class<?> clazz = InsUesrPO.class;
			Field[] field =  clazz.getDeclaredFields();
			Method[] methods =  clazz.getDeclaredMethods();
			Object objBo  = clazz.newInstance();
			int countA = 0 , countB = 0;
			Set<String> lsB = new TreeSet<String>();
			Map<String,String> mapA = new TreeMap<String,String>();
			for (int i = 0; i < field.length; i++) {
				String fieldName = field[i].getName().toLowerCase(); 
				if(!"m_boname".equals(fieldName) &&!"mrowid___".equals(fieldName)&&!"s_type".equals(fieldName)){
					countA ++;
//				System.out.println(field[i].getName().substring(2).toLowerCase());
					try {
						if(field[i].get(clazz) instanceof String){
							String obj = (String) field[i].get(clazz);
							mapA.put(field[i].getName().substring(2).toLowerCase(),field[i].getType().getSimpleName());
						}
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
			}
			Object data = java.lang.reflect.Array.newInstance(clazz, 1);
			System.out.println(data);
			for (int i = 0; i < methods.length; i++) {
				String methodName = methods[i].getName().toLowerCase();
				if(methodName.startsWith("set") && !"setobjecttype".equals(methodName) && !methodName.endsWith("null")){
					countB ++;
//				System.out.println(methodName.substring(3).toLowerCase());
//				mapA.get(methodName.substring(3).toLowerCase()).equals("String");
					 if (methods[i].getParameterTypes()[0] == String.class){
						 methods[i].invoke(objBo,"HHH");
					 }if (methods[i].getParameterTypes()[0] == Long.class) {
//					 methods[i].getParameterTypes()[0];
						 methods[i].invoke(objBo,121212L);
					 }else if (methods[i].getParameterTypes()[0] == Timestamp.class) {
//					 methods[i].getParameterTypes()[0];
						 methods[i].invoke(objBo,new Timestamp(System.currentTimeMillis()));
					 }
//				lsB.add(methodName.substring(2));
//				lsB.add(methodName);
				}
			}
			System.out.println("--------------------------------------------------");
			Iterator<String> itB  = lsB.iterator();
			while(itB.hasNext()){
				System.out.println(itB.next());
			}
			InsUesrPO bean = (InsUesrPO) objBo;
//		System.out.println(bean.getState());
			System.out.println(countA +" --- "+countB);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NegativeArraySizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
