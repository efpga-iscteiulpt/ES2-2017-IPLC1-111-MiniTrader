package mt.server;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import mt.comm.ServerComm;

/**
 * The server is responsible for matching orders from clients and for keeping clients up to date with unfulfilled orders.
 * 
 * @author alc
 *
 */

public interface MicroTraderServer {
	/**
	 * Starts the server. Should only exit when the server quits.
	 * 
	 * @param serverComm the object through which all communication with clients should take place.
	 */
	
	public void start(ServerComm serverComm);


}
