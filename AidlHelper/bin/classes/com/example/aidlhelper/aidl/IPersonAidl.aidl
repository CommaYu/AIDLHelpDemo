package com.example.aidlhelper.aidl;

import com.example.aidlhelper.aidl.Person;

interface IPersonAidl {
	String dealPersonFromServer(in Person person);
}