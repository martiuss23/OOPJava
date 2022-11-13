package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductManagement {
	class InnerProduct{
		private Product product;
		private int imported;
		private int unitPrice;
		private int exported;
		
		public InnerProduct(Product product, int imported, int unitPrice, int exported) {
			this.product = product;
			this.imported = imported;
			this.unitPrice = unitPrice;
			this.exported = exported;
		}	
		
		public InnerProduct(InnerProduct innerProduct) {
			this.product = innerProduct.product;
			this.imported = innerProduct.imported;
			this.unitPrice = innerProduct.unitPrice;
			this.exported = innerProduct.exported;
		}
		
		private long getImportedCost() {
			return imported * unitPrice;
		}
		
		private long getExportedCost() {
			return  Math.round(exported * unitPrice *(1 +  product.getInterest()));
		}
		
		@Override
		public String toString() {
			return product.toString() + " " + getImportedCost() + " " + getExportedCost();
		}
		
	}
	
	private HashMap<String, Product> existProducts;
	private List<InnerProduct> listBills;
	
	public ProductManagement() {
		existProducts = new HashMap<>();
		listBills = new ArrayList<>();
	}
	
	void addProduct(Product product){
		Product putProduct = new Product(product);
		existProducts.put(putProduct.getId(), putProduct);
	}
	
	void addBill(String id, int imported, int unitPrice, int exported) {
		listBills.add(new InnerProduct(new Product(existProducts.get(id)), imported, unitPrice, exported));
	}
	
	List<InnerProduct> getAllBills(){
		List<InnerProduct> bills = new ArrayList<>();
		listBills.forEach((bill)->{
			bills.add(new InnerProduct(bill));
		});
		return bills;
	}
	
}
