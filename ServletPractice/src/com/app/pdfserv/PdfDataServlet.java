package com.app.pdfserv;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

/**
 * Servlet implementation class PdfDataServlet
 */
public class PdfDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PdfDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/pdf");
		response.addHeader("Content-Disposition", "attachment;filename=mydata.pdf");
		
		/*//1 create one document
		Document doc = new Document();
		*/
		
		try {
			
			//1 create one document
			Document doc = new Document();
			
			//get write over document
			PdfWriter.getInstance(doc, response.getOutputStream());
			
			//open dac
			doc.open();
			
			//4 write data
			doc.add(new Paragraph("Hello Pdf"));
			
			//table with 2 columns
			
			PdfPTable t = new PdfPTable(2);
			t.addCell("S1No");
			t.addCell("Name");
			t.addCell("101");t.addCell("Ashok");
			t.addCell("102");t.addCell("Naveen");
			doc.add(t);
			//close doc
			doc.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
