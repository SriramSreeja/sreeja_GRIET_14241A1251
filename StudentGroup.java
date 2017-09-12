import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Iterator;


/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	ArrayList<Student> s=new ArrayList<Student>();
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		
		
		Student []arr = new Student[s.size()];
		

		s.toArray(arr);
		
		return arr;
	
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
				if(students!=null)
				{
		ArrayList<Student> st = new ArrayList<Student>(Arrays.asList(students));
		s.addAll(st);
		
				}
		
		
	else
	throw new IllegalArgumentException();



	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0 || index>=s.size())
				throw new IllegalArgumentException();
else
				return s.get(index);

	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		
		if(index<0 || index>=s.size() || student==null)
			throw new IllegalArgumentException();
else
				s.set(index,student);

	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student!=null)
				s.add(0,student);
			else
							throw new IllegalArgumentException();

				

	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
				if(student!=null)

						s.add(s.size(),student);
				else
							throw new IllegalArgumentException();

	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(index<0 || index>=s.size() || student==null)
			throw new IllegalArgumentException();
else
						s.add(index,student);

	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0 || index>=s.size())
			throw new IllegalArgumentException();
else
		
		s.remove(index);
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(student==null)
								throw new IllegalArgumentException();

				int n=s.indexOf(student);
				int flag=0;
				Iterator itr = s.iterator();  
				while (itr.hasNext()) 
				{ 
				int num = s.indexOf(itr.next()); 
					if (num==n) {

				itr.remove();
				flag=1;
					}
				}
				if(flag==0)
					throw new IllegalArgumentException("Student not exist");

					

	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		
		if(index<0 || index>=s.size())
			throw new IllegalArgumentException();
else
{
		Iterator itr = s.iterator();  
		while (itr.hasNext()) 
		{ 
	int num = s.indexOf(itr.next()); 
	if (num>index) {
		itr.remove();
				}

		}
}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
				if(student==null)
			throw new IllegalArgumentException();
else
{
		int n=s.indexOf(student);
		Iterator itr = s.iterator();  
		while (itr.hasNext()) 
		{ 
	int num = s.indexOf(itr.next()); 
	if (num>n) {
		itr.remove();
				}

		}	
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		
		
	if(index<0 || index>=s.size())
			throw new IllegalArgumentException();
else
{
		Iterator itr = s.iterator();  
		while (itr.hasNext()) 
		{ 
	int num = s.indexOf(itr.next()); 
	if (num<index) {
		itr.remove();
				}
		index=index-1;

		}
}	
		

	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		
		
		
		
		if(student==null)
			throw new IllegalArgumentException();
else
{
		int n=s.indexOf(student);
		Iterator itr = s.iterator();  
		while (itr.hasNext()) 
		{ 
	int num = s.indexOf(itr.next()); 
	if (num>n) {
		itr.remove();
				}
		n--;

		}	
		}
	}
		
		
		
	
	
	
	

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
