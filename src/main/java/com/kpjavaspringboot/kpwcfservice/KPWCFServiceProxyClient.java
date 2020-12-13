package com.kpjavaspringboot.kpwcfservice;


import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class KPWCFServiceProxyClient {

	public KPWCFServiceProxyClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getData();
		getDataUsingDataContract();
		sendAttachment();
	}
	
	public static void getData() {
		//http://localhost/KPWCFService/KPWCFService.svc
		//http://tempuri.org/IKPWCFService/GetData
		String wsURL = "http://localhost/KPWCFService/KPWCFService.svc/KPWCFSOAPService";
		//String wsURL = "http://localhost/KPWCFService/KPWCFService.svc";
		URL url = null;
		URLConnection connection = null;
		HttpURLConnection httpConn = null;
		String responseString = null;
		String outputString = "";
		ByteArrayOutputStream bout = null;		
		OutputStream out = null;
		InputStreamReader isr = null;
		BufferedReader in = null;
	
	
		String xmlInput = 
				"<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" "
				+ "xmlns:SOAP-ENC=\"http://schemas.xmlsoap.org/soap/encoding/\" "
				+ "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" "
				+ "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">\r\n"
				+ "	<SOAP-ENV:Body>\r\n"
				+ "		<m:GetData xmlns:m=\"http://tempuri.org/\">\r\n"
				+ "			<m:value>9310527</m:value>\r\n"
				+ "		</m:GetData>\r\n"
				+ "	</SOAP-ENV:Body>\r\n"
				+ "</SOAP-ENV:Envelope>";
		
		
		try {
			url = new URL(wsURL);
			connection = url.openConnection();
			httpConn =  (HttpURLConnection) connection;
			
			byte[] buffer = new byte[xmlInput.length()];
			buffer = xmlInput.getBytes();
			
			String SOAPAction = "http://tempuri.org/IKPWCFService/GetData";
			//Set the appropriate HTTP Parameters.
			httpConn.setRequestProperty("Content-Length", String.valueOf(buffer.length));
			httpConn.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
			httpConn.setRequestProperty("SOAPAction", SOAPAction);
			httpConn.setRequestMethod("POST");
			httpConn.setDoInput(true);
			httpConn.setDoOutput(true);
			out = httpConn.getOutputStream();
			out.write(buffer);			
			System.out.println("KP : KPWCFWebService Request : \n" + out.toString());
			out.close();
			
			//Read the response and write it to the Standard I/O
			isr = new InputStreamReader(httpConn.getInputStream());
			in = new BufferedReader(isr);
			while((responseString = in.readLine()) != null) {
				outputString = outputString + responseString;				
			}
			System.out.println("");
			System.out.println("KP : KPWCFWebService Response : \n" + outputString.toString());
			System.out.println("");
			
			//Get the response from the Web Service Call
			Document document = parseXmlFile(outputString);
			
			NodeList nodeLst = document.getElementsByTagName("GetDataResult");
			String webServiceResponse = nodeLst.item(0).getTextContent();
			System.out.println("KP : KPWCFWebService Response : " + webServiceResponse);
			
		}
		catch(Exception ex) {ex.printStackTrace();}
		
		
		
	}

	public static void getDataUsingDataContract() {
		//http://localhost/KPWCFService/KPWCFService.svc
		//http://tempuri.org/IKPWCFService/GetData
		String wsURL = "http://localhost/KPWCFService/KPWCFService.svc/KPWCFSOAPService";
		//String wsURL = "http://localhost/KPWCFService/KPWCFService.svc";
		URL url = null;
		URLConnection connection = null;
		
		HttpURLConnection httpConn = null;
		String responseString = null;
		String outputString = "";
		ByteArrayOutputStream bout = null;		
		OutputStream out = null;
		InputStreamReader isr = null;
		BufferedReader in = null;
		
		String xmlInput = 
				"<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:SOAP-ENC=\"http://schemas.xmlsoap.org/soap/encoding/\" "
				+ "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:m0=\"http://schemas.datacontract.org/2004/07/KPWCFService\">\r\n"
				+ "		<SOAP-ENV:Body>\r\n"
				+ "			<m:GetDataUsingDataContract xmlns:m=\"http://tempuri.org/\">\r\n"
				+ "				<m:composite>\r\n"
				+ "					<m0:BoolValue>true</m0:BoolValue>\r\n"
				+ "					<m0:StringValue>KP : Eclipse Java WCF Service Web Client DataContract : 12/13/2020 10:00AM EST </m0:StringValue>\r\n"
				+ "				</m:composite>\r\n"
				+ "			</m:GetDataUsingDataContract>\r\n"
				+ "		</SOAP-ENV:Body>\r\n"
				+ "	</SOAP-ENV:Envelope>";
		
		try {
			url = new URL(wsURL);
			connection = url.openConnection();
			httpConn =  (HttpURLConnection) connection;
			
			byte[] buffer = new byte[xmlInput.length()];
			buffer = xmlInput.getBytes();
			
			String SOAPAction = "http://tempuri.org/IKPWCFService/GetDataUsingDataContract";
			//Set the appropriate HTTP Parameters.
			httpConn.setRequestProperty("Content-Length", String.valueOf(buffer.length));
			httpConn.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
			httpConn.setRequestProperty("SOAPAction", SOAPAction);
			httpConn.setRequestMethod("POST");
			httpConn.setDoInput(true);
			httpConn.setDoOutput(true);
			out = httpConn.getOutputStream();
			out.write(buffer);			
			System.out.println("KP : KPWCFWebService Request : \n" + out.toString());
			out.close();
			
			//Read the response and write it to the Standard I/O
			isr = new InputStreamReader(httpConn.getInputStream());
			in = new BufferedReader(isr);
			while((responseString = in.readLine()) != null) {
				outputString = outputString + responseString;				
			}
			System.out.println("");
			System.out.println("KP : KPWCFWebService Response : \n" + outputString.toString());
			System.out.println("");
			
			//Get the response from the Web Service Call
			Document document = parseXmlFile(outputString);
			
			NodeList nodeLst = document.getElementsByTagName("GetDataUsingDataContractResult");
			String webServiceResponse = nodeLst.item(0).getTextContent();
			System.out.println("KP : KPWCFWebService Response : " + webServiceResponse);
			
		}
		catch(Exception ex) {ex.printStackTrace();}					
	}

	public static void sendAttachment() {
		//http://localhost/KPWCFService/KPWCFService.svc
		//http://tempuri.org/IKPWCFService/GetData
		String wsURL = "http://localhost/KPWCFService/KPWCFService.svc/KPWCFSOAPService";
		//String wsURL = "http://localhost/KPWCFService/KPWCFService.svc";
		URL url = null;
		URLConnection connection = null;
		
		HttpURLConnection httpConn = null;
		String responseString = null;
		String outputString = "";
		ByteArrayOutputStream bout = null;		
		OutputStream out = null;
		InputStreamReader isr = null;
		BufferedReader in = null;
		
		String xmlInput = 
					"<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:SOAP-ENC=\"http://schemas.xmlsoap.org/soap/encoding/\" "
					+ "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">\r\n"
					+ "	<SOAP-ENV:Body>\r\n"
					+ "		<m:SendAttachment xmlns:m=\"http://tempuri.org/\">\r\n"
					+ "			<m:pFileBytes>UjBsR09EbGhjZ0dTQUxNQUFBUUNBRU1tQ1p0dU1GUXhEUzhi</m:pFileBytes>\r\n"
					+ "			<m:pFileName>KPEclipseJavaWCFSendAttachment.txt</m:pFileName>\r\n"
					+ "		</m:SendAttachment>\r\n"
					+ "	</SOAP-ENV:Body>\r\n"
					+ "</SOAP-ENV:Envelope>";
		
		try {
			url = new URL(wsURL);
			connection = url.openConnection();
			httpConn =  (HttpURLConnection) connection;
			
			byte[] buffer = new byte[xmlInput.length()];
			buffer = xmlInput.getBytes();
			
			String SOAPAction = "http://tempuri.org/IKPWCFService/SendAttachment";
			//Set the appropriate HTTP Parameters.
			httpConn.setRequestProperty("Content-Length", String.valueOf(buffer.length));
			httpConn.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
			httpConn.setRequestProperty("SOAPAction", SOAPAction);
			httpConn.setRequestMethod("POST");
			httpConn.setDoInput(true);
			httpConn.setDoOutput(true);
			out = httpConn.getOutputStream();
			out.write(buffer);			
			System.out.println("KP : KPWCFWebService Request : \n" + out.toString());
			out.close();
			
			//Read the response and write it to the Standard I/O
			isr = new InputStreamReader(httpConn.getInputStream());
			in = new BufferedReader(isr);
			while((responseString = in.readLine()) != null) {
				outputString = outputString + responseString;				
			}
			System.out.println("");
			System.out.println("KP : KPWCFWebService Response : \n" + outputString.toString());
			System.out.println("");
			
			//Get the response from the Web Service Call
			Document document = parseXmlFile(outputString);
			
			NodeList nodeLst = document.getElementsByTagName("SendAttachmentResult");
			String webServiceResponse = nodeLst.item(0).getTextContent();
			System.out.println("KP : KPWCFWebService Response : " + webServiceResponse);
			
		}
		catch(Exception ex) {ex.printStackTrace();}					
	}
	
	private static Document parseXmlFile(String in) {
		// TODO Auto-generated method stub
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			InputSource is = new InputSource(new StringReader(in));
			
			return db.parse(is);
		}
		catch(ParserConfigurationException ex) {throw new RuntimeException(ex);}
		catch(SAXException ex) {throw new RuntimeException(ex);}
		catch(IOException ex) {throw new RuntimeException(ex);}
		catch(Exception ex) {ex.printStackTrace();}
	
		return null;
	}

}
