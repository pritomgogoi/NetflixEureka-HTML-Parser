package com.poc.discoveryservice.html.parser.eureka.parser;


import com.poc.discoveryservice.html.parser.eureka.model.Application;
import com.poc.discoveryservice.html.parser.eureka.model.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;

/**
 * @author by Pritom Gogoi
 */
public class XMLServiceDiscoveryApp {

    public static void main(String[] args) throws IOException, JAXBException {

        final String link = "http://eureka.something.com";;
        final URL url = new URL(link);
        final HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("Accept-Encoding", "gzip");

        final Reader reader;
        if ("gzip".equals(con.getContentEncoding())) {
            reader = new InputStreamReader(new GZIPInputStream(con.getInputStream()));
        } else {
            reader = new InputStreamReader(con.getInputStream());
        }

        final JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
        final Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        final Application application = (Application) jaxbUnmarshaller.unmarshal(reader);

        final Application.Instance amazonInstance = application.getInstance().stream().
                filter(instance -> "Amazon".equals(instance.getDataCenterInfo().getName())).findAny().get();

        System.out.println(amazonInstance.getIpAddr());
    }
}
