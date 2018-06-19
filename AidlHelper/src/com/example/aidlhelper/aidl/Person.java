package com.example.aidlhelper.aidl;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {

	private String name;

	private int age;

	// ---> 注意：以下通过aidl传输实体类数据模板写法，没有为什么
	// 必须提供一个名为CREATOR的static final属性 该属性需要实现android.os.Parcelable.Creator<T>接口
	public static final Parcelable.Creator<Person> CREATOR = new Parcelable.Creator<Person>() {

		@Override
		public Person createFromParcel(Parcel in) {
			return new Person(in);
		}

		@Override
		public Person[] newArray(int size) {
			return new Person[size];
		}
	};
	
	public Person(){};

	private Person(Parcel in) {
		readFromParcel(in);
	}

	// 注意读取变量和写入变量的顺序应该一致 不然得不到正确的结果
	public void readFromParcel(Parcel in) {
		name = in.readString();
		age = in.readInt();
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel out, int flags) {
		out.writeString(name);
		out.writeInt(age);		
	}
	// --->

	/* 自动生成的内容 。Eclipse中快捷键alt+shift+s,然后Generate Getters and Setters*/ 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
