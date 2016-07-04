package com.aspose.pdf.examples.AsposePdf.Forms;

import com.aspose.pdf.examples.Utils;

public class FillFormField
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(FillFormField.class);
        // Open a document
        com.aspose.pdf.Document pdfDocument = new com.aspose.pdf.Document(dataDir+ "input.pdf");

        // Get a field
        com.aspose.pdf.TextBoxField textBoxField = (com.aspose.pdf.TextBoxField)pdfDocument.getForm().get("textbox1");

        //Set the field value
        textBoxField.setValue("Value of TextField");

        // Save the updated document
        pdfDocument.save(dataDir+ "output.pdf");
        
    }
}




