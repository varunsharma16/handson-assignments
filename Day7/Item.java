package org.hsbc.item;



	public class Item {
		
		
		private  int itemId;
		private String name;
		private int price;
		private int ratings;
		
		public Item() {
			super();
		}
		public Item(int itemId, String name, int price, int ratings) {
			super();
			this.itemId = itemId;
			this.name = name;
			this.price = price;
			this.ratings = ratings;
		}
		public int getItemId() {
			return itemId;
		}
		public void setItemId(int itemId) {
			this.itemId = itemId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getRatings() {
			return ratings;
		}
		public void setRatings(int ratings) {
			this.ratings = ratings;
		}
		@Override
		public String toString() {
			return "Coll [itemId=" + itemId + ", name=" + name + ", price=" + price + ", ratings=" + ratings + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + itemId;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Item other = (Item) obj;
			if (itemId != other.itemId)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		
		
		
		
	}

