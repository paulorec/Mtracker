package com.paulo.call_hierarchy_exporter;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;

public class ExportWizard implements org.eclipse.ui.IExportWizard {
	private static final String WINDOW_TITLE = "Call hierarchy exporter";
	private IWizardPage[] pages;

	private Composite container;
	private Text text1;

	@Override
	public void init(IWorkbench iWorkBench, IStructuredSelection structuredSelection) {

		System.out.println("init");
	}

	@Override
	public void addPages() {

		IWizardPage page1 = new StartingWizardPage(this);
		pages = new IWizardPage[] { page1 };
	}

	@Override
	public boolean canFinish() {
		System.out.println("canFinish");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void createPageControls(Composite parent) {

	}

	@Override
	public void dispose() {
		System.out.println("dispose");

	}

	@Override
	public IWizardContainer getContainer() {
		return this.wizardContainer;
	}

	@Override
	public Image getDefaultPageImage() {
		System.out.println("getDefaultPageImages");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IDialogSettings getDialogSettings() {
		System.out.println("getDialogSettings");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IWizardPage getNextPage(IWizardPage arg0) {
		System.out.println("getNextPage");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IWizardPage getPage(String pageName) {

		for (IWizardPage wizardPage : getPages()) {
			if (wizardPage.getName().equals(pageName)) {
				return wizardPage;
			}
		}
		throw new RuntimeException("page " + pageName + " not found");
	}

	@Override
	public int getPageCount() {
		System.out.println("getPageCount");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IWizardPage[] getPages() {
		return pages;
	}

	@Override
	public IWizardPage getPreviousPage(IWizardPage arg0) {
		System.out.println("getPreviousPage");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IWizardPage getStartingPage() {
		return getPage(StartingWizardPage.PAGE_NAME);
	}

	@Override
	public RGB getTitleBarColor() {
		System.out.println("getTitleBarColors");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWindowTitle() {
		return WINDOW_TITLE;
	}

	@Override
	public boolean isHelpAvailable() {
		System.out.println("isHelpAvailable");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean needsPreviousAndNextButtons() {
		System.out.println("needPreviousAndNextButtons");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean needsProgressMonitor() {
		System.out.println("needsProgressMonitor");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean performCancel() {
		System.out.println("performCancel");
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean performFinish() {
		System.out.println("performFinish");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setContainer(IWizardContainer iWizardContainer) {

		this.wizardContainer = iWizardContainer;
	}

	private IWizardContainer wizardContainer;

}
