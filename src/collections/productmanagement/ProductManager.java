 package collections.productmanagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {

    public static void main(String[] args) {

        // 🔹 Step 1: Create a dynamic list of products
        ArrayList<String> products = new ArrayList<>();

        products.add("Samsung");
        products.add("Lenovo");
        products.add("Oppo");
        products.add("Poco");
        products.add("GooglePixel");
        products.add("Redmi");

        System.out.println("Initial Products Added:\n" + products);

        // 🔹 Step 2: Add another list of stock (new arrivals)
        List<String> newStock = Arrays.asList("Samsung", "Redmi", "Lava", "Nokia", "Jio");
        products.addAll(3, newStock);
        System.out.println("\nNew Stock to Merge:\n" + newStock);
        System.out.println("\nAfter Merging New Stock:\n" + products);

        // 🔹 Step 3: Remove a product
        boolean isRemoved = products.remove("Jio");
        System.out.println("\nRemoved 'Jio'? " + (isRemoved ? "Yes" : "No"));
        System.out.println("Current Stock:\n" + products);

        // 🔹 Step 4: Access elements by index
        System.out.println("\nFirst Product in Stock: " + products.get(0));
        System.out.println("'Samsung' first index: " + products.indexOf("Samsung"));
        System.out.println("'Samsung' last index: " + products.lastIndexOf("Samsung"));

        // 🔹 Step 5: Update an existing product
        // set(index, element) ➜ Replaces an element at a given position
        products.set(2, "OnePlus");
        System.out.println("\nUpdated product at index 2 to 'OnePlus':\n" + products);

        // 🔹 Step 6: Check if the list is empty
        System.out.println("\nIs product list empty? " + (products.isEmpty() ? "Yes" : "No"));

        // 🔹 Step 7: Check if a particular product or batch exists
        System.out.println("\nIs 'Redmi' available? " + (products.contains("Redmi") ? "Yes" : "No"));
        System.out.println("Are all new stock items still available? "
                + (products.containsAll(newStock)
                        ? "Yes, stock fully available"
                        : "No, some items were removed"));

        // 🔹 Step 8: Sort the products alphabetically
        // sort(Comparator.naturalOrder()) ➜ Ascending order
        Collections.sort(products, Comparator.naturalOrder());
        System.out.println("\nSorted Products (A → Z):\n" + products);

        // 🔹 Step 9: Convert all product names to uppercase
        // replaceAll(UnaryOperator) ➜ Applies transformation to each element
        products.replaceAll(String::toUpperCase);
        System.out.println("\nConverted all product names to UPPERCASE:\n" + products);

        // 🔹 Step 10: Show a subset of products
        // subList(fromIndex, toIndex) ➜ Returns a view of part of the list
        List<String> featuredProducts = products.subList(2, 6);
        System.out.println("\nFeatured Products (Index 2–5):\n" + featuredProducts);

        // 🔹 Step 11: Retain only certain products
        // retainAll(Collection) ➜ Keeps only elements that are also in the specified collection
        List<String> keepList = Arrays.asList("SAMSUNG", "REDMI", "ONEPLUS");
        products.retainAll(keepList);
        System.out.println("\nRetained Only Selected Products:\n" + products);

        // 🔹 Step 12: Remove all elements from another list
        // removeAll(Collection) ➜ Removes all elements that exist in the given collection
        List<String> toRemove = Arrays.asList("REDMI");
        products.removeAll(toRemove);
        System.out.println("\nAfter Removing 'REDMI':\n" + products);

        // 🔹 Step 13: Optimize internal storage capacity
        products.trimToSize();

        // 🔹 Step 14: Check size and clear the list
        System.out.println("\nTotal Products Left: " + products.size());
        products.clear(); // removes all elements
        System.out.println("\nAll Products Cleared!");
        System.out.println("Is list empty now? " + (products.isEmpty() ? "Yes" : "No"));
    }
}
