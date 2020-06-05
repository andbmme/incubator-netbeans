/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.glassfish.javaee.templates;

import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.openide.WizardDescriptor;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;

import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ui.templates.support.Templates;


/*
 * Adapted from SunDDWizardPanel
 * @author Vince Kraemer
 */
public class WebLogicDDWizardPanel implements WizardDescriptor.Panel {
    
    /**
     * The visual component that displays this panel. If you need to access the
     * component from this class, just use getComponent().
     */
    private final Set<ChangeListener> listeners = new HashSet<ChangeListener>(1);
    private WebLogicDDVisualPanel component = new WebLogicDDVisualPanel();
    private WizardDescriptor wizardDescriptor;
    private Project project;
    
    public WebLogicDDWizardPanel() {
        component.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                fireChangeEvent();
            }
        });
    }
    
//    FileObject getSelectedLocation() {
    File getSelectedLocation() {
        return component.getSelectedLocation();
    }
    
    Project getProject() {
        return project;
    }
    
    String getFileName() {
        return component.getFileName();
    }
    
    @Override
    public Component getComponent() {
        return component;
    }
    
    @Override
    public HelpCtx getHelp() {
        // Show no Help button for this panel:
        return HelpCtx.DEFAULT_HELP;
        // If you have context help:
        // return new HelpCtx(SampleWizardPanel1.class);
    }
    
    @Override
    public boolean isValid() {

        String sunDDFileName = component.getFileName();
        if(sunDDFileName == null) {
            wizardDescriptor.putProperty(WizardDescriptor.PROP_ERROR_MESSAGE,  // NOI18N
                    NbBundle.getMessage(WebLogicDDWizardPanel.class,"ERR_NoJavaEEModuleType")); //NOI18N
            return false;
        }
        
        File location = component.getSelectedLocation();
        if(location == null) {
            wizardDescriptor.putProperty(WizardDescriptor.PROP_ERROR_MESSAGE,  // NOI18N
                    NbBundle.getMessage(WebLogicDDWizardPanel.class,"ERR_NoValidLocation", sunDDFileName)); //NOI18N
            return false;
        }

        File sunDDFile = component.getFile();
        if(sunDDFile.exists()) {
            wizardDescriptor.putProperty(WizardDescriptor.PROP_ERROR_MESSAGE,  // NOI18N
                    NbBundle.getMessage(WebLogicDDWizardPanel.class,"ERR_FileExists", sunDDFileName)); //NOI18N
            return false;
        }
        
        return true;
    }
    
    @Override
    public final void addChangeListener(ChangeListener l) {
        synchronized (listeners) {
            listeners.add(l);
        }
    }
    
    @Override
    public final void removeChangeListener(ChangeListener l) {
        synchronized (listeners) {
            listeners.remove(l);
        }
    }
    
    protected final void fireChangeEvent() {
        Iterator<ChangeListener> it;
        synchronized (listeners) {
            it = new HashSet<ChangeListener>(listeners).iterator();
        }
        ChangeEvent ev = new ChangeEvent(this);
        while (it.hasNext()) {
            it.next().stateChanged(ev);
        }
    }
    
    // You can use a settings object to keep track of state. Normally the
    // settings object will be the WizardDescriptor, so you can use
    // WizardDescriptor.getProperty & putProperty to store information entered
    // by the user.
    @Override
    public void readSettings(Object settings) {
        wizardDescriptor = (WizardDescriptor) settings;
        if (project == null) {
            project = Templates.getProject(wizardDescriptor);
            component.setProject(project);
        }
    }
    
    @Override
    public void storeSettings(Object settings) {
    }
    
}

