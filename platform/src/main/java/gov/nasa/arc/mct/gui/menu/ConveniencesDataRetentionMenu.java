/*******************************************************************************
 * Mission Control Technologies, Copyright (c) 2009-2012, United States Government
 * as represented by the Administrator of the National Aeronautics and Space 
 * Administration. All rights reserved.
 *
 * The MCT platform is licensed under the Apache License, Version 2.0 (the 
 * "License"); you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
 * License for the specific language governing permissions and limitations under 
 * the License.
 *
 * MCT includes source code licensed under additional open source licenses. See 
 * the MCT Open Source Licenses file included with this distribution or the About 
 * MCT Licenses dialog available at runtime from the MCT Help menu for additional 
 * information. 
 *******************************************************************************/
package gov.nasa.arc.mct.gui.menu;

import gov.nasa.arc.mct.gui.ActionContext;
import gov.nasa.arc.mct.gui.ContextAwareMenu;
import gov.nasa.arc.mct.gui.MenuItemInfo;
import gov.nasa.arc.mct.gui.MenuItemInfo.MenuItemType;

import java.util.Arrays;

/**
 * Export submenu under "Conveniences"
 */
@SuppressWarnings("serial")
public abstract class ConveniencesDataRetentionMenu extends ContextAwareMenu {    
    
    private static final String DATA_RETENTION_ITEMS_EXT = "/conveniences/dataretention.ext";
    
    public ConveniencesDataRetentionMenu(String extension) {
        super("Data Retention", new String[]{ extension });
    }
    
    @Override
    public boolean canHandle(ActionContext context) {
        return true;
    }

    /**
     * Data Retention submenu items
     */
    public static class ConveniencesDataRetentionItemsMenu extends ConveniencesDataRetentionMenu {    

        public ConveniencesDataRetentionItemsMenu() {
            super(DATA_RETENTION_ITEMS_EXT);
        }

        @Override
        protected void populate() {
            addMenuItemInfos(DATA_RETENTION_ITEMS_EXT, Arrays.asList(
                            new MenuItemInfo("DATA_RETENTION_ACTION", MenuItemType.RADIO_GROUP)
                        ));
        }
    }
}
