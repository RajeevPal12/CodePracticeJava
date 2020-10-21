package com.st.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.st.service.Course;
import com.st.service.Employee;
import com.st.service.MyComparator;
import com.st.service.Sort2DArray;
import com.st.service.Sort2DArray.SortingOrder;

public class Test {

	public static void main(String[] args) {
		/*Employee[] arr=new Employee[4];
		arr[0]=new Employee(100,"rajeev");
		arr[1]=new Employee(104,"sankalp");
		arr[2]=new Employee(102,"pramode");
		arr[3]=new Employee(103,"kamlesh");
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr,new Employee.NameComparator());	
		System.out.println(Arrays.toString(arr));*/
		
		// How to Sort Object Array in Java using Comparator and Comparable
        /*Course[] courses = new Course[4];
        courses[0] = new Course(101, "Java", 200);
        courses[1] = new Course(201, "Ruby", 300);
        courses[2] = new Course(301, "Python", 400);
        courses[3] = new Course(401, "Scala", 500);
       
        System.out.println("Object array before sorting : " + Arrays.toString(courses));
        Arrays.sort(courses);
        System.out.println("Object array after sorting in natural order : " + Arrays.toString(courses));
       
        Arrays.sort(courses, new Course.PriceComparator());
        System.out.println("Object array after sorting by price : " + Arrays.toString(courses));
       
        Arrays.sort(courses, new Course.NameComparator());
        System.out.println("Object array after sorting by name : " + Arrays.toString(courses));*/

		// How to sort two dimensional array in Java on first column, increasing order
        /*Integer[][] numbers = { {9, 6, 5}, {3, 2, 4}, {1, 5, 7} };
        System.out.println(Arrays.deepToString(numbers));
        for(int i=0;i<3;i++)
        	Arrays.sort(numbers,new Sort2DArray.ColumnComparator(i, SortingOrder.ASCENDING));
        System.out.println(Arrays.deepToString(numbers));*/
		Integer[][] numbers = { {9, 6, 5}, 
								{3, 2, 4}, 
								{1, 5, 7} 
							  };
        System.out.println("Two dimensional array before sorting : " + Arrays.deepToString(numbers));
        Arrays.sort(numbers, new Sort2DArray.ColumnComparator(0, SortingOrder.ASCENDING));
        System.out.println("2D array after sorting in ascending order on first column : " + Arrays.deepToString(numbers));
       
        // sorting 2D array on second column in descending order
        Arrays.sort(numbers, new Sort2DArray.ColumnComparator(1,SortingOrder.DESCENDING));
        System.out.println("Sorting two dimensional String array in Java, Second column, descending order : " + Arrays.deepToString(numbers));

	}
}
