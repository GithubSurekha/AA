package Sample;
interface WebDriver{
	public void openApp();
	public void closeApp();
}

class FirefoxDriver implements WebDriver{
	public void openApp(){
		System.out.println("Firefox Open");
		
	}
	public void closeApp() {
		System.out.println("Firefox Close");
	}
}
public class ChromeDriver implements WebDriver{

	public void openApp() {
		System.out.println("Chrome Open");
	}
	public void closeApp() {
		System.out.println("Chrome close");
	}
	public static void main(String args[]) {
		FirefoxDriver fd=new FirefoxDriver();
		fd.openApp();
		fd.closeApp();
		
		ChromeDriver cd=new ChromeDriver();
		cd.openApp();
		cd.closeApp();
		System.out.println("==========");
		
		WebDriver wd=new ChromeDriver();
		wd.openApp();
		wd.closeApp();
		
		WebDriver wd1=new FirefoxDriver();
		wd1.openApp();
		wd1.closeApp();
	}
}
