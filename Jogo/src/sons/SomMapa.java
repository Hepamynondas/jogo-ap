package sons;

import java.net.URL;
import java.applet.Applet;
import java.applet.AudioClip;
import javax.swing.JButton;


public class SomMapa   {
	
	//n�o sei pq n�o funciona sem esse JButton
	JButton tocar= new JButton ("mapa");

	//construtor chamando o metodo
	public void TocarSom()
	{
	play("SomMapa");}
	
	
	//metodo
	public void play (String nome)
	{URL url= SomMapa.class.getResource(nome+".wav");
	@SuppressWarnings("deprecation")
	AudioClip audio = Applet.newAudioClip(url);
	audio.play();}
	
	public static void main(String[] args)
	{SomMapa a1=new SomMapa();
	a1.TocarSom();

	
	}}