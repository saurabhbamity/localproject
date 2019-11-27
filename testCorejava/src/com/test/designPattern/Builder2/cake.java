package com.test.designPattern.Builder2;

import java.util.List;

public class cake {
    
    
    private final int size;
    private final int weight;
    private final int fuitquantity;
    private final boolean eggible;
    private final List<FruitKind> fruitList; 
    
    public static class Builder {
        
        private int size;
        private int weight;
        private int fuitquantity;
        private boolean eggible;
        private List<FruitKind> fruitList; 
        
        public Builder size(int sizee){
            this.size=sizee;
            return this;
        }
        
        public Builder eggible(Boolean egg){
            this.eggible=egg;
            return this;
        }
        
        public Builder weight(int weighty){
            this.weight=weighty;
            return this;
        }
        
        public Builder addFuitquantity(int fuitquantityy){
            this.fuitquantity=fuitquantityy;
            return this;
        }
        
        public Builder fruitList(List<FruitKind> fruitLists){
            this.fruitList=fruitLists;
            return this;
        }
        
        public cake build(){
            return new cake(this);
        }
        
    }
    
    public cake(Builder build ){
        this.size=build.size;
        this.weight=build.weight;
        this.fuitquantity=build.fuitquantity;
        this.eggible=build.eggible;
        this.fruitList=build.fruitList;
        
        
    }
    
    public int getSize() {
		return size;
	}



	public int getWeight() {
		return weight;
	}



	public int getFuitquantity() {
		return fuitquantity;
	}



	public boolean isEggible() {
		return eggible;
	}



	public List<FruitKind> getFruitList() {
		return fruitList;
	}



	
    
    @Override
    public String toString() {
        return "Cake{" + "size=" + size + ", weight=" + weight + ", fuitquantity=" + fuitquantity + ", egg=" + eggible + ", fruitList=" + fruitList.toString()+ '}';
    }


}
