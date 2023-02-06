class Facade {
    public static void makeOrder() {
        DeliverOrder.Find.FindingOrder();
        Collect.collectingOrder();
        FindDeliverer.findingDeliverer();
        DeliverOrder.deliveringOrder();
    }
}
