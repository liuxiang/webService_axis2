
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package com.chinatelecom.ismp.sp.req;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://req.sp.ismp.chinatelecom.com".equals(namespaceURI) &&
                  "NotifyManagementInfoReq".equals(typeName)){
                   
                            return  com.chinatelecom.ismp.sp.req.NotifyManagementInfoReq.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://rsp.sp.ismp.chinatelecom.com".equals(namespaceURI) &&
                  "NotifyManagementInfoRsp".equals(typeName)){
                   
                            return  com.chinatelecom.ismp.sp.rsp.NotifyManagementInfoRsp.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://req.sp.ismp.chinatelecom.com".equals(namespaceURI) &&
                  "ServiceConsumeNotifyReq".equals(typeName)){
                   
                            return  com.chinatelecom.ismp.sp.req.ServiceConsumeNotifyReq.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://rsp.sp.ismp.chinatelecom.com".equals(namespaceURI) &&
                  "Response".equals(typeName)){
                   
                            return  com.chinatelecom.ismp.sp.rsp.Response.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://req.sp.ismp.chinatelecom.com".equals(namespaceURI) &&
                  "OrderRelationUpdateNotifyReq".equals(typeName)){
                   
                            return  com.chinatelecom.ismp.sp.req.OrderRelationUpdateNotifyReq.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    