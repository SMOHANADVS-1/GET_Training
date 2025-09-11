package collectionsdemo;

public class Sample <T>{ //parameterized class /generic class/generics T- Type
	private T data;
	
	public Sample(T data)
	{
		this.data = data;
	}
	
	public T getData()
	{
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	

}
