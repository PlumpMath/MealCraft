package com.github.jascase901.mealcraft.test;

import com.github.jascase901.mealcraft.db.IngredientDb;
import com.github.jascase901.mealcraft.db.RecipeBookDb;
import com.github.jascase901.mealcraft.db.RecipeToIngredientsDb;

import junit.framework.*;
import java.util.ArrayList;

public class RecipeToIngredientDbTester extends TestCase{
    private IngredientDb ingr;
    private RecipeBookDb recipeDb;
    private RecipeToIngredientsDb rToIng;
    private ArrayList<String> a;
    protected void setUp() throws Exception{
        ingr = new IngredientDb(); 
	recipeDb = new RecipeBookDb();
	rToIng= new RecipeToIngredientsDb();
    }
   
  protected void tearDown() throws Exception{
  	// put common cleanup code in here
      ingr.close(); 


  }

    

    public void testGetQuantity1() throws Exception {
	rToIng.addRelation("bacon stew", "bacon", 7, "lbs");
	rToIng.addRelation("bacon stew", "beer", 2, "liters");
	//	String row = rToIng.getRecipeId()+" ";
	    //+rToIng.getIngredientId()+" "+rToIng.getIngredientQuantity" "+rToIng.getUnits();
	ArrayList<String>  rs;
	rs=rToIng.getRecipesThatRequire("bacon");
	double quant = rToIng.getQuantity("bacon stew", "bacon");
	assertEquals(7.0,  quant);
	ingr.close();
  }
    public void testGetUnits1() throws Exception {
	rToIng.addRelation("bacon stew", "bacon", 7, "lbs");
	String units = rToIng.getUnits("bacon stew", "bacon");
	assertEquals("lbs",  units);
	ingr.close();
    }
    /*   public void testAdd2() throws Exception {
	Ingredient bananna = new Ingredient("bananna", 54.0);
	
	ingr.addIngredient(bananna);
	assertEquals(54.0, ingr.getPrice("bananna"));
	ingr.close();
  }
    public void testAdd3() throws Exception {
	Ingredient pork = new Ingredient("pork", 54);
	
	ingr.addIngredient(pork, 32, "cups");

	assertEquals(54, ingr.getCalories("pork"));
	ingr.close();
  }
    public void testAdd4() throws Exception {
	Ingredient beer = new Ingredient("beer", 54, 54.0);
	
	ingr.addIngredient(beer, 1, "liter");
	double amount = ingr.getQuantity("beer").getAmount();
	assertEquals(1.0, amount);
	ingr.close();
      
  }
    public void testSetQuantity1() throws Exception{
	Ingredient bacon = new Ingredient("bacon", 54, 54.0);

	ingr.setQuantity("bacon", 3, "lbs");
	double amount = ingr.getQuantity("bacon").getAmount();
	assertEquals(3.0, amount);
	ingr.close();
    }
    public void testSetQuantity2() throws Exception{
	Ingredient bacon = new Ingredient("bacon", 54, 54.0);

	ingr.setQuantity("bacon", 3, "lbs");
	String units = ingr.getQuantity("bacon").getUnits();
	assertEquals("lbs" ,  units);
	ingr.close();
    }
    public void testGetId1() throws Exception{
	int id = ingr.getId("bacon");
	assertEquals(1, id);
    }
  public void testGetId2() throws Exception{
	int id = ingr.getId("bananna");
	assertEquals(2, id);
    }



    public void testprintAll() throws Exception{
	
	assertEquals("1 bacon 54 54.0 1\n1 potatoes 20 20.0 1\n",ingr.printAll());
	
	}*/
}