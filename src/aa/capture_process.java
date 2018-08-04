package aa;

import java.io.UnsupportedEncodingException;

import jpcap.packet.*;
import jpcap.JpcapWriter;
import jpcap.PacketReceiver;


public class capture_process implements PacketReceiver {

	JpcapWriter writer;
	public capture_process(JpcapWriter writer)
	{
		this.writer=writer;
	}
	public void receivePacket(Packet p)
	{
		
		System.out.println("caplen:"+p.caplen);
		System.out.println("len:"+p.len);
		
		System.out.println("data:"+String.valueOf(p.data));
		System.out.println("header:"+String.valueOf(p.header));
		
		System.out.println("info:"+p.toString());
		System.out.println("datalink:"+p.datalink);
		System.out.println("sec:"+p.sec);
		System.out.println("usec:"+p.usec);
		System.out.println("text:"+"data".getBytes()+"-"+"data".getBytes());
		
		System.out.println(); System.out.println(); System.out.println();
		writer.writePacket(p);
	}
}
