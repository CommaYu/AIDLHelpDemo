/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\Users\\ysc\\workspace\\Listner_eclipse\\AidlHelper\\src\\com\\example\\aidlhelper\\aidl\\IPersonAidl.aidl
 */
package com.example.aidlhelper.aidl;
public interface IPersonAidl extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.example.aidlhelper.aidl.IPersonAidl
{
private static final java.lang.String DESCRIPTOR = "com.example.aidlhelper.aidl.IPersonAidl";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.example.aidlhelper.aidl.IPersonAidl interface,
 * generating a proxy if needed.
 */
public static com.example.aidlhelper.aidl.IPersonAidl asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.example.aidlhelper.aidl.IPersonAidl))) {
return ((com.example.aidlhelper.aidl.IPersonAidl)iin);
}
return new com.example.aidlhelper.aidl.IPersonAidl.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_dealPersonFromServer:
{
data.enforceInterface(DESCRIPTOR);
com.example.aidlhelper.aidl.Person _arg0;
if ((0!=data.readInt())) {
_arg0 = com.example.aidlhelper.aidl.Person.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _result = this.dealPersonFromServer(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.example.aidlhelper.aidl.IPersonAidl
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public java.lang.String dealPersonFromServer(com.example.aidlhelper.aidl.Person person) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((person!=null)) {
_data.writeInt(1);
person.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_dealPersonFromServer, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_dealPersonFromServer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public java.lang.String dealPersonFromServer(com.example.aidlhelper.aidl.Person person) throws android.os.RemoteException;
}
