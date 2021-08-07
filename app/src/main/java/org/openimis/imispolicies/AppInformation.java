package org.openimis.imispolicies;

 public class AppInformation {
     public static class DomainInfo {

//         URL address of openIMIS demo server => please update with your own Web Services base URL/IP
         private static String _Domain_Live = "http://154.127.8.53:8084/";//imisrest.mohz.go.tz
         private static String _Domain_Demo = "http://102.220.72.130:8083/"; //imisrest.mohz.go.tz   102.223.7.66:8084  41.216.220.141:8083

         private static final String DEFAULT_RAR_PASSWORD = ")(#$1HsD";
//)(#$1HsD https://demo.openimis.org/rest/
         public static String getDomain(){
             return _Domain_Live;
         }

         public static String getDefaultRarPassword() {
             return DEFAULT_RAR_PASSWORD;
         }

     }
}
