public class InvoicePrinter {
    public InvoicePrinter(Invoice invoice) {
    }


    public static void invoicePrinter(Invoice invoice){
        System.out.println("FACTURA: \nCódigo: " + invoice.getInvoiceCode() + " Fecha: " + invoice.getInvoiceDate());
        System.out.println("Cliente: " + invoice.getCustomer().getCustomerCode() + "|" +  invoice.getCustomer().getName() + "|" +  invoice.getCustomer().getPostalAdress() + "|" +   invoice.getCustomer().getPopulation() + "|" +   invoice.getCustomer().getProvince() + "|" + invoice.getCustomer().getEmail());
        for (Item item : invoice.getItems()){
            System.out.println("Linea de venta (producto/servicio: )" + item.getName() + "|" + item.getPrice() + "|" + item.getIvaType() + "|" + invoice.getTotal());
        }

    }
}
