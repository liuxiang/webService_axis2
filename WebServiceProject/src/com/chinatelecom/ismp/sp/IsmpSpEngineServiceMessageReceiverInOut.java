
/**
 * IsmpSpEngineServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package com.chinatelecom.ismp.sp;

        /**
        *  IsmpSpEngineServiceMessageReceiverInOut message receiver
        */

        public class IsmpSpEngineServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        IsmpSpEngineServiceSkeleton skel = (IsmpSpEngineServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("orderRelationUpdateNotify".equals(methodName)){
                
                com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReturn orderRelationUpdateNotifyReturn13 = null;
	                        com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReq wrappedParam =
                                                             (com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReq)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReq.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               orderRelationUpdateNotifyReturn13 =
                                                   
                                                   
                                                         skel.orderRelationUpdateNotify(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), orderRelationUpdateNotifyReturn13, false, new javax.xml.namespace.QName("http://sp.ismp.chinatelecom.com",
                                                    "orderRelationUpdateNotify"));
                                    } else 

            if("notifyManagementInfo".equals(methodName)){
                
                com.chinatelecom.ismp.sp.NotifyManagementInfoReturn notifyManagementInfoReturn15 = null;
	                        com.chinatelecom.ismp.sp.NotifyManagementInfoReq wrappedParam =
                                                             (com.chinatelecom.ismp.sp.NotifyManagementInfoReq)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.chinatelecom.ismp.sp.NotifyManagementInfoReq.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               notifyManagementInfoReturn15 =
                                                   
                                                   
                                                         skel.notifyManagementInfo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), notifyManagementInfoReturn15, false, new javax.xml.namespace.QName("http://sp.ismp.chinatelecom.com",
                                                    "notifyManagementInfo"));
                                    } else 

            if("serviceConsumeNotify".equals(methodName)){
                
                com.chinatelecom.ismp.sp.ServiceConsumeNotifyReturn serviceConsumeNotifyReturn17 = null;
	                        com.chinatelecom.ismp.sp.ServiceConsumeNotifyReqPara wrappedParam =
                                                             (com.chinatelecom.ismp.sp.ServiceConsumeNotifyReqPara)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.chinatelecom.ismp.sp.ServiceConsumeNotifyReqPara.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               serviceConsumeNotifyReturn17 =
                                                   
                                                   
                                                         skel.serviceConsumeNotify(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), serviceConsumeNotifyReturn17, false, new javax.xml.namespace.QName("http://sp.ismp.chinatelecom.com",
                                                    "serviceConsumeNotify"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReq param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReq.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReturn param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReturn.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.chinatelecom.ismp.sp.NotifyManagementInfoReq param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.chinatelecom.ismp.sp.NotifyManagementInfoReq.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.chinatelecom.ismp.sp.NotifyManagementInfoReturn param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.chinatelecom.ismp.sp.NotifyManagementInfoReturn.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.chinatelecom.ismp.sp.ServiceConsumeNotifyReqPara param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.chinatelecom.ismp.sp.ServiceConsumeNotifyReqPara.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.chinatelecom.ismp.sp.ServiceConsumeNotifyReturn param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.chinatelecom.ismp.sp.ServiceConsumeNotifyReturn.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReturn param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReturn.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReturn wraporderRelationUpdateNotify(){
                                com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReturn wrappedElement = new com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReturn();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.chinatelecom.ismp.sp.NotifyManagementInfoReturn param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.chinatelecom.ismp.sp.NotifyManagementInfoReturn.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.chinatelecom.ismp.sp.NotifyManagementInfoReturn wrapnotifyManagementInfo(){
                                com.chinatelecom.ismp.sp.NotifyManagementInfoReturn wrappedElement = new com.chinatelecom.ismp.sp.NotifyManagementInfoReturn();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.chinatelecom.ismp.sp.ServiceConsumeNotifyReturn param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.chinatelecom.ismp.sp.ServiceConsumeNotifyReturn.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.chinatelecom.ismp.sp.ServiceConsumeNotifyReturn wrapserviceConsumeNotify(){
                                com.chinatelecom.ismp.sp.ServiceConsumeNotifyReturn wrappedElement = new com.chinatelecom.ismp.sp.ServiceConsumeNotifyReturn();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReq.class.equals(type)){
                
                           return com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReq.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReturn.class.equals(type)){
                
                           return com.chinatelecom.ismp.sp.OrderRelationUpdateNotifyReturn.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.chinatelecom.ismp.sp.NotifyManagementInfoReq.class.equals(type)){
                
                           return com.chinatelecom.ismp.sp.NotifyManagementInfoReq.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.chinatelecom.ismp.sp.NotifyManagementInfoReturn.class.equals(type)){
                
                           return com.chinatelecom.ismp.sp.NotifyManagementInfoReturn.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.chinatelecom.ismp.sp.ServiceConsumeNotifyReqPara.class.equals(type)){
                
                           return com.chinatelecom.ismp.sp.ServiceConsumeNotifyReqPara.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.chinatelecom.ismp.sp.ServiceConsumeNotifyReturn.class.equals(type)){
                
                           return com.chinatelecom.ismp.sp.ServiceConsumeNotifyReturn.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    