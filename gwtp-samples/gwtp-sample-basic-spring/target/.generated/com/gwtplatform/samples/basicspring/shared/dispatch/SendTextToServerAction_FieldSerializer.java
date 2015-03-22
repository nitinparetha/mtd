package com.gwtplatform.samples.basicspring.shared.dispatch;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class SendTextToServerAction_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getTextToServer(com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerAction instance) /*-{
    return instance.@com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerAction::textToServer;
  }-*/;
  
  private static native void setTextToServer(com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerAction instance, java.lang.String value) 
  /*-{
    instance.@com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerAction::textToServer = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerAction instance) throws SerializationException {
    setTextToServer(instance, streamReader.readString());
    
    com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerAction instantiate(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerAction::new()();
  }-*/;
  
  public static void serialize(SerializationStreamWriter streamWriter, com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerAction instance) throws SerializationException {
    streamWriter.writeString(getTextToServer(instance));
    
    com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerAction_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerAction_FieldSerializer.deserialize(reader, (com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerAction)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerAction_FieldSerializer.serialize(writer, (com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerAction)object);
  }
  
}
