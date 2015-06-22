package com.paulo.call_hierarchy_exporter;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;

public class ExportWizard implements org.eclipse.ui.IExportWizard {

	@Override
	public void init(IWorkbench arg0, IStructuredSelection arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPages() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean canFinish() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void createPageControls(Composite arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public IWizardContainer getContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image getDefaultPageImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IDialogSettings getDialogSettings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IWizardPage getNextPage(IWizardPage arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IWizardPage getPage(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPageCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IWizardPage[] getPages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IWizardPage getPreviousPage(IWizardPage arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IWizardPage getStartingPage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RGB getTitleBarColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWindowTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isHelpAvailable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean needsPreviousAndNextButtons() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean needsProgressMonitor() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean performCancel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setContainer(IWizardContainer arg0) {
		// TODO Auto-generated method stub

	}

}
