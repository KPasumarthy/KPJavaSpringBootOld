package com.kpjavaspringboot.jaxws;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlMimeType;

@WebService(endpointInterface = "com.kpjavaspringboot.jaxws.FileManager", 
	serviceName = "FileManager")
public class FileManagerImpl implements FileManager {

	private Path path = Paths.get("C:\\Users\\admin\\eclipse-workspace\\KPJavaSpringBoot\\src\\main\\WebApp\\images\\KPFile.jpeg");
	
	@Override
	@WebMethod
	public void uploadFile(DataHandler file) {

		try (InputStream input = file.getInputStream();
				OutputStream output = new FileOutputStream(
						new File(path.toString()));) {
			
			byte[] b = new byte[100000];
			int bytesRead = 0;
			while ((bytesRead = input.read(b)) != -1) {
				output.write(b, 0, bytesRead);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	@WebMethod
	public  @XmlMimeType("application/octet-stream")
	DataHandler downloadFile() {

		DataSource dataSource = new FileDataSource(
				new File(path.toString()));
		return new DataHandler(dataSource);

	}

}
