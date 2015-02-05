import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.chinatelecom.ismp.sp.IsmpSpEngineServiceStub;
import com.chinatelecom.ismp.sp.IsmpSpEngineServiceStub.NotifyManagementInfoReq;
import com.chinatelecom.ismp.sp.IsmpSpEngineServiceStub.NotifyManagementInfoReturn;
import com.chinatelecom.ismp.sp.IsmpSpEngineServiceStub.NotifyManagementInfoRsp;

public class StubClient {

	public static void main(String[] args) {
		IsmpSpEngineServiceStub stub = null;
		try {
			stub = new IsmpSpEngineServiceStub();

			IsmpSpEngineServiceStub.NotifyManagementInfoReqE infoReq = new IsmpSpEngineServiceStub.NotifyManagementInfoReqE();
			NotifyManagementInfoReq param=new NotifyManagementInfoReq();
			infoReq.setNotifyManagementInfoReq(param);
			NotifyManagementInfoReturn infoRsp = stub.notifyManagementInfo(infoReq);

			NotifyManagementInfoRsp infoRsp2 = infoRsp.getNotifyManagementInfoReturn();
			
			System.out.println(infoRsp2.getResultCode());
			System.out.println(infoRsp2.getStreamingNo());
			
		} catch (AxisFault e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}