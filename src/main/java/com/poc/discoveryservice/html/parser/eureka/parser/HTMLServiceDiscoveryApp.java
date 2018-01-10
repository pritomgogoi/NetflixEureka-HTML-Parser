package com.poc.discoveryservice.html.parser.eureka.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author by Pritom Gogoi
 */
public class HTMLServiceDiscoveryApp {

    public static void main(String[] args) {
        final HTMLServiceDiscoveryApp discoveryService = new HTMLServiceDiscoveryApp();
        final String eurekaEndpoint = "http://eureka.something.com";
        System.out.println(discoveryService.findIpFromServiceName("AppName", eurekaEndpoint));

    }

    private String findIpFromServiceName(final String serviceName, final String eurekaEndpoint) {

        final Document doc;
        final Map<String, String> map = new HashMap<>();
        try {

            doc = Jsoup.connect(eurekaEndpoint).get();

            final Element table = doc.select("table").get(0);
            final Elements rows = table.select("tr");

            rows.stream().forEach(row -> {
                Elements cols = row.select("td");
                Elements links = row.select("a[href]");
                links.stream().forEach(link -> {
                    map.put(String.valueOf(cols.get(0)).replace("<td><b>", "").replace("</b></td>", ""), link.attr("href"));
                });

            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map.entrySet().stream().filter(m -> serviceName.equals(m.getKey())).map(m1 -> m1.getValue()).collect(Collectors.joining());
    }
}
