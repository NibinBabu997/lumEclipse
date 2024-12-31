package oops;

interface Whatsapp
{
	void call();
	void muted();
	void disconnect();
}
class Audiocall implements Whatsapp
{

	@Override
	public void call() {
		System.out.println("Whatsapp audio call");
		
	}

	@Override
	public void muted() {
		System.out.println("Audio call muted");

		
	}

	@Override
	public void disconnect() {
		System.out.println("Audio call disconnected");
		
	}
	
}
class Videocall implements Whatsapp
{

	@Override
	public void call() {
		System.out.println("Whatsapp Video call ");
	}

	@Override
	public void muted() {
		System.out.println("video call muted");
		
	}

	@Override
	public void disconnect() {
		
		System.out.println("video call disconnected");

	}
	
}
public class Interfaces {

	public static void main(String[] args) {
		Audiocall a=new Audiocall();
		Videocall v=new Videocall();
		a.call();
		a.muted();
		a.disconnect();
		v.call();
		v.muted();
		v.disconnect();
		Whatsapp ob=new Audiocall();
		ob.call();
		ob.muted();
		ob.disconnect();
		ob=new Videocall();
		ob.call();
		ob.muted();
		ob.disconnect();
		
	}

}
