import  java.applet.Applet;
import  java.awt.Graphics;

public class applet1 extends Applet{
	public void paint(Graphics g) {
  
  g.drawString("Hello World !", 10, 30);
 }
}

<html>
 
<head>
<title>Hello World Applet</title>
</head>
 
<body>
 <applet code="HelloWorld.class" width="200" height="200">
 </applet>
</body>
 
</html>