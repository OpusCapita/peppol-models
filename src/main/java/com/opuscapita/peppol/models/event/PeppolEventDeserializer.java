package com.opuscapita.peppol.models.event;

import com.google.gson.*;

import java.lang.reflect.Type;

public class PeppolEventDeserializer implements JsonDeserializer<PeppolEvent> {

    @Override
    public PeppolEvent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return fixSenderName(jsonElement);
    }

    public PeppolEvent fixSenderName(JsonElement jsonElement) {
        JsonObject rawObject = jsonElement.getAsJsonObject();
        if (!rawObject.has("senderName")) {
            rawObject.addProperty("senderName", "n/a");
        }
        return new GsonBuilder().disableHtmlEscaping().create().fromJson(rawObject, PeppolEvent.class);
    }
}
