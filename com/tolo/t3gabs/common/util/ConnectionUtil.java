package com.tolo.t3gabs.common.util;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.tolo.t3gabs.server.service.ServerContext;

public class ConnectionUtil {

	private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();

	public static void beginTransaction() throws Exception {
		getCurrentConnection().setAutoCommit(false);
	}

	public static void commitTransaction() throws Exception {
		getCurrentConnection().commit();
		closeCurrentConnection();
	}

	public static Connection getCurrentConnection()throws Exception {
		Connection con = tl.get();
		if (con == null) {
			con = getConnection();
			tl.set(con);
		}
		return con;

	}
	
	/**
	 * 根据databses.xml配置文件的参数来建立连接
	 * @return
	 * @throws Exception
	 */
	private static Connection getConnection()throws Exception{
		String driverClass = null;
		String url = null;
		String userName = null;
		String password = null;

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setValidating(true);
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(new File("config//databases.xml"));
		Element root = doc.getDocumentElement();
		NodeList list = root.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			Node n = list.item(i);
			if (n.getNodeType() == Node.ELEMENT_NODE) {
				Element ele = (Element) n;
				if (ele.getAttribute("name").equals(ServerContext.getDatabaseName())) {
					NodeList eList = ele.getChildNodes();
					for (int j = 0; j < eList.getLength(); j++) {
						Node nTemp = eList.item(j);
						if (nTemp.getNodeType() == Node.ELEMENT_NODE) {
							Element eTemp = (Element) nTemp;
							if (eTemp.getTagName().equals("driver_class")) {
								driverClass = eTemp.getTextContent().trim();
							} else if (eTemp.getTagName().equals("url")) {
								url = eTemp.getTextContent().trim();
							} else if (eTemp.getTagName().equals("user_name")) {
								userName = eTemp.getTextContent().trim();
							} else if (eTemp.getTagName().equals("password")) {
								password = eTemp.getTextContent().trim();
							}
						}
					}
				}
			}// outer if
		}// outer for end!

		Class.forName(driverClass);
		Connection conn = DriverManager.getConnection(url, userName, password);
		return conn;
	}

	public static void closeCurrentConnection() throws Exception {
		Connection con = tl.get();
		if (con != null) {
			con.close();
			tl.set(null);
		}
	}
}
