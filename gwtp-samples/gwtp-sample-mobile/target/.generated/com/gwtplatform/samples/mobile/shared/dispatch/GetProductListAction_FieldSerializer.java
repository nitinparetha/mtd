package com.gwtplatform.samples.mobile.shared.dispatch;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GetProductListAction_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native int getFlags(com.gwtplatform.samples.mobile.shared.dispatch.GetProductListAction instance) /*-{
    return instance.@com.gwtplatform.samples.mobile.shared.dispatch.GetProductListAction::flags;
  }-*/;
  
  private static native void setFlags(com.gwtplatform.samples.mobile.shared.dispatch.GetProductListAction instance, int value) 
  /*-{
    instance.@com.gwtplatform.samples.mobile.shared.dispatch.GetProductListAction::flags = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.gwtplatform.samples.mobile.shared.dispatch.GetProductListAction instance) throws SerializationException {
    setFlags(instance, streamReader.readInt());
    
  }
  
  public static com.gwtplatform.samples.mobile.shared.dispatch.GetProductListAction instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.gwtplatform.samples.mobile.shared.dispatch.GetProductListAction();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.gwtplatform.samples.mobile.shared.dispatch.GetProductListAction instance) throws SerializationException {
    streamWriter.writeInt(getFlags(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.gwtplatform.samples.mobile.shared.dispatch.GetProductListAction_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.gwtplatform.samples.mobile.shared.dispatch.GetProductListAction_FieldSerializer.deserialize(reader, (com.gwtplatform.samples.mobile.shared.dispatch.GetProductListAction)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.gwtplatform.samples.mobile.shared.dispatch.GetProductListAction_FieldSerializer.serialize(writer, (com.gwtplatform.samples.mobile.shared.dispatch.GetProductListAction)object);
  }
  
}
