package com.test.concurrency.threadpoolexecutor;

import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

public class ConsumerProducerExampleBlockingQueue {
	
	
	public static void main(String[] args) {
		
		BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
		 Producer producer = new Producer(queue);
	     Consumer consumer = new Consumer(queue);
	     //starting producer to produce messages in queue
	     new Thread(producer).start();
	     //starting consumer to consume messages from queue
	     new Thread(consumer).start();
	     System.out.println("Producer and Consumer has been started");
		
	}
	 
	

}



class Message{
	
	private int msgId;
	private Employee empObj;
	
	public Message(int msgId, Employee empObj) {
		this.empObj=empObj;
		this.msgId=msgId;
	}
	
	public int getMsgId() {
		return msgId;
	}
	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}
	public Employee getEmpObj() {
		return empObj;
	}
	public void setEmpObj(Employee empObj) {
		this.empObj = empObj;
	}
	
	
	
}


class Producer implements Runnable{
	
	private BlockingQueue<Message> queue;
	
	Producer(BlockingQueue<Message> queue){
	
		this.queue=queue;
	}

	@Override
	public void run() {
	
		// code to create new msg each time 
		
		for (int i=0;i<10;i++)
		{
			int value=(int)(Math.random()*10);
			
			Employee emp=new Employee(value, "name"+value);
			Message msg = new Message(value, emp);
			 try {
	                Thread.sleep(100);
	                queue.put(msg);
	                System.out.println("Produced "+msg.getMsgId());
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
			
		}
	}	
}


class Consumer  implements Runnable{
	
private BlockingQueue<Message> queue;

    private Map emplMap= new ConcurrentHashMap<Employee, Integer>();
	
    Consumer(BlockingQueue<Message> queue){
		this.queue=queue;
	}

	@Override
	public void run() {
		try{
            Message msg;
            //consuming messages until exit message is received
            while((msg = queue.take()) !=null){
            Employee emp=msg.getEmpObj();
            if(emplMap.isEmpty()) {
            	emplMap.put(emp, 1);
            }
            else {
            	if(emplMap.get(emp)!=null)
            	{
            		Integer numoftimesEmployeeInserted= (Integer) emplMap.get(emp);
            		emplMap.put(emp, numoftimesEmployeeInserted+1);
            		System.out.println(emp.toString() +" is inserted is with value :"+(numoftimesEmployeeInserted+1) );
            	}else {
            		emplMap.put(emp, 1);
            	}
            }
            Thread.sleep(10);
            
            System.out.println("Consumed "+msg.getMsgId());
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
	}
}


class Employee{
	
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}




	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}




	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	} 
	
}