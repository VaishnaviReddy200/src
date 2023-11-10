package patternofname;
class Gen <T>
{
	T ref;
	
	public Gen(T ref)
	{
		this.ref=ref;
	}
	public void display()
	{
		System.out.println("type of Gen "+ref.getClass().getName());
	}
	public T getRef()
	{
		return ref;
	}
}
public class Generic2 {

	public static void main(String[] args) 
	{
		Gen gen=new Gen<>("sting");
		gen.display();
		System.out.println(gen.getRef());

	}

}
