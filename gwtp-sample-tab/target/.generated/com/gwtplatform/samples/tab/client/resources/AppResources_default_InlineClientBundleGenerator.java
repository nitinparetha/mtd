package com.gwtplatform.samples.tab.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class AppResources_default_InlineClientBundleGenerator implements com.gwtplatform.samples.tab.client.resources.AppResources {
  private static AppResources_default_InlineClientBundleGenerator _instance0 = new AppResources_default_InlineClientBundleGenerator();
  private void logoInitializer() {
    logo = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "logo",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 50, 51, false, false
    );
  }
  private static class logoInitializer {
    static {
      _instance0.logoInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return logo;
    }
  }
  public com.google.gwt.resources.client.ImageResource logo() {
    return logoInitializer.get();
  }
  private void spritesInitializer() {
    sprites = new com.gwtplatform.samples.tab.client.resources.AppResources.Sprites() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "sprites";
      }
      public String getText() {
        return (".GBUBVKMBGI{height:" + ((AppResources_default_InlineClientBundleGenerator.this.logo()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (AppResources_default_InlineClientBundleGenerator.this.logo()).getSafeUri().asString() + "\") -" + (AppResources_default_InlineClientBundleGenerator.this.logo()).getLeft() + "px -" + (AppResources_default_InlineClientBundleGenerator.this.logo()).getTop() + "px  repeat-x")  + ";}");
      }
      public java.lang.String logo() {
        return "GBUBVKMBGI";
      }
    }
    ;
  }
  private static class spritesInitializer {
    static {
      _instance0.spritesInitializer();
    }
    static com.gwtplatform.samples.tab.client.resources.AppResources.Sprites get() {
      return sprites;
    }
  }
  public com.gwtplatform.samples.tab.client.resources.AppResources.Sprites sprites() {
    return spritesInitializer.get();
  }
  private void stylesInitializer() {
    styles = new com.gwtplatform.samples.tab.client.resources.AppResources.Styles() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "styles";
      }
      public String getText() {
        return ("html,body{width:" + ("100%")  + ";height:" + ("100%")  + ";}.GBUBVKMBHI,.GBUBVKMBII{border:" + ("1px"+ " " +"solid"+ " " +"grey")  + ";}");
      }
      public java.lang.String divBorder() {
        return "GBUBVKMBHI";
      }
      public java.lang.String logo() {
        return "GBUBVKMBII";
      }
    }
    ;
  }
  private static class stylesInitializer {
    static {
      _instance0.stylesInitializer();
    }
    static com.gwtplatform.samples.tab.client.resources.AppResources.Styles get() {
      return styles;
    }
  }
  public com.gwtplatform.samples.tab.client.resources.AppResources.Styles styles() {
    return stylesInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAzCAYAAADVY1sUAAADaElEQVR42tXaTU8TQRgH8PWmMShRAycTD/KSeDAxJhxZUBBvlkLQ0NI3+gJtaaEttFAoITQQ4kW+gB6MevHiV/CoiSGgVmOFg3AzxsSLicnj/qe2USztTrtDZyeZlN1k0/31P8/sLrOKYmALhUI0Pz9Pxe1IJELZbJZtJ5NJmpiYSODv2dnZZ4rMbXx8nKanp2lxcbEL21NTU7SyssIgsViM3G73RjqdJgAV2Zv2q9Pc3Bw70XA4TMvLy7S6ukpAYV88Hpcfgebz+dhJZzIZCgaD7DOVSlEgEGCf2KeYpQGDoTQ5OYlhRkjB4/FQNBo1DwJNq4Um/PIYZsWa0AqcMBkoZmsahvx+Py0sLDAQ6kUxa8MQQ11gNvN6vXHTQgDA9cPlcpk3DTQUOGpjZmbG3BAkkUgkWI0AZEoEitzhcLCp1+l0smuLtu+HqRBLS0vfMO2OjY2VhpVW7OzaYioIhhOGEhLBvRf22e12doFE8ZsC8a77DKGH4wUIrua7oVatX6Bdr4X1B4lEm9SIl5YrV4uQD7c7td5BHwfaSoC/uynSKEA6Sr0cZN97h6RH6IFIm8o/ELVZF0Q6TKU0qkEexYIvpEC8udlK9UCkSeUwohZIwzHlELn+S7VBiE40BLHV33paTxp6IQ1LpRyiXshO2EZSIOqFHHsqPAj0Pd+gfBjeNNBzPisXJP7nP5XiCvxGy9daIPl7KhdEeCqVEO97W46E7Fiuc0P2RGEqISqlwfqtNm7IrpQQzplLGKYaQiRkMxY5MASRU/UgOoVBDEvFiDTqhdSN0YOQHrLdc+6VLsihp0FRkJoxRqZhFOR14O4vIYjjhnCnIjNEN4YP0d4QiCuTvVYR8annLIlIowAZPL5UeBDcEM5b+ao3lYEhMgTBC8nb+wyFlE3lrdr8WCSCPVxZuwyH/IcRnUbhVv6yEMiTqH+TIfCKxX2HhXLdTWIhA+1CIKVUsDSGZeSRkREaHh4+VRpu3WceHoXY7rvIDzFwCt4PWCmvfT51DlHa56ZYMkUKlsNsNhsQVS80W73na0vjCMiBNvN89lq+7/ksG3mnlWsVC+eLjnXK0os6qqqe1HMw1gOx5KwHffhL8RYEXkpbX1837KmviPF4PD+5DsRLMaOjozj4OecXfsGqLhZC19bWNkQ8iv8GSuqQ8NQYfvMAAAAASUVORK5CYII=";
  private static com.google.gwt.resources.client.ImageResource logo;
  private static com.gwtplatform.samples.tab.client.resources.AppResources.Sprites sprites;
  private static com.gwtplatform.samples.tab.client.resources.AppResources.Styles styles;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      logo(), 
      sprites(), 
      styles(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("logo", logo());
        resourceMap.put("sprites", sprites());
        resourceMap.put("styles", styles());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'logo': return this.@com.gwtplatform.samples.tab.client.resources.AppResources::logo()();
      case 'sprites': return this.@com.gwtplatform.samples.tab.client.resources.AppResources::sprites()();
      case 'styles': return this.@com.gwtplatform.samples.tab.client.resources.AppResources::styles()();
    }
    return null;
  }-*/;
}
