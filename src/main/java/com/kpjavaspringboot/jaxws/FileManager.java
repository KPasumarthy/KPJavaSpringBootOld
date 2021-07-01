package com.kpjavaspringboot.jaxws;

import javax.activation.DataHandler;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface FileManager {
	
	void uploadFile(@WebParam(name = "file") DataHandler file);

	DataHandler downloadFile();
}
