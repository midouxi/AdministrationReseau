/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author macbookpro
 */
@WebService(serviceName = "NewWebService")
@Stateless()
public class NewWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "executeCommand")
    public String executeCommand(@WebParam(name = "name") String command) {
        StringBuffer output = new StringBuffer();
 
		Process p;
		try {
                        command = "ping -c 3 "+command;
			p = Runtime.getRuntime().exec(command);
			p.waitFor();
			BufferedReader reader = 
                            new BufferedReader(new InputStreamReader(p.getInputStream()));
 
                        String line = "";			
			while ((line = reader.readLine())!= null) {
				output.append(line + "\n");
			}
 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return output.toString();
 
	}
    
    @WebMethod(operationName = "creerfichier")
    public void creerfichier(@WebParam(name = "result") String result) {
		String chaine="";
		String fichier ="fichiertexte.txt";
		
		//création ou ajout dans le fichier texte
				try {
					FileWriter fw = new FileWriter (fichier);
					BufferedWriter bw = new BufferedWriter (fw);
					PrintWriter fichierSortie = new PrintWriter (bw); 
						fichierSortie.println (chaine+result); 
					fichierSortie.close();
					System.out.println("Le fichier " + fichier + " a été créé!"); 
				}
				catch (Exception e){
					System.out.println(e.toString());
				}
	}
    }

