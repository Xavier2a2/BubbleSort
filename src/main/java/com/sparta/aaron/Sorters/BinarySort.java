package com.sparta.aaron.Sorters;


import com.sparta.aaron.Starters.Printer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BinarySort extends SortManager implements BinaryTree {
private static Node root = null;
private static int nodeCount = 0;

    private static Logger logger = LogManager.getLogger(Logger.class);

    @Override
    public int getRootElement() {

        //return the root element

        return root.value;
    } // Done Works

    @Override
    public int getNumberOfElements() {
        return nodeCount;
    } // Done Works

    @Override
    public void addElement(int element) {
        //Create a root number if there isn't one already
        if (root == null){
            root = Node.createNode(root, element);
        }

        // If root already exists, starting from the root go through the
        //child's until a space is found
        Node.createNode(root, element);
        //
    } // Done Works

    @Override
    public void addElements(int[] elements) {

        for(int element : elements){
            addElement(element);
        }

    } // Done Works

    @Override
    public boolean findElement(int value) {
        return Node.isNode(root, value);
    } // Done Works

    @Override
    public int getLeftChild(int element) {

        if (!Node.isNode(root, element)){
            return 0;
        }

        Node childNode = null;
        try {
            childNode = Node.getChild(root, element, "left");
        }catch(ChildNotFoundException e){
            logger.error("Exception raised in getChild:: "+e.getMessage(), e);
//            e.printStackTrace();
        }catch (Exception e){
            logger.error("Exception raised in getChild:: "+e.getMessage(), e);
//            e.printStackTrace();
        }
        return childNode.value;


    } // Done Works

    @Override
    public int getRightChild(int element) {
        if (!Node.isNode(root, element)){
            return 0;
        }
        Node childNode = null;
        try {
            childNode = Node.getChild(root, element, "right");
        }catch(ChildNotFoundException e){
            logger.error("Exception raised in getChild "+e.getMessage(), e);
            e.printStackTrace();
        }catch (Exception e){
            logger.error("Exception raised in getChild "+e.getMessage(), e);
            e.printStackTrace();
        }
        return childNode.value;
    } // Done Works

    @Override
    public int[] getSortedTreeAsc() {
        return Node.getNodes(root);
    } // Done Works

    @Override
    public int[] getSortedTreeDesc() {
        int[] arrayOfInt = getSortedTreeAsc();
        int temp;
        for (int i =0; i < arrayOfInt.length/2; i++){
            temp = arrayOfInt[i];
            arrayOfInt[i] = arrayOfInt[arrayOfInt.length -1-i];
            arrayOfInt[arrayOfInt.length-1-i] = temp;
        }
        return arrayOfInt;
    } // Done Works

    @Override
    public void sort(int[] arrayToSort, String direction) {
        Printer.printIntArray(arrayToSort);
        addElements(arrayToSort);
        if (direction.equalsIgnoreCase("asc") ){
            Printer.printIntArray(getSortedTreeAsc());
        } else {
            Printer.printIntArray(getSortedTreeDesc());
        }
        Printer.printMessage("Sorted using the Binary Tree Sort");
    }


    static class Node {
        int value;
        Node left;
        Node right;

        // Node constructor
        public Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }


        public static Node createNode(Node current, int element){
            //If there is no current node, create a new node
            if ( current == null) {
                nodeCount +=1;
                return new Node(element);
            }

            if (element < current.value){
                current.left = createNode(current.left, element);
            } else if (element > current.value) {
                current.right = createNode(current.right, element);
            } else {
                return current;
            }

            return current;
        }

        private static boolean isNode(Node current, int element){

            boolean isNode = false;
            if (current == null){
                return false;
            }
            if (current.value > element){
                isNode = isNode(current.left, element);
            } else if (current.value < element){
                isNode = isNode(current.right, element);
            } else if (current.value == element){
                isNode = true;
            }
            return isNode;

        }

        private static Node getChild(Node current, int element, String direction) throws ChildNotFoundException{

            // First we need to find the element
            //If the the current node is not equal to our element we continue in the tree
            if(current.value < element){
                return getChild(current.right, element, direction);
            } else if (current.value > element){
                return getChild(current.left, element, direction);
            }

            //If the value of the current node is the same as the element we return the child
            else if (current.value == element){

                if (direction.equalsIgnoreCase("left")){
                    if (current.left == null){
                        throw new ChildNotFoundException("This node has no child");
                    }else return current.left;

                } else if (direction.equalsIgnoreCase("right")){
                    if(current.right == null){
                        throw new ChildNotFoundException("This node has no child");
                    }else return current.right;

                }
            }

            return null;


        }

        private static int[] getNodes(Node current) {
            // Get the lower valued nodes first
            int[] nodesFromLeft = null;
            if (current.left != null){
                nodesFromLeft = getNodes(current.left);
            }

            //Get the higher valued nodes next
            int[] nodesFromRight = null;
            if (current.right != null){
                nodesFromRight = getNodes(current.right);
            }

            int[] currentNodes;
            // Add the lower valued nodes to the current list of nodes
            if (nodesFromLeft != null && nodesFromRight != null) {
                 currentNodes = new int[nodesFromLeft.length + nodesFromRight.length + 1];
            } else if (nodesFromLeft != null){
                 currentNodes = new int[nodesFromLeft.length + 1];
            } else if(nodesFromRight != null){
                 currentNodes = new int[nodesFromRight.length + 1];
            } else {
                 currentNodes = new int[1];
            }

            int i = 0;
            if (nodesFromLeft != null) {
                for (int nodeValue : nodesFromLeft) {
                    currentNodes[i] = nodeValue;
                    i++;
                }
            }

            currentNodes[i] = current.value;
            i++;

            // Add the higher valued nodes to the current list of nodes
            if (nodesFromRight != null){
                for (int nodeValue : nodesFromRight) {
                    currentNodes[i] = nodeValue;
                    i++;
                }
            }


            return currentNodes;
        }
    }
}
