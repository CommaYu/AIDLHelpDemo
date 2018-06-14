package com.example.aidlserver;

import com.example.aidlhelper.aidl.IPersonAidl;
import com.example.aidlhelper.aidl.IPersonAidl.Stub;
import com.example.aidlhelper.aidl.Person;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class AidlService extends Service{

	IPersonAidl.Stub stub = new Stub() {
		
		@Override
		public String dealPersonFromServer(Person person) throws RemoteException {
			String str = "hello,"+person.getName();
			switch (person.getAge()) {
			case 18:
				str = str + ", you'are 18";
				break;

			case 20:
				str = str + ", you'are 20";
				break;
			default:
				break;
			}
			return str;
		}
	};
	
	@Override
	public IBinder onBind(Intent arg0) {
		return stub;
	}

}
