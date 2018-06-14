/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\Users\\ysc\\workspace\\Listner_eclipse\\AidlHelper\\src\\com\\example\\aidlhelper\\aidl\\IDemoAidl.aidl
 */
package com.example.aidlhelper.aidl;
public interface IDemoAidl extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.example.aidlhelper.aidl.IDemoAidl
{
private static final java.lang.String DESCRIPTOR = "com.example.aidlhelper.aidl.IDemoAidl";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.example.aidlhelper.aidl.IDemoAidl interface,
 * generating a proxy if needed.
 */
public static com.example.aidlhelper.aidl.IDemoAidl asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.example.aidlhelper.aidl.IDemoAidl))) {
return ((com.example.aidlhelper.aidl.IDemoAidl)iin);
}
return new com.example.aidlhelper.aidl.IDemoAidl.Stub.Proxy(obj);
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
case TRANSACTION_xxoo:
{
data.enforceInterface(DESCRIPTOR);
this.xxoo();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.example.aidlhelper.aidl.IDemoAidl
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
@Override public void xxoo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_xxoo, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_xxoo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void xxoo() throws android.os.RemoteException;
}
