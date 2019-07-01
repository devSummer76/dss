/**
 * DSS - Digital Signature Services
 * Copyright (C) 2015 European Commission, provided under the CEF programme
 * 
 * This file is part of the "DSS - Digital Signature Services" project.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package eu.europa.esig.dss.validation.reports;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.europa.esig.dss.DSSException;
import eu.europa.esig.dss.jaxb.detailedreport.XmlDetailedReport;
import eu.europa.esig.dss.jaxb.diagnostic.XmlDiagnosticData;
import eu.europa.esig.dss.jaxb.simplereport.SimpleReportFacade;
import eu.europa.esig.dss.jaxb.simplereport.XmlSimpleReport;
import eu.europa.esig.jaxb.validationreport.ValidationReportFacade;
import eu.europa.esig.jaxb.validationreport.ValidationReportType;

/**
 * This class is a container for all reports generated by the signature validation
 * process: diagnostic data, detailed report and simple report.
 */
public class Reports extends AbstractReports {

	private static final Logger LOG = LoggerFactory.getLogger(Reports.class);

	private final SimpleReport simpleReportWrapper;

	private String xmlSimpleReport;
	
	private final ValidationReportType etsiValidationReport;
	
	private String xmlEtsiValidationReport;

	/**
	 * This is the default constructor to instantiate this container.
	 *
	 * @param diagnosticDataJaxb
	 *                           the JAXB {@code XmlDiagnosticData}
	 * @param detailedReport
	 *                           the JAXB {@code XmlDetailedReport}
	 * @param simpleReport
	 *                           the JAXB {@code XmlSimpleReport}
	 * @param validationReport
	 *                           the JAXB {@code ValidationReportType}
	 */
	public Reports(final XmlDiagnosticData diagnosticDataJaxb,
			final XmlDetailedReport detailedReport, final XmlSimpleReport simpleReport,
			final ValidationReportType validationReport) {
		super(diagnosticDataJaxb, detailedReport);
		this.simpleReportWrapper = new SimpleReport(simpleReport);
		this.etsiValidationReport = validationReport;
	}

	/**
	 * This method returns the wrapper to manipulate the JAXB SimpleReport
	 * 
	 * @return the wrapper {@code SimpleReport}
	 */
	public SimpleReport getSimpleReport() {
		return simpleReportWrapper;
	}

	/**
	 * This method returns the JAXB SimpleReport
	 * 
	 * @return the JAXB {@code XmlSimpleReport}
	 */
	public XmlSimpleReport getSimpleReportJaxb() {
		return simpleReportWrapper.getJaxbModel();
	}

	/**
	 * This method returns the JAXB EtsiValidationReport
	 * 
	 * @return the JAXB {@code ValidationReportType}
	 */
	public ValidationReportType getEtsiValidationReportJaxb() {
		return etsiValidationReport;
	}
	
	/**
	 * This method returns the XML representation of the JAXB SimpleReport String
	 * 
	 * @return a String with the XML content of the JAXB {@code SimpleReport}
	 */
	@Override
	public String getXmlSimpleReport() {
		if (xmlSimpleReport == null) {
			try {
				xmlSimpleReport = SimpleReportFacade.newFacade().marshall(getSimpleReportJaxb(), validateXml);
			} catch (Exception e) {
				String message = "Unable to generate string value for the simple report : ";
				if (validateXml) {
					throw new DSSException(message, e);
				} else {
					LOG.error(message, e);
				}
			}
		}
		return xmlSimpleReport;
	}

	/**
	 * This method returns the XML representation of the JAXB ETSI Validation Report String
	 * 
	 * @return a String with the XML content of the JAXB {@code ValidationReportType}
	 */
	public String getXmlValidationReport() {
		if (xmlEtsiValidationReport == null) {
			try {
				xmlEtsiValidationReport = ValidationReportFacade.newFacade().marshall(getEtsiValidationReportJaxb(), validateXml);
			} catch (Exception e) {
				String message = "Unable to generate string value for the etsi validation report : ";
				if (validateXml) {
					throw new DSSException(message, e);
				} else {
					LOG.error(message, e);
				}
			}
		}
		return xmlEtsiValidationReport;
	}

	@Override
	public void print() {
		System.out.println("----------------Diagnostic data-----------------");
		System.out.println(getXmlDiagnosticData());
		System.out.println("----------------Validation report---------------");
		System.out.println(getXmlDetailedReport());
		System.out.println("----------------Simple report-------------------");
		System.out.println(getXmlSimpleReport());
		System.out.println("----------------ETSI validation report-------------------");
		System.out.println(getXmlValidationReport());
		System.out.println("------------------------------------------------");
	}

}
