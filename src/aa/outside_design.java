package aa;
import java.io.IOException;

import jpcap.JpcapCaptor;
import jpcap.JpcapSender;
import jpcap.JpcapWriter;
import jpcap.NetworkInterface;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.client.methods.HttpPost;

public class outside_design {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
/*
		NetworkInterface[] networkinterfaces=JpcapCaptor.getDeviceList();
		int i=0;
		while(i<networkinterfaces.length){
		System.out.println("datalink_description:"+networkinterfaces[i].datalink_description);
		System.out.println("datalink_name:"+networkinterfaces[i].datalink_name);
		System.out.println("description:"+networkinterfaces[i].description);
		System.out.println("name:"+networkinterfaces[i].name);
		System.out.print("mac_address:");
		for (byte b : networkinterfaces[i].mac_address)
		    System.out.print(Integer.toHexString(b&0xff) + ":");
		  System.out.println();
		  i++;
		}
		 System.out.println(); System.out.println(); System.out.println();
		try{
			i=0;
			JpcapCaptor captor=JpcapCaptor.openDevice(networkinterfaces[0], 65533, false, 20);
			captor.setFilter("ip",true);
			JpcapSender sender=JpcapSender.openDevice(networkinterfaces[0]);
			JpcapWriter writer=JpcapWriter.openDumpFile(captor, "e:\\1.txt");
			while(i<50){
				captor.processPacket(5, new capture_process(writer));	
			i++;
			}
			writer.close();
			captor.close();
		}catch(IOException ee){ee.printStackTrace();}
*/
		
		HttpClient client= new DefaultHttpClient();
		HttpPost post= new HttpPost("http://www.enigmagroup.org/missions/programming/1/");
		
	}

}
