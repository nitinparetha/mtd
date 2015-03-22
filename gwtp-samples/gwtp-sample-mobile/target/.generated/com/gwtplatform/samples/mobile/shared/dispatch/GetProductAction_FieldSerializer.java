package com.gwtplatform.samples.mobile.shared.dispatch;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GetProductAction_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native int getId(com.gwtplatform.samples.mobile.shared.dispatch.GetProductAction instance) /*-{
    return instance.@com.gwtplatform.samples.mobile.shared.dispatch.GetProductAction::id;
  }-*/;
  
  private static native void setId(com.gwtplatform.samples.mobile.shared.dispatch.GetProductAction instance, int value) 
  /*-{
    instance.@com.gwtplatform.samples.mobile.shared.dispatch.GetProductAction::id = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.gwtplatform.samples.mobile.shared.dispatch.GetProductAction instance) throws SerializationException {
    setId(instance, streamReader.readInt());
    
  }
  
  public static com.gwtplatform.samples.mobile.shared.dispatch.GetProductAction instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.gwtplatform.samples.mobile.shared.dispatch.GetProductAction();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.gwtplatform.samples.mobile.shared.dispatch.GetProductAction instance) throws SerializationException {
    streamWriter.writeInt(getId(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.gwtplatform.samples.mobile.shared.dispatch.GetProductAction_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.gwtplatform.samples.mobile.shared.dispatch.GetProductAction_FieldSerializer.deserialize(reader, (com.gwtplatform.samples.mobile.shared.dispatch.GetProductAction)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.gwtplatform.samples.mobile.shared.dispatch.GetProductAction_FieldSerializer.serialize(writer, (com.gwtplatform.samples.mobile.shared.dispatch.GetProductAction)object);
  }
  
}
