package test.fsi.view.skins;

import java.util.ListResourceBundle;

public class HrmsSkinBundle extends ListResourceBundle {
  public HrmsSkinBundle() {
    super();
  }
  
  @Override
  protected Object[][] getContents() {
    return new Object[][] {
      {"af_panelSplitter.TIP_COLLAPSE", "Collapse pane"},
      {"af_panelSplitter.TIP_RESTORE", "Restore pane"}
    };
  }  
}
