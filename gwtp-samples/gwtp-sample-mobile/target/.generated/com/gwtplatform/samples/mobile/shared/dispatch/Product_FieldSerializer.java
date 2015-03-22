package com.gwtplatform.samples.mobile.shared.dispatch;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Product_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native int getFlags(com.gwtplatform.samples.mobile.shared.dispatch.Product instance) /*-{
    return instance.@com.gwtplatform.samples.mobile.shared.dispatch.Product::flags;
  }-*/;
  
  private static native void setFlags(com.gwtplatform.samples.mobile.shared.dispatch.Product instance, int value) 
  /*-{
    instance.@com.gwtplatform.samples.mobile.shared.dispatch.Product::flags = value;
  }-*/;
  
  private static native int getId(com.gwtplatform.samples.mobile.shared.dispatch.Product instance) /*-{
    return instance.@com.gwtplatform.samples.mobile.shared.dispatch.Product::id;
  }-*/;
  
  private static native void setId(com.gwtplatform.samples.mobile.shared.dispatch.Product instance, int value) 
  /*-{
    instance.@com.gwtplatform.samples.mobile.shared.dispatch.Product::id = value;
  }-*/;
  
  private static native java.lang.String getName(com.gwtplatform.samples.mobile.shared.dispatch.Product instance) /*-{
    return instance.@com.gwtplatform.samples.mobile.shared.dispatch.Product::name;
  }-*/;
  
  private static native void setName(com.gwtplatform.samples.mobile.shared.dispatch.Product instance, java.lang.String value) 
  /*-{
    instance.@com.gwtplatform.samples.mobile.shared.dispatch.Product::name = value;
  }-*/;
  
  private static native java.lang.String getPrice(com.gwtplatform.samples.mobile.shared.dispatch.Product instance) /*-{
    return instance.@com.gwtplatform.samples.mobile.shared.dispatch.Product::price;
  }-*/;
  
  private static native void setPrice(com.gwtplatform.samples.mobile.shared.dispatch.Product instance, java.lang.String value) 
  /*-{
    instance.@com.gwtplatform.samples.mobile.shared.dispatch.Product::price = value;
  }-*/;
  
  private static native int getQuantity(com.gwtplatform.samples.mobile.shared.dispatch.Product instance) /*-{
    return instance.@com.gwtplatform.samples.mobile.shared.dispatch.Product::quantity;
  }-*/;
  
  private static native void setQuantity(com.gwtplatform.samples.mobile.shared.dispatch.Product instance, int value) 
  /*-{
    instance.@com.gwtplatform.samples.mobile.shared.dispatch.Product::quantity = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.gwtplatform.samples.mobile.shared.dispatch.Product instance) throws SerializationException {
    setFlags(instance, streamReader.readInt());
    setId(instance, streamReader.readInt());
    setName(instance, streamReader.readString());
    setPrice(instance, streamReader.readString());
    setQuantity(instance, streamReader.readInt());
    
  }
  
  public static com.gwtplatform.samples.mobile.shared.dispatch.Product instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.gwtplatform.samples.mobile.shared.dispatch.Product();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.gwtplatform.samples.mobile.shared.dispatch.Product instance) throws SerializationException {
    streamWriter.writeInt(getFlags(instance));
    streamWriter.writeInt(getId(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getPrice(instance));
    streamWriter.writeInt(getQuantity(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.gwtplatform.samples.mobile.shared.dispatch.Product_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.gwtplatform.samples.mobile.shared.dispatch.Product_FieldSerializer.deserialize(reader, (com.gwtplatform.samples.mobile.shared.dispatch.Product)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.gwtplatform.samples.mobile.shared.dispatch.Product_FieldSerializer.serialize(writer, (com.gwtplatform.samples.mobile.shared.dispatch.Product)object);
  }
  
}
